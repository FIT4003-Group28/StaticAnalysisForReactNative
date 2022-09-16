package defpackage;
/* compiled from: PG */
/* renamed from: dmgd  reason: default package */
/* loaded from: classes6.dex */
public final class dmgd extends dsqw<dmgd, dmgc> implements dssk {
    public static final dmgd e;
    private static volatile dssr<dmgd> g;
    public long b;
    public boolean d;
    private int f;
    public String a = "";
    public String c = "";

    static {
        dmgd dmgdVar = new dmgd();
        e = dmgdVar;
        dsqw.cc(dmgd.class, dmgdVar);
    }

    private dmgd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dmgd();
            }
            if (i2 == 4) {
                return new dmgc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmgd> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmgd.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
