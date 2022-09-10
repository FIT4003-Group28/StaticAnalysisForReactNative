package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anht  reason: default package */
/* loaded from: classes2.dex */
public final class anht extends angc {
    static final dbrh<anhw, aoul> a = new anhx();
    static final dbrh<anhu, aouj> b = new anhv();
    static final dbrh<eaou, String> c = dbrh.l(anhr.a, anhs.a);

    @Override // defpackage.angc
    public final void d(anhy anhyVar, aouh aouhVar) {
        long j = anhyVar.e().a;
        if (aouhVar.c) {
            aouhVar.bF();
            aouhVar.c = false;
        }
        aoum aoumVar = (aoum) aouhVar.b;
        aoum aoumVar2 = aoum.k;
        aoumVar.a |= 16;
        aoumVar.f = j;
    }

    @Override // defpackage.angc
    public final void e(anhy anhyVar, aouh aouhVar) {
        long j = anhyVar.g().l().a;
        if (aouhVar.c) {
            aouhVar.bF();
            aouhVar.c = false;
        }
        aoum aoumVar = (aoum) aouhVar.b;
        aoum aoumVar2 = aoum.k;
        aoumVar.a |= 64;
        aoumVar.h = j;
    }

    @Override // defpackage.angc
    public final void f(aoum aoumVar, anhq anhqVar) {
        anhqVar.m(aoumVar.f);
    }

    @Override // defpackage.angc
    public final void g(aoum aoumVar, anhq anhqVar) {
        ((angm) anhqVar).b = aogc.k(aoumVar.h);
    }
}
