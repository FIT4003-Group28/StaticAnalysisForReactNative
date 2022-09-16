package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.c;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class h<T extends IInterface> extends c<T> implements a.f, i {
    private final Set<Scope> w;
    private final Account x;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public h(Context context, Looper looper, int i, d dVar, f.a aVar, f.b bVar) {
        this(context, looper, i, dVar, (com.google.android.gms.common.api.internal.d) aVar, (com.google.android.gms.common.api.internal.j) bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.d r13, com.google.android.gms.common.api.internal.d r14, com.google.android.gms.common.api.internal.j r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.j r3 = com.google.android.gms.common.internal.j.a(r10)
            com.google.android.gms.common.e r4 = com.google.android.gms.common.e.a()
            com.google.android.gms.common.internal.s.a(r14)
            r7 = r14
            com.google.android.gms.common.api.internal.d r7 = (com.google.android.gms.common.api.internal.d) r7
            com.google.android.gms.common.internal.s.a(r15)
            r8 = r15
            com.google.android.gms.common.api.internal.j r8 = (com.google.android.gms.common.api.internal.j) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.h.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.d, com.google.android.gms.common.api.internal.d, com.google.android.gms.common.api.internal.j):void");
    }

    protected h(Context context, Looper looper, j jVar, com.google.android.gms.common.e eVar, int i, d dVar, com.google.android.gms.common.api.internal.d dVar2, com.google.android.gms.common.api.internal.j jVar2) {
        super(context, looper, jVar, eVar, i, a(dVar2), a(jVar2), dVar.e());
        this.x = dVar.a();
        Set<Scope> c2 = dVar.c();
        b(c2);
        this.w = c2;
    }

    private static c.a a(com.google.android.gms.common.api.internal.d dVar) {
        if (dVar == null) {
            return null;
        }
        return new a0(dVar);
    }

    private static c.b a(com.google.android.gms.common.api.internal.j jVar) {
        if (jVar == null) {
            return null;
        }
        return new b0(jVar);
    }

    private final Set<Scope> b(Set<Scope> set) {
        a(set);
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return set;
    }

    protected Set<Scope> a(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> b() {
        return j() ? this.w : Collections.emptySet();
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public int d() {
        return super.d();
    }

    @Override // com.google.android.gms.common.internal.c
    public final Account o() {
        return this.x;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Set<Scope> u() {
        return this.w;
    }
}
