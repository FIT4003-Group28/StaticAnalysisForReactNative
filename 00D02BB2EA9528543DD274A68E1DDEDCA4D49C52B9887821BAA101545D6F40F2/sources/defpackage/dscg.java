package defpackage;
/* compiled from: PG */
/* renamed from: dscg  reason: default package */
/* loaded from: classes6.dex */
public final class dscg extends dsqw<dscg, dscf> implements dssk {
    public static final dscg d;
    private static volatile dssr<dscg> f;
    public boolean a;
    public String b = "";
    public String c = "";
    private int e;

    static {
        dscg dscgVar = new dscg();
        d = dscgVar;
        dsqw.cc(dscg.class, dscgVar);
    }

    private dscg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dscg();
            }
            if (i2 == 4) {
                return new dscf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dscg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dscg.class) {
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
