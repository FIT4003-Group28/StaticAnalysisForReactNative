package defpackage;
/* compiled from: PG */
/* renamed from: dihz  reason: default package */
/* loaded from: classes6.dex */
public final class dihz extends dsqw<dihz, dihw> implements dssk {
    public static final dihz d;
    private static volatile dssr<dihz> f;
    public int a;
    public String b = "";
    public boolean c;
    private int e;

    static {
        dihz dihzVar = new dihz();
        d = dihzVar;
        dsqw.cc(dihz.class, dihzVar);
    }

    private dihz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", dihx.a, "b", "c"});
            }
            if (i2 == 3) {
                return new dihz();
            }
            if (i2 == 4) {
                return new dihw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dihz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dihz.class) {
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
