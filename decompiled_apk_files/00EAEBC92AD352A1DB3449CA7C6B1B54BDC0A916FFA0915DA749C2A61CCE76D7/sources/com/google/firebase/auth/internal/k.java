package com.google.firebase.auth.internal;

import android.content.Context;
import c.e.a.b.d.e.k3;
import com.google.firebase.auth.FirebaseAuth;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    private static final k f8365b = new k();

    /* renamed from: a  reason: collision with root package name */
    private final q f8366a;

    private k() {
        this(q.a(), i.a());
    }

    private k(q qVar, i iVar) {
        this.f8366a = qVar;
    }

    public static k a() {
        return f8365b;
    }

    public static void a(Context context, k3 k3Var, String str, String str2) {
        q.a(context, k3Var, str, str2);
    }

    public final void a(Context context) {
        this.f8366a.a(context);
    }

    public final void a(FirebaseAuth firebaseAuth) {
        this.f8366a.a(firebaseAuth);
    }
}
