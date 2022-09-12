package defpackage;
/* compiled from: PG */
/* renamed from: dgjl  reason: default package */
/* loaded from: classes6.dex */
public final class dgjl extends dsqw<dgjl, dgjk> implements dssk {
    public static final dgjl d;
    private static volatile dssr<dgjl> f;
    public String a = "";
    public String b = "";
    public dgis c;
    private int e;

    static {
        dgjl dgjlVar = new dgjl();
        d = dgjlVar;
        dsqw.cc(dgjl.class, dgjlVar);
    }

    private dgjl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dgjl();
            }
            if (i2 == 4) {
                return new dgjk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgjl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgjl.class) {
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
