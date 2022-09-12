package defpackage;
/* compiled from: PG */
/* renamed from: dlwe  reason: default package */
/* loaded from: classes.dex */
public final class dlwe extends dsqw<dlwe, dlwd> implements dssk {
    public static final dlwe c;
    private static volatile dssr<dlwe> d;
    public int a;
    public float b;

    static {
        dlwe dlweVar = new dlwe();
        c = dlweVar;
        dsqw.cc(dlwe.class, dlweVar);
    }

    private dlwe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dlwe();
            }
            if (i2 == 4) {
                return new dlwd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlwe> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlwe.class) {
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
