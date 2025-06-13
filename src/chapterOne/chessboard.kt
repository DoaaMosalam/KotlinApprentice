package chapterOne
/* Suppose the squares on a chessboard are numbered left to right, top to bottom, with
0 being the top-left square and 63 being the bottom-right square. Rows are
numbered top to bottom, 0 to 7. Columns are numbered left to right, 0 to 7. Declare
a constant position and assign it a value between 0 and 63. Calculate the
corresponding row and column numbers and store the results in constants named
row and column.*/
fun main() {
     val position: Int = 32
     val row = position / 8
     val column = position % 8

}