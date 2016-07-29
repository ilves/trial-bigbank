/*
 * The MIT License
 *
 * Copyright (c) 2016 Taavi Ilves (https://github.com/ilves)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package ee.golive.dragon.solution;

import ee.golive.dragon.domain.Knight;
import ee.golive.dragon.domain.KnightSkill;

import java.util.Map;

/**
 * @author Taavi Ilves, Golive, ilves.taavi@gmail.com
 */
public class KnightValidator {

    private Knight knight;

    KnightValidator(Knight knight) {
        this.knight = knight;
    }

    /**
     * Checks if all skills are set and not null
     *
     * @return true if skills are not null, false otherwise
     */
    public boolean isSkillsSet() {
        Map<KnightSkill, Integer> skills = knight.getAllSkills();
        for (Integer points : skills.values()) {
            if (points == null) return false;
        }
        return true;
    }
}
