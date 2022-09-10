package defpackage;
/* compiled from: PG */
/* renamed from: drzw  reason: default package */
/* loaded from: classes6.dex */
public final class drzw extends dsqw<drzw, drzv> implements dssk {
    public static final drzw d;
    private static volatile dssr<drzw> e;
    public int a;
    public String b = "";
    public long c;

    static {
        drzw drzwVar = new drzw();
        d = drzwVar;
        dsqw.cc(drzw.class, drzwVar);
    }

    private drzw() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0000\u0006ဈ\u0002\u0007ဂ\u0003", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new drzw();
            }
            if (i2 == 4) {
                return new drzv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drzw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drzw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
