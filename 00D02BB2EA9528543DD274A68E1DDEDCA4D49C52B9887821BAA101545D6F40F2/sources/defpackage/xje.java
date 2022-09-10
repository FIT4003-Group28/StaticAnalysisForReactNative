package defpackage;
/* compiled from: PG */
/* renamed from: xje  reason: default package */
/* loaded from: classes7.dex */
public final class xje {
    public static final cqss a = iva.b(ibl.ad(), ibl.aa());
    public static final cqss b = ibm.D();
    public static final cqss c = ibm.p();

    public static <T extends xkd> cqmp<T> a(final cqss cqssVar) {
        return cqgr.eW(new cqlc(cqssVar) { // from class: xjc
            private final cqss a;

            {
                this.a = cqssVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqss cqssVar2 = this.a;
                xkd xkdVar = (xkd) cqkpVar;
                cqss cqssVar3 = xje.a;
                return xkdVar.Z(donz.ON_TIME).booleanValue() ? xje.a : xkdVar.Z(donz.CHANGED).booleanValue() ? xje.b : xkdVar.Z(donz.CANCELED).booleanValue() ? xje.c : cqssVar2;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }

    public static <T extends xkd> cqmp<T> b(final cqss cqssVar) {
        return cqgr.eW(new cqlc(cqssVar) { // from class: xjd
            private final cqss a;

            {
                this.a = cqssVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                cqss cqssVar2 = this.a;
                xkd xkdVar = (xkd) cqkpVar;
                cqss cqssVar3 = xje.a;
                return xkdVar.Z(donz.ON_TIME).booleanValue() ? xje.a : (xkdVar.Z(donz.CHANGED).booleanValue() || xkdVar.Z(donz.CANCELED).booleanValue()) ? xje.b : cqssVar2;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }
}
