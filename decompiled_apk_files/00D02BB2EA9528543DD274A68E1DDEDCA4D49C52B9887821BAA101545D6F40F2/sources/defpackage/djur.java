package defpackage;
/* compiled from: PG */
/* renamed from: djur  reason: default package */
/* loaded from: classes6.dex */
public final class djur extends dsqw<djur, djuq> implements dssk {
    public static final djur c;
    private static volatile dssr<djur> d;
    public int a;
    public drdk b;

    static {
        djur djurVar = new djur();
        c = djurVar;
        dsqw.cc(djur.class, djurVar);
    }

    private djur() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new djur();
            }
            if (i2 == 4) {
                return new djuq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djur> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djur.class) {
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
