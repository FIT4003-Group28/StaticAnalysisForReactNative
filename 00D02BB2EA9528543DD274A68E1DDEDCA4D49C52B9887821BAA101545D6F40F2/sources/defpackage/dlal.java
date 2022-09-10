package defpackage;
/* compiled from: PG */
/* renamed from: dlal  reason: default package */
/* loaded from: classes6.dex */
public final class dlal extends dsqw<dlal, dlak> implements dssk {
    public static final dlal b;
    private static volatile dssr<dlal> d;
    public String a = "";
    private int c;

    static {
        dlal dlalVar = new dlal();
        b = dlalVar;
        dsqw.cc(dlal.class, dlalVar);
    }

    private dlal() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlal();
            }
            if (i2 == 4) {
                return new dlak();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlal> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlal.class) {
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
