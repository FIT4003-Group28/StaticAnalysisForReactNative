package defpackage;
/* compiled from: PG */
/* renamed from: djiz  reason: default package */
/* loaded from: classes6.dex */
public final class djiz extends dsqw<djiz, djiy> implements dssk {
    public static final djiz c;
    private static volatile dssr<djiz> d;
    public int a;
    public String b = "";

    static {
        djiz djizVar = new djiz();
        c = djizVar;
        dsqw.cc(djiz.class, djizVar);
    }

    private djiz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new djiz();
            }
            if (i2 == 4) {
                return new djiy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djiz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djiz.class) {
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