package defpackage;
/* compiled from: PG */
/* renamed from: dlwv  reason: default package */
/* loaded from: classes.dex */
public final class dlwv extends dsqw<dlwv, dlwu> implements dssk {
    public static final dlwv c;
    private static volatile dssr<dlwv> d;
    public int a;
    public float b;

    static {
        dlwv dlwvVar = new dlwv();
        c = dlwvVar;
        dsqw.cc(dlwv.class, dlwvVar);
    }

    private dlwv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ခ\u0003", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dlwv();
            }
            if (i2 == 4) {
                return new dlwu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlwv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlwv.class) {
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
