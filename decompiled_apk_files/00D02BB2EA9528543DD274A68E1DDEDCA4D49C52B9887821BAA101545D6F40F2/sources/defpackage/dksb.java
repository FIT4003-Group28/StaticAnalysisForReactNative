package defpackage;
/* compiled from: PG */
/* renamed from: dksb  reason: default package */
/* loaded from: classes.dex */
public final class dksb extends dsqw<dksb, dksa> implements dksc {
    public static final dksb d;
    private static volatile dssr<dksb> e;
    public int a;
    public int b;
    public int c;

    static {
        dksb dksbVar = new dksb();
        d = dksbVar;
        dsqw.cc(dksb.class, dksbVar);
    }

    private dksb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dksb();
            }
            if (i2 == 4) {
                return new dksa();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dksb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dksb.class) {
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
