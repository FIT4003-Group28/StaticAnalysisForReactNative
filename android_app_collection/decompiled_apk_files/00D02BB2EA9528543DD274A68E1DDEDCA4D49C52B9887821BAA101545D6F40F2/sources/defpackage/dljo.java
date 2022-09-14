package defpackage;
/* compiled from: PG */
/* renamed from: dljo  reason: default package */
/* loaded from: classes6.dex */
public final class dljo extends dsqw<dljo, dljn> implements dssk {
    public static final dljo b;
    private static volatile dssr<dljo> d;
    public int a;
    private int c;

    static {
        dljo dljoVar = new dljo();
        b = dljoVar;
        dsqw.cc(dljo.class, dljoVar);
    }

    private dljo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dljo();
            }
            if (i2 == 4) {
                return new dljn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dljo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dljo.class) {
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
