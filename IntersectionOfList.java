import java.util.LinkedList;
import java.util.List;

public class IntersectionOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> a = new LinkedList<List<Integer>>();
		List<Integer> l1 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(1);
		List<Integer> l2 = new LinkedList<Integer>();
		l2.add(1);
		l2.add(3);
		l2.add(4);
		l2.add(5);
		List<Integer> l3 = new LinkedList<Integer>();
		l3.add(1);
		l3.add(2);
		l3.add(5);
		a.add(l1);
		a.add(l2);
		a.add(l3);
		System.out.println((a));
		System.out.println(getIntersection(a));
		System.out.println(getIntersectionWithoutRetainFunc(a));
		
	}
	public static List<Integer> getIntersection(List<List<Integer>> a){
		List<Integer> l = new LinkedList<Integer>();
		l = a.get(0);
		for(int i=1;i<a.size();i++){
			l.retainAll(a.get(i));
		}
		return l;
	}
	public static List<Integer> getIntersectionWithoutRetainFunc(List<List<Integer>> a){
		List<Integer> l = new LinkedList<Integer>();
		l = a.get(0);
		boolean flag = true;
		List<Integer> lRes = new LinkedList<Integer>();
		for(int i=0;i<l.size();i++){
			for(int j=1;j<a.size();j++){
				if(a.get(j).contains(l.get(i)))
					flag=true;
				else{
					flag=false;
					break;
				}
			}
			if(flag)
				lRes.add(l.get(i));
		}
		return lRes;
	}
}
