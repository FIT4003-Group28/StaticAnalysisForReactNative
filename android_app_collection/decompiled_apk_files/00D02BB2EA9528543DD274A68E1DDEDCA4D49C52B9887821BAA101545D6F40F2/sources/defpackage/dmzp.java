package defpackage;
/* compiled from: PG */
/* renamed from: dmzp  reason: default package */
/* loaded from: classes6.dex */
public final class dmzp extends dsqw<dmzp, dmzo> implements dssk {
    public static final dmzp c;
    private static volatile dssr<dmzp> e;
    public dmzv a;
    public int b;
    private int d;

    static {
        dmzp dmzpVar = new dmzp();
        c = dmzpVar;
        dsqw.cc(dmzp.class, dmzpVar);
    }

    private dmzp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dmzp();
            }
            if (i2 == 4) {
                return new dmzo();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmzp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmzp.class) {
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
