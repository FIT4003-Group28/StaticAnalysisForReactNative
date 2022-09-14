package com.google.firebase.auth.v0.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h implements c.e.a.b.g.a<ResultT, c.e.a.b.g.h<ResultT>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f8464a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ i f8465b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(i iVar, e eVar) {
        this.f8465b = iVar;
        this.f8464a = eVar;
    }

    @Override // c.e.a.b.g.a
    public final /* synthetic */ Object a(c.e.a.b.g.h hVar) {
        if (hVar.a() instanceof com.google.android.gms.common.api.m) {
            i iVar = this.f8465b;
            e eVar = this.f8464a;
            eVar.l();
            return iVar.a(eVar);
        }
        return hVar;
    }
}
