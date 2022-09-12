package defpackage;
/* compiled from: PG */
/* renamed from: duyl  reason: default package */
/* loaded from: classes.dex */
public final class duyl extends dsqw<duyl, duyk> implements dssk {
    public static final duyl f;
    private static volatile dssr<duyl> h;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    private int g;

    static {
        duyl duylVar = new duyl();
        f = duylVar;
        dsqw.cc(duyl.class, duylVar);
    }

    private duyl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new duyl();
            }
            if (i2 == 4) {
                return new duyk();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duyl> dssrVar = h;
            if (dssrVar == null) {
                synchronized (duyl.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
