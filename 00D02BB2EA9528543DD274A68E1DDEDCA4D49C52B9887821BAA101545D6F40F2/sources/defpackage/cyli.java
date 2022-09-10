package defpackage;
/* compiled from: PG */
/* renamed from: cyli  reason: default package */
/* loaded from: classes5.dex */
public final class cyli extends dsqw<cyli, cylh> implements dssk {
    public static final cyli c;
    private static volatile dssr<cyli> d;
    public dsgh a;
    public cylg b;

    static {
        cyli cyliVar = new cyli();
        c = cyliVar;
        dsqw.cc(cyli.class, cyliVar);
    }

    private cyli() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cyli();
            }
            if (i2 == 4) {
                return new cylh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyli> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cyli.class) {
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
