package com.facebook.jni;

import java.util.Iterator;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class IteratorHelper {

    /* renamed from: a  reason: collision with root package name */
    private final Iterator f3013a;
    @com.facebook.k.a.a
    private Object mElement;

    @com.facebook.k.a.a
    public IteratorHelper(Iterator it) {
        this.f3013a = it;
    }

    @com.facebook.k.a.a
    public IteratorHelper(Iterable iterable) {
        this.f3013a = iterable.iterator();
    }

    @com.facebook.k.a.a
    boolean hasNext() {
        if (this.f3013a.hasNext()) {
            this.mElement = this.f3013a.next();
            return true;
        }
        this.mElement = null;
        return false;
    }
}
