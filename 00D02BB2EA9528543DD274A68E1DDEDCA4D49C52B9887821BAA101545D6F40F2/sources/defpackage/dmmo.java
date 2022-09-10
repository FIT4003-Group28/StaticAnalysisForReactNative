package defpackage;
/* compiled from: PG */
/* renamed from: dmmo  reason: default package */
/* loaded from: classes.dex */
public final class dmmo extends dsqw<dmmo, dmmn> implements dssk {
    public static final dmmo b;
    private static volatile dssr<dmmo> c;
    public dsrf a = dsqz.b;

    static {
        dmmo dmmoVar = new dmmo();
        b = dmmoVar;
        dsqw.cc(dmmo.class, dmmoVar);
    }

    private dmmo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dmmo();
            }
            if (i2 == 4) {
                return new dmmn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmmo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dmmo.class) {
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
