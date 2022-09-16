package defpackage;
/* compiled from: PG */
/* renamed from: djls  reason: default package */
/* loaded from: classes6.dex */
public final class djls extends dsqw<djls, djlr> implements dssk {
    public static final djls d;
    private static volatile dssr<djls> e;
    public int a;
    public int b;
    public int c;

    static {
        djls djlsVar = new djls();
        d = djlsVar;
        dsqw.cc(djls.class, djlsVar);
    }

    private djls() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new djls();
            }
            if (i2 == 4) {
                return new djlr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djls> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djls.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
