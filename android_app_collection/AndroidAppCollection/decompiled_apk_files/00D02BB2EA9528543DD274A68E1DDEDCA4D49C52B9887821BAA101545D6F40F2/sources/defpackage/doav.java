package defpackage;
/* compiled from: PG */
/* renamed from: doav  reason: default package */
/* loaded from: classes.dex */
public final class doav extends dsqw<doav, doas> implements dssk {
    public static final doav f;
    private static volatile dssr<doav> g;
    public int a;
    public int b;
    public String c = "";
    public boolean d;
    public dnvs e;

    static {
        doav doavVar = new doav();
        f = doavVar;
        dsqw.cc(doav.class, doavVar);
    }

    private doav() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0005ဉ\u0004", new Object[]{"a", "b", doat.a, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new doav();
            }
            if (i2 == 4) {
                return new doas();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doav> dssrVar = g;
            if (dssrVar == null) {
                synchronized (doav.class) {
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
