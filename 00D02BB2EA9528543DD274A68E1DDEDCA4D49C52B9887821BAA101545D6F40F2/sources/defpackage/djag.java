package defpackage;
/* compiled from: PG */
/* renamed from: djag  reason: default package */
/* loaded from: classes6.dex */
public final class djag extends dsqw<djag, djaf> implements dssk {
    public static final djag d;
    private static volatile dssr<djag> f;
    public dhze a;
    public boolean b;
    public boolean c;
    private int e;

    static {
        djag djagVar = new djag();
        d = djagVar;
        dsqw.cc(djag.class, djagVar);
    }

    private djag() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0004ဇ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new djag();
            }
            if (i2 == 4) {
                return new djaf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djag> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djag.class) {
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
