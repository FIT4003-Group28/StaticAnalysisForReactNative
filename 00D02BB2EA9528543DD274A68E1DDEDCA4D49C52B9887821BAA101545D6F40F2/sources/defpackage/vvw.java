package defpackage;
/* compiled from: PG */
/* renamed from: vvw  reason: default package */
/* loaded from: classes7.dex */
public final class vvw extends dsqw<vvw, vvt> implements dssk {
    public static final vvw d;
    private static volatile dssr<vvw> e;
    public int a;
    public int b;
    public dnoh c;

    static {
        vvw vvwVar = new vvw();
        d = vvwVar;
        dsqw.cc(vvw.class, vvwVar);
    }

    private vvw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", vvu.a, "c"});
            }
            if (i2 == 3) {
                return new vvw();
            }
            if (i2 == 4) {
                return new vvt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<vvw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (vvw.class) {
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
