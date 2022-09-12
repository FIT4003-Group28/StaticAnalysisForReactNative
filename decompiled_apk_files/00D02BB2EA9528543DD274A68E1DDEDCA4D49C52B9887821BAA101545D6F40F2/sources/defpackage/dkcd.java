package defpackage;
/* compiled from: PG */
/* renamed from: dkcd  reason: default package */
/* loaded from: classes6.dex */
public final class dkcd extends dsqw<dkcd, dkca> implements dssk {
    public static final dkcd c;
    private static volatile dssr<dkcd> d;
    public dsrj<dkcc> a = dssu.b;
    public dsrj<dkbz> b = dssu.b;

    static {
        dkcd dkcdVar = new dkcd();
        c = dkcdVar;
        dsqw.cc(dkcd.class, dkcdVar);
    }

    private dkcd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", dkcc.class, "b", dkbz.class});
            }
            if (i2 == 3) {
                return new dkcd();
            }
            if (i2 == 4) {
                return new dkca();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkcd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkcd.class) {
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
