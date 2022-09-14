package defpackage;
/* compiled from: PG */
/* renamed from: dsxl  reason: default package */
/* loaded from: classes6.dex */
public final class dsxl extends dsqw<dsxl, dsxk> implements dssk {
    public static final dsxl a;
    private static volatile dssr<dsxl> e;
    private int b;
    private byte d = 2;
    private String c = "";

    static {
        dsxl dsxlVar = new dsxl();
        a = dsxlVar;
        dsqw.cc(dsxl.class, dsxlVar);
    }

    private dsxl() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔈ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dsxl();
            }
            if (i2 == 4) {
                return new dsxk();
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
            dssr<dsxl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsxl.class) {
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
