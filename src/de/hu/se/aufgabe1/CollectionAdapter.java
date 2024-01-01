package de.hu.se.aufgabe1;

public class CollectionAdapter implements CollectionIterator {

    private CollectionImpl collection;

    public CollectionAdapter(CollectionImpl collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return collection.hasMoreElements();
    }

    @Override
    public String next() {
        return collection.nextElement();
    }
}
