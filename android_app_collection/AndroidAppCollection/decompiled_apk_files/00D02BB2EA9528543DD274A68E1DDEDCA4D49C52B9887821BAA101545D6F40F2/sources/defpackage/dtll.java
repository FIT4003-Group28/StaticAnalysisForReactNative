package defpackage;
/* compiled from: PG */
/* renamed from: dtll  reason: default package */
/* loaded from: classes6.dex */
public final class dtll extends dsqw<dtll, dtlk> implements dssk {
    public static final dtll a;
    private static volatile dssr<dtll> e;
    private int b;
    private dijv c;
    private byte d = 2;

    static {
        dtll dtllVar = new dtll();
        a = dtllVar;
        dsqw.cc(dtll.class, dtllVar);
    }

    private dtll() {
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
                return new dtll();
            }
            if (i2 == 4) {
                return new dtlk();
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
            dssr<dtll> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtll.class) {
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
