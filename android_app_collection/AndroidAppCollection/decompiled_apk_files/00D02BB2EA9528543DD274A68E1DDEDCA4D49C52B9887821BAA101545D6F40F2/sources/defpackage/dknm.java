package defpackage;
/* compiled from: PG */
/* renamed from: dknm  reason: default package */
/* loaded from: classes6.dex */
public final class dknm extends dsqw<dknm, dknl> implements dssk {
    public static final dknm b;
    private static volatile dssr<dknm> d;
    public boolean a;
    private int c;

    static {
        dknm dknmVar = new dknm();
        b = dknmVar;
        dsqw.cc(dknm.class, dknmVar);
    }

    private dknm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dknm();
            }
            if (i2 == 4) {
                return new dknl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dknm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dknm.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
