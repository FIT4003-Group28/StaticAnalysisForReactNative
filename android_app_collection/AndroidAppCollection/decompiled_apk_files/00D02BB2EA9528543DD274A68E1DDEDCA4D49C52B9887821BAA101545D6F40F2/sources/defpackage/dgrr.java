package defpackage;
/* compiled from: PG */
/* renamed from: dgrr  reason: default package */
/* loaded from: classes6.dex */
public final class dgrr extends dsqw<dgrr, dgrq> implements dssk {
    public static final dgrr a;
    private static volatile dssr<dgrr> e;
    private int b;
    private dtro c;
    private byte d = 2;

    static {
        dgrr dgrrVar = new dgrr();
        a = dgrrVar;
        dsqw.cc(dgrr.class, dgrrVar);
    }

    private dgrr() {
        dssu<Object> dssuVar = dssu.b;
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0001\u000fᐉ\u0006", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dgrr();
            }
            if (i2 == 4) {
                return new dgrq();
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
            dssr<dgrr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgrr.class) {
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
