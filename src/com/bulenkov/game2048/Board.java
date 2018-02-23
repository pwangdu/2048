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

/**
 * Created by Pankaj Wahane on 22-02-2018.
 */
public interface Board {

  boolean isWon();

  boolean isLost();

  int getScore();

  Tile[] getTiles();

  void setAutoPlay(boolean autoPlay);

  void resetGame();

  void moveLeft();

  void moveRight();

  void moveUp();

  void moveDown();
}
