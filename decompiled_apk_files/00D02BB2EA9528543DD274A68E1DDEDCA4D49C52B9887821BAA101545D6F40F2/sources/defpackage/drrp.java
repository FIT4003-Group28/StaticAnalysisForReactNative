package defpackage;
/* compiled from: PG */
/* renamed from: drrp  reason: default package */
/* loaded from: classes6.dex */
public final class drrp extends dsqw<drrp, drro> implements dssk {
    public static final drrp d;
    private static volatile dssr<drrp> e;
    public int a;
    public drrn b;
    public drrr c;

    static {
        drrp drrpVar = new drrp();
        d = drrpVar;
        dsqw.cc(drrp.class, drrpVar);
    }

    private drrp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new drrp();
            }
            if (i2 == 4) {
                return new drro();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drrp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drrp.class) {
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
