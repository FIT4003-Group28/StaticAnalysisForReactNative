package com.facebook.jni;

import java.util.Iterator;
import java.util.Map;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class MapIteratorHelper {
    @com.facebook.k.a.a
    private final Iterator<Map.Entry> mIterator;
    @com.facebook.k.a.a
    private Object mKey;
    @com.facebook.k.a.a
    private Object mValue;

    @com.facebook.k.a.a
    public MapIteratorHelper(Map map) {
        this.mIterator = map.entrySet().iterator();
    }

    @com.facebook.k.a.a
    boolean hasNext() {
        if (this.mIterator.hasNext()) {
            Map.Entry next = this.mIterator.next();
            this.mKey = next.getKey();
            this.mValue = next.getValue();
            return true;
        }
        this.mKey = null;
        this.mValue = null;
        return false;
    }
}
