package defpackage;
/* compiled from: PG */
/* renamed from: bqhp  reason: default package */
/* loaded from: classes4.dex */
public final class bqhp extends dsqw<bqhp, bqhn> implements dssk {
    public static final bqhp e;
    private static volatile dssr<bqhp> f;
    public int a;
    public dsri b = dsrx.b;
    public String c = "";
    public int d;

    static {
        bqhp bqhpVar = new bqhp();
        e = bqhpVar;
        dsqw.cc(bqhp.class, bqhpVar);
    }

    private bqhp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0017\u0002ဈ\u0000\u0003ဌ\u0001", new Object[]{"a", "b", "c", "d", bqho.a});
            }
            if (i2 == 3) {
                return new bqhp();
            }
            if (i2 == 4) {
                return new bqhn();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bqhp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bqhp.class) {
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
        dsri dsriVar = this.b;
        if (!dsriVar.a()) {
            this.b = dsqw.ci(dsriVar);
        }
    }
}
