package com.facebook.common.b;

import android.os.Handler;
import android.os.Looper;
/* compiled from: UiThreadImmediateExecutorService.java */
/* loaded from: classes.dex */
public class f extends c {

    /* renamed from: a  reason: collision with root package name */
    private static f f2265a;

    private f() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static f b() {
        if (f2265a == null) {
            f2265a = new f();
        }
        return f2265a;
    }

    @Override // com.facebook.common.b.c, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
