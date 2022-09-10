package defpackage;
/* compiled from: PG */
/* renamed from: dteb  reason: default package */
/* loaded from: classes6.dex */
public final class dteb extends dsqw<dteb, dtea> implements dssk {
    public static final dteb a;
    private static volatile dssr<dteb> c;
    private byte b = 2;

    static {
        dteb dtebVar = new dteb();
        a = dtebVar;
        dsqw.cc(dteb.class, dtebVar);
    }

    private dteb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dteb();
            }
            if (i2 == 4) {
                return new dtea();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dteb> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dteb.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
