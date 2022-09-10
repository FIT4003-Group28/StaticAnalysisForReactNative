package defpackage;
/* compiled from: PG */
/* renamed from: dblr  reason: default package */
/* loaded from: classes5.dex */
public final class dblr extends dsqw<dblr, dblp> implements dssk {
    public static final dblr a;
    private static volatile dssr<dblr> c;
    private dssd<String, String> b = dssd.b;

    static {
        dblr dblrVar = new dblr();
        a = dblrVar;
        dsqw.cc(dblr.class, dblrVar);
    }

    private dblr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0001\u0000\u0000\u00062", new Object[]{"b", dblq.a});
            }
            if (i2 == 3) {
                return new dblr();
            }
            if (i2 == 4) {
                return new dblp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dblr> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dblr.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
