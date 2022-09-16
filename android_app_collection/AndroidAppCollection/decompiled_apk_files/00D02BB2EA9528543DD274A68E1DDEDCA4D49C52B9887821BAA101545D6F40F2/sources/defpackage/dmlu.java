package defpackage;
/* compiled from: PG */
/* renamed from: dmlu  reason: default package */
/* loaded from: classes.dex */
public final class dmlu extends dsqw<dmlu, dmlt> implements dssk {
    public static final dmlu d;
    private static volatile dssr<dmlu> e;
    public int a;
    public dmod b;
    public int c;

    static {
        dmlu dmluVar = new dmlu();
        d = dmluVar;
        dsqw.cc(dmlu.class, dmluVar);
    }

    private dmlu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmlu();
            }
            if (i2 == 4) {
                return new dmlt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmlu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmlu.class) {
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
