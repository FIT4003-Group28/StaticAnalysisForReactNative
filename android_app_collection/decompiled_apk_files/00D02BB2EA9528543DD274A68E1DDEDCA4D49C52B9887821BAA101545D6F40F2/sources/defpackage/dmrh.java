package defpackage;
/* compiled from: PG */
/* renamed from: dmrh  reason: default package */
/* loaded from: classes.dex */
public final class dmrh extends dsqw<dmrh, dmrg> implements dssk {
    public static final dmrh f;
    private static volatile dssr<dmrh> g;
    public int a;
    public boolean d;
    public String b = "";
    public String c = "";
    public String e = "";

    static {
        dmrh dmrhVar = new dmrh();
        f = dmrhVar;
        dsqw.cc(dmrh.class, dmrhVar);
    }

    private dmrh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dmrh();
            }
            if (i2 == 4) {
                return new dmrg();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmrh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmrh.class) {
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
