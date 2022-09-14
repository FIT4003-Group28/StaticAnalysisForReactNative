package defpackage;

import java.util.HashSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axyd  reason: default package */
/* loaded from: classes3.dex */
public final class axyd extends axye<baal> implements axyf<baal> {
    final /* synthetic */ axyh a;

    public axyd(axyh axyhVar) {
        this.a = axyhVar;
    }

    @Override // defpackage.axyf
    public final /* bridge */ /* synthetic */ azwv a(azwv azwvVar, baal baalVar) {
        baad b = baalVar.b();
        if (b != null) {
            dcen N = dcep.N();
            dcpd<azwu> it = azwvVar.n().iterator();
            while (it.hasNext()) {
                azwu next = it.next();
                if (!next.a().equals(b.m())) {
                    N.b(next);
                }
            }
            azwq o = azwvVar.o();
            o.g(N.f());
            return o.i();
        }
        return azwvVar;
    }

    @Override // defpackage.axyf
    public final /* bridge */ /* synthetic */ azwv b(azwv azwvVar, baal baalVar) {
        baal baalVar2 = baalVar;
        azwq o = azwvVar.o();
        if (baalVar2.x() == baaj.EXPERIENCE) {
            baai A = baalVar2.A();
            dbsk.s(A);
            baak z = baalVar2.z();
            dbsk.s(z);
            azwq t = azwv.t(z.a(), z.b(), A.d(), A.d());
            azwr d = azws.d();
            d.c(azwvVar.d());
            d.b(A.a());
            d.d(A.b());
            ((azve) t).l = d.a();
            o = t;
        }
        baad b = baalVar2.b();
        if (b != null) {
            azwu j = azwu.j(b, this.a.a);
            HashSet hashSet = new HashSet(azwvVar.n());
            hashSet.remove(j);
            hashSet.add(j);
            o.g(hashSet);
            o.i();
        }
        return o.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.axye
    public final /* bridge */ /* synthetic */ azxb c(baal baalVar) {
        baal baalVar2 = baalVar;
        if (baalVar2.x() == baaj.EXPERIENCE) {
            baai A = baalVar2.A();
            dbsk.s(A);
            return azxb.g(A.a(), A.b());
        }
        return super.c(baalVar2);
    }
}
