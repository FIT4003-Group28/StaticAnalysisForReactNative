package defpackage;
/* compiled from: PG */
/* renamed from: dghw  reason: default package */
/* loaded from: classes6.dex */
public final class dghw extends dsqw<dghw, dghv> implements dssk {
    public static final dghw b;
    private static volatile dssr<dghw> c;
    public dsrj<dghu> a = dssu.b;

    static {
        dghw dghwVar = new dghw();
        b = dghwVar;
        dsqw.cc(dghw.class, dghwVar);
    }

    private dghw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dghu.class});
            }
            if (i2 == 3) {
                return new dghw();
            }
            if (i2 == 4) {
                return new dghv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dghw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dghw.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
