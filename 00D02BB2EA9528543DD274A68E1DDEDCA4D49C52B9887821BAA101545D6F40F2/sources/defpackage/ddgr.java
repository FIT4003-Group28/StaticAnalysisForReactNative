package defpackage;
/* compiled from: PG */
/* renamed from: ddgr  reason: default package */
/* loaded from: classes.dex */
public final class ddgr extends dsqw<ddgr, ddgp> implements dssk {
    public static final ddgr d;
    private static volatile dssr<ddgr> e;
    public int a;
    public dsrj<String> b = dssu.b;
    public int c;

    static {
        ddgr ddgrVar = new ddgr();
        d = ddgrVar;
        dsqw.cc(ddgr.class, ddgrVar);
    }

    private ddgr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဌ\u0000", new Object[]{"a", "b", "c", ddgq.a});
            }
            if (i2 == 3) {
                return new ddgr();
            }
            if (i2 == 4) {
                return new ddgp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddgr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddgr.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<String> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
