package defpackage;
/* compiled from: PG */
/* renamed from: dqgo  reason: default package */
/* loaded from: classes6.dex */
public final class dqgo extends dsqw<dqgo, dqgn> implements dssk {
    public static final dqgo b;
    private static volatile dssr<dqgo> d;
    private byte c = 2;
    public dsrj<dqgm> a = dssu.b;

    static {
        dqgo dqgoVar = new dqgo();
        b = dqgoVar;
        dsqw.cc(dqgo.class, dqgoVar);
    }

    private dqgo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dqgm.class});
            }
            if (i2 == 3) {
                return new dqgo();
            }
            if (i2 == 4) {
                return new dqgn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dqgo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqgo.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
