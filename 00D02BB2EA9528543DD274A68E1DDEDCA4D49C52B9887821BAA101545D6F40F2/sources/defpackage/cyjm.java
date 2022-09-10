package defpackage;
/* compiled from: PG */
/* renamed from: cyjm  reason: default package */
/* loaded from: classes5.dex */
public final class cyjm extends dsqw<cyjm, cyjk> implements dssk {
    public static final cyjm c;
    private static volatile dssr<cyjm> d;
    public long a;
    public int b;

    static {
        cyjm cyjmVar = new cyjm();
        c = cyjmVar;
        dsqw.cc(cyjm.class, cyjmVar);
    }

    private cyjm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\f", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cyjm();
            }
            if (i2 == 4) {
                return new cyjk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyjm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cyjm.class) {
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
}
