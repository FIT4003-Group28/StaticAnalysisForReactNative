package defpackage;
/* compiled from: PG */
/* renamed from: dnic  reason: default package */
/* loaded from: classes6.dex */
public final class dnic extends dsqw<dnic, dnhx> implements dssk {
    public static final dnic f;
    private static volatile dssr<dnic> g;
    public int a;
    public dpop b;
    public dnhz c;
    public dnhz d;
    public boolean e;

    static {
        dnic dnicVar = new dnic();
        f = dnicVar;
        dsqw.cc(dnic.class, dnicVar);
    }

    private dnic() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0003\u0007\u0004\u0000\u0000\u0000\u0003ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dnic();
            }
            if (i2 == 4) {
                return new dnhx();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnic> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnic.class) {
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
