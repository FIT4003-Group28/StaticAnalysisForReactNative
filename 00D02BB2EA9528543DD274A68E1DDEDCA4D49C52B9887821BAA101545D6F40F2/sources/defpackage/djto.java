package defpackage;
/* compiled from: PG */
/* renamed from: djto  reason: default package */
/* loaded from: classes6.dex */
public final class djto extends dsqw<djto, djtn> implements dssk {
    public static final djto c;
    private static volatile dssr<djto> d;
    public int a;
    public String b = "";

    static {
        djto djtoVar = new djto();
        c = djtoVar;
        dsqw.cc(djto.class, djtoVar);
    }

    private djto() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new djto();
            }
            if (i2 == 4) {
                return new djtn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djto> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djto.class) {
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
