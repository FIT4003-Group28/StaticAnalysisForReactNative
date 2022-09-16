package defpackage;
/* compiled from: PG */
/* renamed from: dubb  reason: default package */
/* loaded from: classes.dex */
public final class dubb extends dsqw<dubb, duba> implements dssk {
    public static final dubb b;
    private static volatile dssr<dubb> c;
    public dtzc a;

    static {
        dubb dubbVar = new dubb();
        b = dubbVar;
        dsqw.cc(dubb.class, dubbVar);
    }

    private dubb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dubb();
            }
            if (i2 == 4) {
                return new duba();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dubb> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dubb.class) {
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
