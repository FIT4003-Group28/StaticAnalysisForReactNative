package defpackage;
/* compiled from: PG */
/* renamed from: dkag  reason: default package */
/* loaded from: classes6.dex */
public final class dkag extends dsqw<dkag, dkaf> implements dssk {
    public static final dkag c;
    private static volatile dssr<dkag> e;
    public dppn a;
    public dpql b;
    private int d;

    static {
        dkag dkagVar = new dkag();
        c = dkagVar;
        dsqw.cc(dkag.class, dkagVar);
    }

    private dkag() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဉ\u0001\u0005ဉ\u0000", new Object[]{"d", "b", "a"});
            }
            if (i2 == 3) {
                return new dkag();
            }
            if (i2 == 4) {
                return new dkaf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkag> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkag.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
