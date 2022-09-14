package com.facebook.jni;

import com.facebook.jni.a;
import com.facebook.l.g;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class HybridData {
    @com.facebook.k.a.a
    private Destructor mDestructor = new Destructor(this);

    static {
        g.a("fb");
    }

    public synchronized void a() {
        this.mDestructor.a();
    }

    /* loaded from: classes.dex */
    public static class Destructor extends a.AbstractC0063a {
        @com.facebook.k.a.a
        private long mNativePointer;

        static native void deleteNative(long j);

        Destructor(Object obj) {
            super(obj);
        }

        @Override // com.facebook.jni.a.AbstractC0063a
        void a() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0L;
        }
    }
}
