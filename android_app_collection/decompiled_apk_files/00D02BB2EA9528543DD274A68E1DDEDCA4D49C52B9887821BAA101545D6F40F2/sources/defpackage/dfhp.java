package defpackage;
/* compiled from: PG */
/* renamed from: dfhp  reason: default package */
/* loaded from: classes6.dex */
public final class dfhp extends dsqw<dfhp, dfhk> implements dssk {
    public static final dfhp d;
    private static volatile dssr<dfhp> f;
    public float a;
    public int b;
    public int c;
    private int e;

    static {
        dfhp dfhpVar = new dfhp();
        d = dfhpVar;
        dsqw.cc(dfhp.class, dfhpVar);
    }

    private dfhp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", dfhl.a, "c", dfhn.a});
            }
            if (i2 == 3) {
                return new dfhp();
            }
            if (i2 == 4) {
                return new dfhk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfhp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfhp.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
