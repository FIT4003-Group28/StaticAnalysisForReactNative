package defpackage;
/* compiled from: PG */
/* renamed from: dnyp  reason: default package */
/* loaded from: classes6.dex */
public final class dnyp extends dsqw<dnyp, dnyo> implements dssk {
    public static final dnyp c;
    private static volatile dssr<dnyp> d;
    public int a;
    public dgdg b;

    static {
        dnyp dnypVar = new dnyp();
        c = dnypVar;
        dsqw.cc(dnyp.class, dnypVar);
    }

    private dnyp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnyp();
            }
            if (i2 == 4) {
                return new dnyo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnyp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnyp.class) {
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
