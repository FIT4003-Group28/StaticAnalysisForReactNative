package defpackage;
/* compiled from: PG */
/* renamed from: duua  reason: default package */
/* loaded from: classes.dex */
public final class duua extends dsqw<duua, dutz> implements dssk {
    public static final duua e;
    private static volatile dssr<duua> g;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    private int f;

    static {
        duua duuaVar = new duua();
        e = duuaVar;
        dsqw.cc(duua.class, duuaVar);
    }

    private duua() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0005\t\u0004\u0000\u0000\u0000\u0005ဇ\u0005\u0007ဇ\u0007\bဇ\u0006\tဇ\b", new Object[]{"f", "a", "c", "b", "d"});
            }
            if (i2 == 3) {
                return new duua();
            }
            if (i2 == 4) {
                return new dutz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duua> dssrVar = g;
            if (dssrVar == null) {
                synchronized (duua.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
