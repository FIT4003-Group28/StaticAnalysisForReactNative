package com.facebook.imagepipeline.i;

import java.io.Closeable;
/* compiled from: CloseableImage.java */
/* loaded from: classes.dex */
public abstract class b implements e, Closeable {
    public abstract int b();

    public abstract boolean c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public boolean e() {
        return false;
    }

    public g d() {
        return f.f2710a;
    }

    protected void finalize() {
        if (c()) {
            return;
        }
        com.facebook.common.e.a.b("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
