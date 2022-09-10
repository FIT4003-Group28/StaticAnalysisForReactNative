package defpackage;
/* compiled from: PG */
/* renamed from: djtz  reason: default package */
/* loaded from: classes6.dex */
public final class djtz extends dsqw<djtz, djtu> implements dssk {
    public static final djtz c;
    private static volatile dssr<djtz> d;
    public int a = 0;
    public Object b;

    static {
        djtz djtzVar = new djtz();
        c = djtzVar;
        dsqw.cc(djtz.class, djtzVar);
    }

    private djtz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", djtw.class, djty.class});
            }
            if (i2 == 3) {
                return new djtz();
            }
            if (i2 == 4) {
                return new djtu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djtz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djtz.class) {
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
