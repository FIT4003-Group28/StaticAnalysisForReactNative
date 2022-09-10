package defpackage;
/* compiled from: PG */
/* renamed from: dsvh  reason: default package */
/* loaded from: classes6.dex */
public final class dsvh extends dsqw<dsvh, dsvg> implements dssk {
    public static final dsvh d;
    private static volatile dssr<dsvh> e;
    public int a;
    public long b;
    public String c = "";

    static {
        dsvh dsvhVar = new dsvh();
        d = dsvhVar;
        dsqw.cc(dsvh.class, dsvhVar);
    }

    private dsvh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dsvh();
            }
            if (i2 == 4) {
                return new dsvg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsvh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsvh.class) {
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
