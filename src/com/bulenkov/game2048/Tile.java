/*
 * Copyright 1998-2018 Konstantin Bulenkov http://bulenkov.com/about
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bulenkov.game2048;

import java.awt.Color;

/**
 * Created by Pankaj Wahane on 22-02-2018.
 */
public class Tile {

  int value;

  public Tile() {
    this(0);
  }

  public Tile(int num) {
    value = num;
  }

  public boolean isEmpty() {
    return value == 0;
  }

  public Color getForeground() {
    return value < 16 ? new Color(0x776e65) : new Color(0xf9f6f2);
  }

  public Color getBackground() {
    switch (value) {
      case 2:
        return new Color(0xeee4da);
      case 4:
        return new Color(0xede0c8);
      case 8:
        return new Color(0xf2b179);
      case 16:
        return new Color(0xf59563);
      case 32:
        return new Color(0xf67c5f);
      case 64:
        return new Color(0xf65e3b);
      case 128:
        return new Color(0xedcf72);
      case 256:
        return new Color(0xedcc61);
      case 512:
        return new Color(0xedc850);
      case 1024:
        return new Color(0xedc53f);
      case 2048:
        return new Color(0xedc22e);
    }
    return new Color(0xcdc1b4);
  }

  public int getValue() {
    return value;
  }
}
