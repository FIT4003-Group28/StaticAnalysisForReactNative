package com.google.android.libraries.ar.faceviewer.runtime;

import java.io.FileNotFoundException;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class NativeCallback {
    public static final amzy a = amzy.l("com/google/android/libraries/ar/faceviewer/runtime/NativeCallback");
    private final sko b;
    private final siu c;

    private NativeCallback(siu siuVar, sko skoVar) {
        this.c = siuVar;
        this.b = skoVar;
    }

    public static NativeCallback a(siu siuVar) {
        return new NativeCallback(siuVar, skp.b);
    }

    public static NativeCallback b(siu siuVar, sko skoVar) {
        return new NativeCallback(siuVar, skoVar);
    }

    public void setNativeHandle(long j) {
        this.c.c(this.b.a(j));
    }

    public void setStatus(int i, String str) {
        Throwable th;
        if (i == 0) {
            th = null;
        } else if (i == 3) {
            th = new IllegalArgumentException(str);
        } else if (i == 5) {
            th = new FileNotFoundException(str);
        } else if (i == 11) {
            th = new IndexOutOfBoundsException(str);
        } else if (i == 12) {
            th = new UnsupportedOperationException(str);
        } else {
            th = new IllegalStateException(str);
        }
        if (th == null) {
            this.c.c(null);
        } else {
            this.c.a.d(th);
        }
    }
}
