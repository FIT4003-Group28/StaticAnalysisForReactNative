package defpackage;
/* compiled from: PG */
/* renamed from: dmjm  reason: default package */
/* loaded from: classes.dex */
public final class dmjm extends dsqw<dmjm, dmjl> implements dssk {
    public static final dmjm d;
    private static volatile dssr<dmjm> e;
    public int a;
    public String b = "";
    public int c;

    static {
        dmjm dmjmVar = new dmjm();
        d = dmjmVar;
        dsqw.cc(dmjm.class, dmjmVar);
    }

    private dmjm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဏ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmjm();
            }
            if (i2 == 4) {
                return new dmjl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmjm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmjm.class) {
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
