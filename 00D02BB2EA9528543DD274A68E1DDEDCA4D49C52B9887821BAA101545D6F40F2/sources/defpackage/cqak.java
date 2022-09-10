package defpackage;
/* compiled from: PG */
/* renamed from: cqak  reason: default package */
/* loaded from: classes5.dex */
public final class cqak extends dsqw<cqak, cqaj> implements dssk {
    public static final cqak c;
    private static volatile dssr<cqak> d;
    public int a;
    public int b;

    static {
        cqak cqakVar = new cqak();
        c = cqakVar;
        dsqw.cc(cqak.class, cqakVar);
    }

    private cqak() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", cpxz.a});
            }
            if (i2 == 3) {
                return new cqak();
            }
            if (i2 == 4) {
                return new cqaj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cqak> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cqak.class) {
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
