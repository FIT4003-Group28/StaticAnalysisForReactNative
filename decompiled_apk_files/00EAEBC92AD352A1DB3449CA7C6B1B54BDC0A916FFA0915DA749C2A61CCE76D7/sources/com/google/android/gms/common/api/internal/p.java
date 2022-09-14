package com.google.android.gms.common.api.internal;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p implements c.e.a.b.g.c<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ c.e.a.b.g.i f6908a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ z0 f6909b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(z0 z0Var, c.e.a.b.g.i iVar) {
        this.f6909b = z0Var;
        this.f6908a = iVar;
    }

    @Override // c.e.a.b.g.c
    public final void a(c.e.a.b.g.h<TResult> hVar) {
        Map map;
        map = this.f6909b.f6938b;
        map.remove(this.f6908a);
    }
}
