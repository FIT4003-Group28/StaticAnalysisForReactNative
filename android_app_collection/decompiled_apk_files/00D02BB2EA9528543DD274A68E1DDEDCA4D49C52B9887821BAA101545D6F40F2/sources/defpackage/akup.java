package defpackage;
/* compiled from: PG */
/* renamed from: akup  reason: default package */
/* loaded from: classes.dex */
public final class akup extends dsqw<akup, akuo> implements dssk {
    public static final akup c;
    private static volatile dssr<akup> d;
    public int a;
    public int b;

    static {
        akup akupVar = new akup();
        c = akupVar;
        dsqw.cc(akup.class, akupVar);
    }

    private akup() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new akup();
            }
            if (i2 == 4) {
                return new akuo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<akup> dssrVar = d;
            if (dssrVar == null) {
                synchronized (akup.class) {
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
