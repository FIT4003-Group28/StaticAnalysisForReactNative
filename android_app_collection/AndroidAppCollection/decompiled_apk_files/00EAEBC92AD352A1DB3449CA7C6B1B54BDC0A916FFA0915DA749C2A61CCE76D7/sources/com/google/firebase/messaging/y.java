package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference<y> f9502d;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f9503a;

    /* renamed from: b  reason: collision with root package name */
    private w f9504b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f9505c;

    private y(SharedPreferences sharedPreferences, Executor executor) {
        this.f9505c = executor;
        this.f9503a = sharedPreferences;
    }

    public static synchronized y a(Context context, Executor executor) {
        y yVar;
        synchronized (y.class) {
            yVar = null;
            if (f9502d != null) {
                yVar = f9502d.get();
            }
            if (yVar == null) {
                yVar = new y(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                yVar.b();
                f9502d = new WeakReference<>(yVar);
            }
        }
        return yVar;
    }

    private final synchronized void b() {
        this.f9504b = w.a(this.f9503a, "topic_operation_queue", ",", this.f9505c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized x a() {
        return x.a(this.f9504b.b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean a(x xVar) {
        return this.f9504b.a(xVar.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean b(x xVar) {
        return this.f9504b.a((Object) xVar.c());
    }
}
