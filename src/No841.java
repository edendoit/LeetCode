import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class No841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet();
        visited.add(0);

        Stack<Integer> stack = new Stack();
        stack.add(0);

        while(!stack.isEmpty()) {
            List<Integer> keys = rooms.get(stack.pop());
            for(int key : keys) {
                if(!visited.contains(key)) {
                    visited.add(key);
                    stack.add(key);
                }
            }
        }
        return visited.size() == rooms.size();
    }
}
// https://www.youtube.com/watch?v=oYeGiShGn2k