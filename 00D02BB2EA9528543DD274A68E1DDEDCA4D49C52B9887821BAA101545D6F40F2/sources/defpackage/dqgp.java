package defpackage;
/* compiled from: PG */
/* renamed from: dqgp  reason: default package */
/* loaded from: classes6.dex */
public final class dqgp extends dsqw<dqgp, dqgk> implements dssk {
    public static final dqgp b;
    private static volatile dssr<dqgp> d;
    private byte c = 2;
    public dsrj<dqgo> a = dssu.b;

    static {
        dqgp dqgpVar = new dqgp();
        b = dqgpVar;
        dsqw.cc(dqgp.class, dqgpVar);
    }

    private dqgp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", dqgo.class});
            }
            if (i2 == 3) {
                return new dqgp();
            }
            if (i2 == 4) {
                return new dqgk();
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
            dssr<dqgp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqgp.class) {
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
