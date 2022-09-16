package defpackage;
/* compiled from: PG */
/* renamed from: clal  reason: default package */
/* loaded from: classes5.dex */
public final class clal extends dsqw<clal, clak> implements dssk {
    public static final clal a;
    private static volatile dssr<clal> e;
    private int b;
    private boolean c;
    private byte d = 2;

    static {
        clal clalVar = new clal();
        a = clalVar;
        dsqw.cc(clal.class, clalVar);
    }

    private clal() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᔇ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new clal();
            }
            if (i2 == 4) {
                return new clak();
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
            dssr<clal> dssrVar = e;
            if (dssrVar == null) {
                synchronized (clal.class) {
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
