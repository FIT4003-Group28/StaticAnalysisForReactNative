package defpackage;
/* compiled from: PG */
/* renamed from: aueb  reason: default package */
/* loaded from: classes2.dex */
public final class aueb<T> extends btrh<T> {
    public aueb(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        auea aueaVar = (auea) this.a;
        crij crijVar = (crij) obj;
        auei b = crijVar.b();
        akra a = crijVar.a();
        Integer c = crijVar.c();
        if (aueaVar.l == null) {
            aueaVar.m = aueaVar.a.z();
            aueaVar.l = new alfe(aueaVar.b, aueaVar.a.aj().aE(), aueaVar.m, aueaVar.h, aueaVar.i, aueaVar.j);
        }
        alfe alfeVar = aueaVar.l;
        dbsk.s(alfeVar);
        aktc d = aueaVar.c.d(alfeVar.c(1L, false, aueaVar.m ? b.b() : b.a(), a), dmti.WORLD_ENCODING_LAT_LNG_E7);
        if (c != null) {
            d.Pt(new audz(aueaVar, b, c));
        }
        aueaVar.k.add(d);
        aueaVar.d.b(d, aueaVar.e, amsb.JAMCIDENTS, 0, alfq.c);
    }
}
