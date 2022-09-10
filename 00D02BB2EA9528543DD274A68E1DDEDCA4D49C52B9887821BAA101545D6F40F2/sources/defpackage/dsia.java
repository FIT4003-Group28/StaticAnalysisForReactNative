package defpackage;
/* compiled from: PG */
/* renamed from: dsia  reason: default package */
/* loaded from: classes6.dex */
public final class dsia extends dsqw<dsia, dshz> implements dssk {
    public static final dsia e;
    private static volatile dssr<dsia> f;
    public int a;
    public dsgd b;
    public dsrj<dsgt> c = dssu.b;
    public dsgo d;

    static {
        dsia dsiaVar = new dsia();
        e = dsiaVar;
        dsqw.cc(dsia.class, dsiaVar);
    }

    private dsia() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "c", dsgt.class, "b", "d"});
            }
            if (i2 == 3) {
                return new dsia();
            }
            if (i2 == 4) {
                return new dshz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsia> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsia.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<dsgt> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
