package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedListAlphabetically {
        public static void main(String[] args) {
                LinkedList<String> placesToVisit = new LinkedList<String>();

                addInOrder(placesToVisit, "Amsterdam");
                addInOrder(placesToVisit, "Denmark");
                addInOrder(placesToVisit, "Uruguay");
                addInOrder(placesToVisit, "Belgium");
                addInOrder(placesToVisit, "Dubai");

                printList(placesToVisit);
                System.out.println(placesToVisit.size());

        }

        private static void printList(LinkedList<String> linkedList) {
                Iterator<String> i = linkedList.iterator();
                while (i.hasNext())
                {
                        System.out.println("Visiting " + i.next());
                }
                System.out.println("The end");
        }

        private static boolean addInOrder(LinkedList<String> linkedList, String newCity)
        {
                ListIterator<String>stringListIterator = linkedList.listIterator();

                while (stringListIterator.hasNext()) {
                        int comparison = stringListIterator.next().compareTo(newCity);
                        if (comparison == 0)
                        {
                                System.out.println("fail");
                                return false;
                        } else if (comparison > 0) {
                                //newCIty  will appear before this one
                                stringListIterator.previous();
                                stringListIterator.add(newCity);
                                return true;
                        } else if (comparison < 0) {
                                //move onto next city
                        }
                }
                stringListIterator.add(newCity);
                return true;
        }


}
