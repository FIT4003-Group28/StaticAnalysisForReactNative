package com.google.firebase.auth.v0.a;

import android.content.Context;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x1 implements Callable<a<i2>> {

    /* renamed from: a  reason: collision with root package name */
    private final i2 f8517a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8518b;

    public x1(i2 i2Var, Context context) {
        this.f8517a = i2Var;
        this.f8518b = context;
    }

    private final com.google.android.gms.common.api.e<i2> a(boolean z, Context context) {
        i2 i2Var = (i2) this.f8517a.clone();
        i2Var.f8459b = z;
        return new f(context, h2.f8470c, i2Var, new c.e.b.g());
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0 == (-1)) goto L15;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.firebase.auth.v0.a.a<com.google.firebase.auth.v0.a.i2> call() {
        /*
            r6 = this;
            int r0 = com.google.firebase.auth.v0.a.y1.a()
            r1 = 0
            r2 = 1
            r3 = -1
            if (r0 == r3) goto Lf
            int r0 = com.google.firebase.auth.v0.a.y1.b()
            if (r0 != r3) goto L3d
        Lf:
            android.content.Context r0 = r6.f8518b
            java.lang.String r3 = "com.google.firebase.auth"
            int r0 = com.google.android.gms.dynamite.DynamiteModule.a(r0, r3)
            if (r0 != 0) goto L1b
            r3 = 1
            goto L37
        L1b:
            com.google.android.gms.common.e r3 = com.google.android.gms.common.e.a()
            android.content.Context r4 = r6.f8518b
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r3 = r3.a(r4, r5)
            if (r3 == 0) goto L2f
            r4 = 2
            if (r3 == r4) goto L2f
            r3 = 0
            goto L37
        L2f:
            android.content.Context r3 = r6.f8518b
            java.lang.String r4 = "com.google.android.gms.firebase_auth"
            int r3 = com.google.android.gms.dynamite.DynamiteModule.b(r3, r4)
        L37:
            com.google.firebase.auth.v0.a.y1.a(r3)
            com.google.firebase.auth.v0.a.y1.b(r0)
        L3d:
            int r0 = com.google.firebase.auth.v0.a.y1.b()
            r3 = 0
            if (r0 == 0) goto L4b
            android.content.Context r0 = r6.f8518b
            com.google.android.gms.common.api.e r0 = r6.a(r2, r0)
            goto L4c
        L4b:
            r0 = r3
        L4c:
            int r2 = com.google.firebase.auth.v0.a.y1.a()
            if (r2 != 0) goto L53
            goto L59
        L53:
            android.content.Context r2 = r6.f8518b
            com.google.android.gms.common.api.e r3 = r6.a(r1, r2)
        L59:
            com.google.firebase.auth.v0.a.c r1 = new com.google.firebase.auth.v0.a.c
            int r2 = com.google.firebase.auth.v0.a.y1.a()
            int r4 = com.google.firebase.auth.v0.a.y1.b()
            java.util.Map r5 = java.util.Collections.emptyMap()
            r1.<init>(r2, r4, r5)
            com.google.firebase.auth.v0.a.a r2 = new com.google.firebase.auth.v0.a.a
            r2.<init>(r3, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.v0.a.x1.call():java.lang.Object");
    }
}
