package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class StudentTreeSet implements Set<Student>,Iterable<Student> {
    protected Tree theTree;
    protected Node current;
    NodeIterator iterator;

    public StudentTreeSet(){
        this.theTree=new Tree();
    }

    @Override
    public int size() {
        return theTree.traverseInorder();
    }

    @Override
    public boolean isEmpty() {
        return theTree.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return theTree.find((Student) o);

    }

    @Override
    public Iterator<Student> iterator() {
        if (iterator == null){
        iterator=new NodeIterator(theTree.root);
        }
        return iterator;
    }

    @Override
    public Object[] toArray() {
        return theTree.getArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        System.out.println("Unsupported Operation");
        return null;
    }

    @Override
    public boolean add(Student student) {
        if(theTree.find(student)==false) {
            theTree.insert(student);
            return true;
        } else  { return false;}
    }

    @Override
    public boolean remove(Object o) {
        if(theTree.find((Student) o)==true) {
            System.out.println(theTree.deleteTreeNode(theTree.root, (Student) o));
            return true;
        } else  { return false;}
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        System.out.println("Unsupported Operation");
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Student> c) {
        for(Student element:c){
            this.add(element);
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        System.out.println("Unsupported Operation");
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        System.out.println("Unsupported Operation");
        return false;
    }

    @Override
    public void clear() {
        theTree.clearTree();
    }
}
