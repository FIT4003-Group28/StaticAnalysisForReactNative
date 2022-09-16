package defpackage;
/* compiled from: PG */
/* renamed from: cylz  reason: default package */
/* loaded from: classes5.dex */
public final class cylz extends dsqw<cylz, cyly> implements dssk {
    public static final cylz c;
    private static volatile dssr<cylz> d;
    public String a = "";
    public int b;

    static {
        cylz cylzVar = new cylz();
        c = cylzVar;
        dsqw.cc(cylz.class, cylzVar);
    }

    private cylz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new cylz();
            }
            if (i2 == 4) {
                return new cyly();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cylz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cylz.class) {
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
