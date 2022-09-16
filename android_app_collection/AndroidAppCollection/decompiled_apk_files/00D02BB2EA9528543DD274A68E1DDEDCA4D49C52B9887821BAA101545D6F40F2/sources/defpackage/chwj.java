package defpackage;
/* compiled from: PG */
/* renamed from: chwj  reason: default package */
/* loaded from: classes4.dex */
public final class chwj extends dsqw<chwj, chwi> implements dssk {
    public static final chwj d;
    private static volatile dssr<chwj> e;
    public int a;
    public String b = "";
    public int c;

    static {
        chwj chwjVar = new chwj();
        d = chwjVar;
        dsqw.cc(chwj.class, chwjVar);
    }

    private chwj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new chwj();
            }
            if (i2 == 4) {
                return new chwi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chwj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (chwj.class) {
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
