package defpackage;
/* compiled from: PG */
/* renamed from: dgqt  reason: default package */
/* loaded from: classes6.dex */
public final class dgqt extends dsqw<dgqt, dgqs> implements dssk {
    public static final dgqt a;
    private static volatile dssr<dgqt> e;
    private int b;
    private dgrh c;
    private byte d = 2;

    static {
        dgqt dgqtVar = new dgqt();
        a = dgqtVar;
        dsqw.cc(dgqt.class, dgqtVar);
    }

    private dgqt() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\u0007ᐉ\u0006", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dgqt();
            }
            if (i2 == 4) {
                return new dgqs();
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
            dssr<dgqt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgqt.class) {
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
