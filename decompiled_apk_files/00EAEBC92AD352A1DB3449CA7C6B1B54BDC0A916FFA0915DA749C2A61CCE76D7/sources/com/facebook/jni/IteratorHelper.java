package com.facebook.jni;

import java.util.Iterator;
@com.facebook.jni.b.a
/* loaded from: classes.dex */
public class IteratorHelper {

    /* renamed from: a  reason: collision with root package name */
    private final Iterator f5303a;
    @com.facebook.jni.b.a
    private Object mElement;

    @com.facebook.jni.b.a
    public IteratorHelper(Iterable iterable) {
        this.f5303a = iterable.iterator();
    }

    @com.facebook.jni.b.a
    public IteratorHelper(Iterator it) {
        this.f5303a = it;
    }

    @com.facebook.jni.b.a
    boolean hasNext() {
        if (this.f5303a.hasNext()) {
            this.mElement = this.f5303a.next();
            return true;
        }
        this.mElement = null;
        return false;
    }
}
