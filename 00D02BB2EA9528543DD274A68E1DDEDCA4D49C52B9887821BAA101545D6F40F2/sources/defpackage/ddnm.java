package defpackage;
/* compiled from: PG */
/* renamed from: ddnm  reason: default package */
/* loaded from: classes6.dex */
public final class ddnm extends dsqw<ddnm, ddnl> implements dssk {
    public static final ddnm a;
    private static volatile dssr<ddnm> e;
    private int b;
    private ddxz c;
    private byte d = 2;

    static {
        ddnm ddnmVar = new ddnm();
        a = ddnmVar;
        dsqw.cc(ddnm.class, ddnmVar);
    }

    private ddnm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new ddnm();
            }
            if (i2 == 4) {
                return new ddnl();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<ddnm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddnm.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
