package defpackage;
/* compiled from: PG */
/* renamed from: bfsi  reason: default package */
/* loaded from: classes3.dex */
public final class bfsi<T> extends btrh<T> {
    public bfsi(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        aehz aehzVar = (aehz) obj;
        bfsh bfshVar = ((bfsg) this.a).a;
        dbsk.s(bfshVar.h);
        ilo c = bfshVar.h.c();
        if (c != null && c.bS().a()) {
            dnnn dnnnVar = c.bS().b().b;
            if (dnnnVar == null) {
                dnnnVar = dnnn.l;
            }
            if (bfshVar.g != null && aehr.c(dnnnVar)) {
                aeoe aeoeVar = bfshVar.g;
                dbsk.s(aeoeVar);
                aeoeVar.b(aehr.d(dnnnVar));
            }
        }
        bfshVar.E();
    }
}
