package defpackage;
/* compiled from: PG */
/* renamed from: drss  reason: default package */
/* loaded from: classes6.dex */
public final class drss extends dsqw<drss, drsr> implements dssk {
    public static final drss a;
    private static volatile dssr<drss> e;
    private int b;
    private drsu c;
    private byte d = 2;

    static {
        drss drssVar = new drss();
        a = drssVar;
        dsqw.cc(drss.class, drssVar);
    }

    private drss() {
        dsqz dsqzVar = dsqz.b;
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
                return new drss();
            }
            if (i2 == 4) {
                return new drsr();
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
            dssr<drss> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drss.class) {
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
