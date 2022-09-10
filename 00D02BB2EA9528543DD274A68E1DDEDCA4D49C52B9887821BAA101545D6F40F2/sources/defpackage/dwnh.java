package defpackage;
/* compiled from: PG */
/* renamed from: dwnh  reason: default package */
/* loaded from: classes.dex */
public final class dwnh extends dsqw<dwnh, dwng> implements dssk {
    public static final dwnh d;
    private static volatile dssr<dwnh> f;
    public boolean a;
    public boolean b;
    public boolean c;
    private int e;

    static {
        dwnh dwnhVar = new dwnh();
        d = dwnhVar;
        dsqw.cc(dwnh.class, dwnhVar);
    }

    private dwnh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0000\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwnh();
            }
            if (i2 == 4) {
                return new dwng();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwnh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwnh.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
