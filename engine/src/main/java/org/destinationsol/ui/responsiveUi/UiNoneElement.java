/*
 * Copyright 2018 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.destinationsol.ui.responsiveUi;

import org.destinationsol.SolApplication;
import org.destinationsol.ui.SolInputManager;

public class UiNoneElement extends AbstractUiElement {
    @Override
    public UiNoneElement setPosition(int x, int y) {
        return this;
    }

    @Override
    public UiNoneElement setParent(UiContainerElement parent) {
        return this;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void draw() {

    }

    @Override
    public boolean maybeFlashPressed(int keyCode) {
        return false;
    }

    @Override
    public boolean maybeFlashPressed(SolInputManager.InputPointer inputPointer) {
        return false;
    }

    @Override
    public boolean update(SolInputManager.InputPointer[] inputPointers, boolean cursorShown, boolean canBePressed, SolInputManager inputMan, SolApplication cmp) {
        return false;
    }

    @Override
    public void blur() {

    }
}
