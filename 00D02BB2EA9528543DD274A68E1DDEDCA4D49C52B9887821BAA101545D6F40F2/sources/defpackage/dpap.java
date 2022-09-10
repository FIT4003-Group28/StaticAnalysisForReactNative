package defpackage;
/* compiled from: PG */
/* renamed from: dpap  reason: default package */
/* loaded from: classes6.dex */
public final class dpap extends dsqw<dpap, dpao> implements dssk {
    public static final dpap k;
    private static volatile dssr<dpap> m;
    public int a;
    public dpan b;
    public dgas c;
    public dgas d;
    public dquj e;
    public dqdk f;
    public douj h;
    public douj i;
    public int j;
    private byte l = 2;
    public String g = "";

    static {
        dpap dpapVar = new dpap();
        k = dpapVar;
        dsqw.cc(dpap.class, dpapVar);
    }

    private dpap() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဈ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bဉ\u0001\tဌ\b", new Object[]{"a", "b", "d", "e", "f", "g", "h", "i", "c", "j", dpej.c()});
            }
            if (i2 == 3) {
                return new dpap();
            }
            if (i2 == 4) {
                return new dpao();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<dpap> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dpap.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }
}
