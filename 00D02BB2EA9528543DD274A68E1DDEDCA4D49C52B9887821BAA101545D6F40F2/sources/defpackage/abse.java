package defpackage;
/* compiled from: PG */
/* renamed from: abse  reason: default package */
/* loaded from: classes.dex */
public final class abse extends dsqw<abse, absd> implements dssk {
    public static final abse e;
    private static volatile dssr<abse> f;
    public int a;
    public int b;
    public dhjx c;
    public String d = "";

    static {
        abse abseVar = new abse();
        e = abseVar;
        dsqw.cc(abse.class, abseVar);
    }

    private abse() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", absg.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new abse();
            }
            if (i2 == 4) {
                return new absd();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<abse> dssrVar = f;
            if (dssrVar == null) {
                synchronized (abse.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
