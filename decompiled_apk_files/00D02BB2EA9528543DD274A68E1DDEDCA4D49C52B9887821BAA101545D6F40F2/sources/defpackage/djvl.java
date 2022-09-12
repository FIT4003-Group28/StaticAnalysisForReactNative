package defpackage;
/* compiled from: PG */
/* renamed from: djvl  reason: default package */
/* loaded from: classes6.dex */
public final class djvl extends dsqw<djvl, djvk> implements dssk {
    public static final djvl c;
    private static volatile dssr<djvl> d;
    public int a = 0;
    public Object b;

    static {
        djvl djvlVar = new djvl();
        c = djvlVar;
        dsqw.cc(djvl.class, djvlVar);
    }

    private djvl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဿ\u0000", new Object[]{"b", "a", drrx.c()});
            }
            if (i2 == 3) {
                return new djvl();
            }
            if (i2 == 4) {
                return new djvk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djvl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djvl.class) {
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
