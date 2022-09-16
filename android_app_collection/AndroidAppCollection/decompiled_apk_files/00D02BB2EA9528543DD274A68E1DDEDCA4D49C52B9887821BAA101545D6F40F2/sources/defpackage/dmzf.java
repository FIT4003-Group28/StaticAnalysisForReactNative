package defpackage;
/* compiled from: PG */
/* renamed from: dmzf  reason: default package */
/* loaded from: classes6.dex */
public final class dmzf extends dsqw<dmzf, dmzc> implements dssk {
    public static final dmzf e;
    private static volatile dssr<dmzf> f;
    public int a;
    public int b;
    public int c;
    public dspd d;

    static {
        dmzf dmzfVar = new dmzf();
        e = dmzfVar;
        dsqw.cc(dmzf.class, dmzfVar);
    }

    private dmzf() {
        dspd dspdVar = dspd.b;
        this.d = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0004ဌ\u0003\u000fည\u0005", new Object[]{"a", "b", dmzd.a, "c", dmze.a, "d"});
            }
            if (i2 == 3) {
                return new dmzf();
            }
            if (i2 == 4) {
                return new dmzc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmzf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmzf.class) {
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
