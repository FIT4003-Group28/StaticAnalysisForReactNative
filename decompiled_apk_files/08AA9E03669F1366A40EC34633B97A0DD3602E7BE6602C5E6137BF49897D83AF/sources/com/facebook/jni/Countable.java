package com.facebook.jni;

import com.facebook.l.g;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class Countable {
    @com.facebook.k.a.a
    private long mInstance = 0;

    public native void dispose();

    static {
        g.a("fb");
    }

    protected void finalize() {
        dispose();
        super.finalize();
    }
}
