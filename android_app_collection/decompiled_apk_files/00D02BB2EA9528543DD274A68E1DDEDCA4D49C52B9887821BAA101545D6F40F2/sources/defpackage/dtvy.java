package defpackage;
/* compiled from: PG */
/* renamed from: dtvy  reason: default package */
/* loaded from: classes6.dex */
public final class dtvy extends dsqw<dtvy, dtvx> implements dssk {
    public static final dtvy c;
    private static volatile dssr<dtvy> d;
    public String a = "";
    public dspd b = dspd.b;

    static {
        dtvy dtvyVar = new dtvy();
        c = dtvyVar;
        dsqw.cc(dtvy.class, dtvyVar);
    }

    private dtvy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtvy();
            }
            if (i2 == 4) {
                return new dtvx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtvy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtvy.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
