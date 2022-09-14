package defpackage;
/* compiled from: PG */
/* renamed from: bzip  reason: default package */
/* loaded from: classes4.dex */
public final class bzip extends dsqw<bzip, bzim> implements dssk {
    public static final bzip f;
    private static volatile dssr<bzip> g;
    public int a;
    public dsri b = dsrx.b;
    public int c;
    public long d;
    public int e;

    static {
        bzip bzipVar = new bzip();
        f = bzipVar;
        dsqw.cc(bzip.class, bzipVar);
    }

    private bzip() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0014\u0002ဌ\u0000\u0003ဂ\u0001\u0004င\u0002", new Object[]{"a", "b", "c", bzin.a, "d", "e"});
            }
            if (i2 == 3) {
                return new bzip();
            }
            if (i2 == 4) {
                return new bzim();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzip> dssrVar = g;
            if (dssrVar == null) {
                synchronized (bzip.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
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
