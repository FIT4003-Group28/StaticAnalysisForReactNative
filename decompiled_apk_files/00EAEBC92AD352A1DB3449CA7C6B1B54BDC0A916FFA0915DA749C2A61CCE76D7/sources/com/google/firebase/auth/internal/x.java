package com.google.firebase.auth.internal;

import android.os.Handler;
import android.os.Looper;
import c.e.a.b.d.e.u3;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class x implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private static x f8402b = new x();

    /* renamed from: a  reason: collision with root package name */
    private Handler f8403a = new u3(Looper.getMainLooper());

    private x() {
    }

    public static x a() {
        return f8402b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f8403a.post(runnable);
    }
}
