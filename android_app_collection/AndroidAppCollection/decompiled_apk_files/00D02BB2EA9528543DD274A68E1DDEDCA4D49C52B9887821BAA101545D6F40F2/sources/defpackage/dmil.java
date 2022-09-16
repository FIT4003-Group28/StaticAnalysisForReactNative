package defpackage;
/* compiled from: PG */
/* renamed from: dmil  reason: default package */
/* loaded from: classes6.dex */
public final class dmil extends dsqw<dmil, dmii> implements dssk {
    public static final dmil d;
    private static volatile dssr<dmil> f;
    public int a;
    public dmim b;
    public dmim c;
    private int e;

    static {
        dmil dmilVar = new dmil();
        d = dmilVar;
        dsqw.cc(dmil.class, dmilVar);
    }

    private dmil() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", dmij.a, "b", "c"});
            }
            if (i2 == 3) {
                return new dmil();
            }
            if (i2 == 4) {
                return new dmii();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmil> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmil.class) {
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
