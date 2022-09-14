package defpackage;
/* compiled from: PG */
/* renamed from: bzog  reason: default package */
/* loaded from: classes.dex */
public final class bzog extends dsqw<bzog, bzof> implements dssk {
    public static final bzog c;
    private static volatile dssr<bzog> d;
    public dsrj<dqkd> a = dssu.b;
    public dsrj<dspd> b = dssu.b;

    static {
        bzog bzogVar = new bzog();
        c = bzogVar;
        dsqw.cc(bzog.class, bzogVar);
    }

    private bzog() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001c", new Object[]{"a", dqkd.class, "b"});
            }
            if (i2 == 3) {
                return new bzog();
            }
            if (i2 == 4) {
                return new bzof();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzog> dssrVar = d;
            if (dssrVar == null) {
                synchronized (bzog.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }

    public final void b() {
        dsrj<dspd> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
