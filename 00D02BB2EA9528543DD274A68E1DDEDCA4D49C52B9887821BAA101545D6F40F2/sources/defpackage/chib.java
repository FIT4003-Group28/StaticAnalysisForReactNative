package defpackage;
/* compiled from: PG */
/* renamed from: chib  reason: default package */
/* loaded from: classes4.dex */
public final class chib extends dsqw<chib, chia> implements dssk {
    public static final chib f;
    private static volatile dssr<chib> g;
    public int a;
    public boolean b;
    public dpvk c;
    public boolean d;
    public boolean e;

    static {
        chib chibVar = new chib();
        f = chibVar;
        dsqw.cc(chib.class, chibVar);
    }

    private chib() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new chib();
            }
            if (i2 == 4) {
                return new chia();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chib> dssrVar = g;
            if (dssrVar == null) {
                synchronized (chib.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
