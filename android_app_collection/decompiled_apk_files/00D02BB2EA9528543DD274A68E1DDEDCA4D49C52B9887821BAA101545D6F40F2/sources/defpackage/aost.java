package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aost  reason: default package */
/* loaded from: classes2.dex */
final class aost implements btzi<dign, digr> {
    final /* synthetic */ aosv a;

    public aost(aosv aosvVar) {
        this.a = aosvVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dign> btzrVar, btzy btzyVar) {
        aosv aosvVar = this.a;
        aosvVar.g.f(aosvVar.s.get());
        btzyVar.toString();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dign> btzrVar, digr digrVar) {
        digr digrVar2 = digrVar;
        this.a.s.set(digrVar2);
        this.a.g.f(digrVar2);
        this.a.q.set(false);
        AtomicReference<digr> atomicReference = this.a.t;
        digo bZ = digr.d.bZ();
        dsrj<digq> dsrjVar = digrVar2.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        digr digrVar3 = (digr) bZ.b;
        digrVar3.b();
        dsod.bv(dsrjVar, digrVar3.a);
        atomicReference.set(bZ.bK());
    }
}
