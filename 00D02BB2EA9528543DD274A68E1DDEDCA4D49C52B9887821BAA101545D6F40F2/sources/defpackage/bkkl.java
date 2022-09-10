package defpackage;
/* compiled from: PG */
/* renamed from: bkkl  reason: default package */
/* loaded from: classes3.dex */
public final class bkkl extends dsqw<bkkl, bkkk> implements dssk {
    public static final bkkl d;
    private static volatile dssr<bkkl> e;
    public int a;
    public String b = "";
    public dsrj<ccln> c = dssu.b;

    static {
        bkkl bkklVar = new bkkl();
        d = bkklVar;
        dsqw.cc(bkkl.class, bkklVar);
    }

    private bkkl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", ccln.class});
            }
            if (i2 == 3) {
                return new bkkl();
            }
            if (i2 == 4) {
                return new bkkk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bkkl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bkkl.class) {
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
