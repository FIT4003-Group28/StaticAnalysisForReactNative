package defpackage;
/* compiled from: PG */
/* renamed from: diff  reason: default package */
/* loaded from: classes6.dex */
public final class diff extends dsqw<diff, difa> implements dssk {
    public static final diff b;
    private static volatile dssr<diff> d;
    public dife a;
    private int c;

    static {
        diff diffVar = new diff();
        b = diffVar;
        dsqw.cc(diff.class, diffVar);
    }

    private diff() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new diff();
            }
            if (i2 == 4) {
                return new difa();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diff> dssrVar = d;
            if (dssrVar == null) {
                synchronized (diff.class) {
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
