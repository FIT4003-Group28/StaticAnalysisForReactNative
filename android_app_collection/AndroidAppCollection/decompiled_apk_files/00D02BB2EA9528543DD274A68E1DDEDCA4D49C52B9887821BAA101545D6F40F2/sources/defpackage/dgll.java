package defpackage;
/* compiled from: PG */
/* renamed from: dgll  reason: default package */
/* loaded from: classes6.dex */
public final class dgll extends dsqw<dgll, dglk> implements dssk {
    public static final dgll d;
    private static volatile dssr<dgll> e;
    public int a;
    public dglc b;
    public dglc c;

    static {
        dgll dgllVar = new dgll();
        d = dgllVar;
        dsqw.cc(dgll.class, dgllVar);
    }

    private dgll() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dgll();
            }
            if (i2 == 4) {
                return new dglk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgll> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgll.class) {
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
