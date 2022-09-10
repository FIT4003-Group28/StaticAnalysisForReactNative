package defpackage;
/* compiled from: PG */
/* renamed from: djsy  reason: default package */
/* loaded from: classes6.dex */
public final class djsy extends dsqw<djsy, djsx> implements dssk {
    public static final djsy c;
    private static volatile dssr<djsy> d;
    public int a;
    public int b;

    static {
        djsy djsyVar = new djsy();
        c = djsyVar;
        dsqw.cc(djsy.class, djsyVar);
    }

    private djsy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", drba.a});
            }
            if (i2 == 3) {
                return new djsy();
            }
            if (i2 == 4) {
                return new djsx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djsy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djsy.class) {
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
