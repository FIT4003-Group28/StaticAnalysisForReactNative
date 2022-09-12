package defpackage;
/* compiled from: PG */
/* renamed from: ducm  reason: default package */
/* loaded from: classes.dex */
public final class ducm extends dsqw<ducm, ducl> implements dssk {
    public static final ducm b;
    private static volatile dssr<ducm> c;
    public int a;

    static {
        ducm ducmVar = new ducm();
        b = ducmVar;
        dsqw.cc(ducm.class, ducmVar);
    }

    private ducm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new ducm();
            }
            if (i2 == 4) {
                return new ducl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ducm> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ducm.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
