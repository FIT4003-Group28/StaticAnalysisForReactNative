package defpackage;
/* compiled from: PG */
/* renamed from: wmj  reason: default package */
/* loaded from: classes7.dex */
public final class wmj {
    public static <T extends wpl> cqmp<T> a(cqss cqssVar) {
        cqhc a = cqhc.a();
        a.d(wmc.a, cqgr.eU(xje.a));
        a.d(wmd.a, cqgr.eU(xje.c));
        return a.b(cqgr.eU(cqssVar));
    }

    public static <T extends wpl> cqmp<T> b(final cqss cqssVar) {
        return cqgr.eW(new cqlc(cqssVar) { // from class: wmh
            private final cqss a;

            {
                this.a = cqssVar;
            }

            @Override // defpackage.cqlc
            public final Object a(cqkp cqkpVar) {
                wpl wplVar = (wpl) cqkpVar;
                return (wplVar.z().booleanValue() || wplVar.Z(donz.CANCELED).booleanValue()) ? xje.c : this.a;
            }

            @Override // defpackage.cqlc
            public final boolean b() {
                return false;
            }
        });
    }

    public static <T extends wpl> cqmp<T> c() {
        return cqgr.fk(wmi.a);
    }
}
