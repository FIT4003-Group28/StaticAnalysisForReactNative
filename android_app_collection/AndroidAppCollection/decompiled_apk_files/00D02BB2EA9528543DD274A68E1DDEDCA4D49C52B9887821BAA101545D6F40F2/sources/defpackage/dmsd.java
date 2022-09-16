package defpackage;
/* compiled from: PG */
/* renamed from: dmsd  reason: default package */
/* loaded from: classes.dex */
public final class dmsd extends dsqw<dmsd, dmsc> implements dssk {
    public static final dmsd a;
    private static volatile dssr<dmsd> e;
    private int b;
    private dmnp c;
    private byte d = 2;

    static {
        dmsd dmsdVar = new dmsd();
        a = dmsdVar;
        dsqw.cc(dmsd.class, dmsdVar);
    }

    private dmsd() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001ϨϨ\u0001\u0000\u0000\u0001Ϩᐉ\u0004", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dmsd();
            }
            if (i2 == 4) {
                return new dmsc();
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
            dssr<dmsd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmsd.class) {
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
