package com.facebook.jni;

import java.util.Iterator;
import java.util.Map;
@com.facebook.jni.b.a
/* loaded from: classes.dex */
public class MapIteratorHelper {
    @com.facebook.jni.b.a
    private final Iterator<Map.Entry> mIterator;
    @com.facebook.jni.b.a
    private Object mKey;
    @com.facebook.jni.b.a
    private Object mValue;

    @com.facebook.jni.b.a
    public MapIteratorHelper(Map map) {
        this.mIterator = map.entrySet().iterator();
    }

    @com.facebook.jni.b.a
    boolean hasNext() {
        if (!this.mIterator.hasNext()) {
            this.mKey = null;
            this.mValue = null;
            return false;
        }
        Map.Entry next = this.mIterator.next();
        this.mKey = next.getKey();
        this.mValue = next.getValue();
        return true;
    }
}
