package defpackage;
/* compiled from: PG */
/* renamed from: dekl  reason: default package */
/* loaded from: classes6.dex */
public final class dekl extends dsqw<dekl, dekk> implements dssk {
    public static final dekl a;
    private static volatile dssr<dekl> f;
    private int b;
    private dtdp c;
    private dtrq d;
    private byte e = 2;

    static {
        dekl deklVar = new dekl();
        a = deklVar;
        dsqw.cc(dekl.class, deklVar);
    }

    private dekl() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\b\u0012\u0002\u0000\u0000\u0001\bᐉ\u0005\u0012ဉ\t", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dekl();
            }
            if (i2 == 4) {
                return new dekk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dekl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dekl.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
