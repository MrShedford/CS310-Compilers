package Lab1;
import java.util.*;

public class task3 {
	public static void main(String[] args){
		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		//This for loop created two singly linked lists of even and odd numbers respectively
		for(int i =3 ; i<=20;i++){
			if(i%2==0){
				l2.next = new ListNode(i);
			}
			else{
				l1.next = new ListNode(i);
			}
			
		}
		ListNode answer = mergeTwoLists(l1,l2);
		System.out.println("Merged the two arrays: " + answer.val + " followed by " + answer.next.val  );
		
		
	}
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	    ListNode head = new ListNode(0);
	    ListNode p = head;
	 
	    while(l1!=null||l2!=null){
	        if(l1!=null&&l2!=null){
	            if(l1.val < l2.val){
	                p.next = l1;
	                l1=l1.next;
	            }else{
	                p.next=l2;
	                l2=l2.next;
	            }
	            p = p.next;
	        }else if(l1==null){
	            p.next = l2;
	            break;
	        }else if(l2==null){
	            p.next = l1;
	            break;
	        }
	    }
	 
	    return head.next;
	}
}