package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public class f implements a {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f9219c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static y0 f9220d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f9221a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f9222b;

    public f(Context context, ExecutorService executorService) {
        this.f9221a = context;
        this.f9222b = executorService;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ c.e.a.b.g.h a(Context context, Intent intent, c.e.a.b.g.h hVar) {
        return (!com.google.android.gms.common.util.l.i() || ((Integer) hVar.b()).intValue() != 402) ? hVar : b(context, intent).a(h.a(), e.f9216a);
    }

    private static y0 a(Context context, String str) {
        y0 y0Var;
        synchronized (f9219c) {
            if (f9220d == null) {
                f9220d = new y0(context, str);
            }
            y0Var = f9220d;
        }
        return y0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Integer a(c.e.a.b.g.h hVar) {
        return -1;
    }

    private static c.e.a.b.g.h<Integer> b(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        return a(context, "com.google.firebase.MESSAGING_EVENT").a(intent).a(h.a(), d.f9214a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Integer b(c.e.a.b.g.h hVar) {
        return 403;
    }

    @SuppressLint({"InlinedApi"})
    public c.e.a.b.g.h<Integer> a(final Context context, final Intent intent) {
        boolean z = true;
        boolean z2 = com.google.android.gms.common.util.l.i() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        return (!z2 || z) ? c.e.a.b.g.k.a(this.f9222b, new Callable(context, intent) { // from class: com.google.firebase.iid.b

            /* renamed from: a  reason: collision with root package name */
            private final Context f9207a;

            /* renamed from: b  reason: collision with root package name */
            private final Intent f9208b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9207a = context;
                this.f9208b = intent;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer valueOf;
                valueOf = Integer.valueOf(q0.b().a(this.f9207a, this.f9208b));
                return valueOf;
            }
        }).b(this.f9222b, new c.e.a.b.g.a(context, intent) { // from class: com.google.firebase.iid.c

            /* renamed from: a  reason: collision with root package name */
            private final Context f9211a;

            /* renamed from: b  reason: collision with root package name */
            private final Intent f9212b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9211a = context;
                this.f9212b = intent;
            }

            @Override // c.e.a.b.g.a
            public final Object a(c.e.a.b.g.h hVar) {
                return f.a(this.f9211a, this.f9212b, hVar);
            }
        }) : b(context, intent);
    }

    @Override // com.google.firebase.iid.a
    public c.e.a.b.g.h<Integer> a(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return a(this.f9221a, intent);
    }
}
