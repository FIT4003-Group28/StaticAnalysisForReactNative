package defpackage;
/* compiled from: PG */
/* renamed from: djbo  reason: default package */
/* loaded from: classes6.dex */
public final class djbo extends dsqw<djbo, djbn> implements dssk {
    public static final djbo c;
    private static volatile dssr<djbo> d;
    public int a;
    public String b = "";

    static {
        djbo djboVar = new djbo();
        c = djboVar;
        dsqw.cc(djbo.class, djboVar);
    }

    private djbo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new djbo();
            }
            if (i2 == 4) {
                return new djbn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djbo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djbo.class) {
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
