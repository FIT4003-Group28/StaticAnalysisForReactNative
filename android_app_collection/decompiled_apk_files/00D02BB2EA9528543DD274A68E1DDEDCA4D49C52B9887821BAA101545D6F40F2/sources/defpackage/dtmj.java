package defpackage;
/* compiled from: PG */
/* renamed from: dtmj  reason: default package */
/* loaded from: classes6.dex */
public final class dtmj extends dsqs<dtmj, dtmi> implements dsqt {
    public static final dtmj a;
    private static volatile dssr<dtmj> e;
    private int b;
    private dtnz c;
    private byte d = 2;

    static {
        dtmj dtmjVar = new dtmj();
        a = dtmjVar;
        dsqw.cc(dtmj.class, dtmjVar);
    }

    private dtmj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0007", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dtmj();
            }
            if (i2 == 4) {
                return new dtmi();
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
            dssr<dtmj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtmj.class) {
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
