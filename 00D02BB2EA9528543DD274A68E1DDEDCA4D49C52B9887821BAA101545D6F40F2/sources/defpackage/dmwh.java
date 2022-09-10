package defpackage;
/* compiled from: PG */
/* renamed from: dmwh  reason: default package */
/* loaded from: classes6.dex */
public final class dmwh extends dsqw<dmwh, dmwf> implements dssk {
    public static final dmwh d;
    private static volatile dssr<dmwh> e;
    public int a;
    public boolean b;
    public int c;

    static {
        dmwh dmwhVar = new dmwh();
        d = dmwhVar;
        dsqw.cc(dmwh.class, dmwhVar);
    }

    private dmwh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0006\u0011\u0002\u0000\u0000\u0000\u0006ဇ\u0002\u0011ဌ\u0003", new Object[]{"a", "b", "c", dmwg.a});
            }
            if (i2 == 3) {
                return new dmwh();
            }
            if (i2 == 4) {
                return new dmwf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmwh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmwh.class) {
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
