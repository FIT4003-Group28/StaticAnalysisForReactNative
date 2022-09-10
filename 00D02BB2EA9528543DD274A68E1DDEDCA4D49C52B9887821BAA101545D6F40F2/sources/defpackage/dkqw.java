package defpackage;
/* compiled from: PG */
/* renamed from: dkqw  reason: default package */
/* loaded from: classes.dex */
public final class dkqw extends dsqw<dkqw, dkqv> implements dssk {
    public static final dkqw c;
    private static volatile dssr<dkqw> e;
    public int a = 10;
    public int b = 10;
    private int d;

    static {
        dkqw dkqwVar = new dkqw();
        c = dkqwVar;
        dsqw.cc(dkqw.class, dkqwVar);
    }

    private dkqw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dkqw();
            }
            if (i2 == 4) {
                return new dkqv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkqw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkqw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
