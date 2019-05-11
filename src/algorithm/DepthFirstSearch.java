package algorithm;

/*It needs lower memory as compared to BreadthFirstSearch
 * It follows one branch of the tree down as many level as possible and once the target node is found or reach the end 
 * and if haven't found the elements then
 * it will go back to its nearest ancestor and check it any unexplored child(other child of that parents) remains 
 * and so on it will check if not found then move back to root and follow another branch.
 * 
 *  * Ex:        9
 *          4        20
 *        1   6    15  170
 *    
 *    DFS: [9,4,1,6,20,15,170]
 *    
 *    BIG O -> Time complexity O(n) As they go to node at least once.
 *    DFS uses less Memory but isn't good to find the shortest path closer to Nodes or in tree/graph. also it gets slow as the depth of tree is higher
 *    DFS is better if we have additional info about the node and if its at lower level to the tree node then its good choice
 * */
public class DepthFirstSearch {

	public static void main(String[] args) {
		

	}

}
