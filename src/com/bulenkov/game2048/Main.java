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

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Created by Pankaj Wahane on 22-02-2018.
 */
public class Main {

  static Random random = new Random();

  public static void main(String[] args) throws InterruptedException {
    final Board board = new BoardImpl();
    renderGame((BoardImpl) board);
//    board.setAutoPlay(true);
//    while (!board.isWon() && !board.isLost()) {
//      int[] state = toIntegerArray(board.getTiles());
//      print(state);
//      int move = random.nextInt(4);
//      switch (move) {
//        case 0:
//          board.moveLeft();
//          break;
//        case 1:
//          board.moveRight();
//          break;
//        case 2:
//          board.moveUp();
//          break;
//        case 3:
//          board.moveDown();
//          break;
//      }
//    }
  }

  private static void print(int[] state) {
    System.out.print("[ ");
    for (int i = 0; i < state.length; i++) {
      System.out.print(state[i] + " ");
    }
    System.out.println("]");
  }

  private static int[] toIntegerArray(Tile[] tiles) {
    final int[] integers = new int[tiles.length];
    for (int i = 0; i < tiles.length; i++) {
      integers[i] = tiles[i].getValue();
    }
    return integers;
  }

  private static void renderGame(BoardImpl gameImpl) {
    JFrame frame = new JFrame();
    frame.setTitle("2048 Board");
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(340, 400);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    final BoardImpl comp = gameImpl;
    frame.add(comp);
    frame.setVisible(true);
  }
}
