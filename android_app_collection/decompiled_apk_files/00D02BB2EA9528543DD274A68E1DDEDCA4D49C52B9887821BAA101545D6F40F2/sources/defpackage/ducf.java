package defpackage;
/* compiled from: PG */
/* renamed from: ducf  reason: default package */
/* loaded from: classes6.dex */
public final class ducf extends dsqw<ducf, dubu> implements dssk {
    public static final ducf b;
    private static volatile dssr<ducf> c;
    public duce a;

    static {
        ducf ducfVar = new ducf();
        b = ducfVar;
        dsqw.cc(ducf.class, ducfVar);
    }

    private ducf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new ducf();
            }
            if (i2 == 4) {
                return new dubu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ducf> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ducf.class) {
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
