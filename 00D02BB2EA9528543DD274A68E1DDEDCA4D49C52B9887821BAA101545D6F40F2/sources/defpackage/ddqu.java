package defpackage;
/* compiled from: PG */
/* renamed from: ddqu  reason: default package */
/* loaded from: classes6.dex */
public final class ddqu extends dsqw<ddqu, ddqt> implements dssk {
    public static final ddqu d;
    private static volatile dssr<ddqu> e;
    public int a;
    public dtaw b;
    public dsrj<ddru> c = dssu.b;

    static {
        ddqu ddquVar = new ddqu();
        d = ddquVar;
        dsqw.cc(ddqu.class, ddquVar);
    }

    private ddqu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", ddru.class});
            }
            if (i2 == 3) {
                return new ddqu();
            }
            if (i2 == 4) {
                return new ddqt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddqu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddqu.class) {
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
        dsrj<ddru> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
