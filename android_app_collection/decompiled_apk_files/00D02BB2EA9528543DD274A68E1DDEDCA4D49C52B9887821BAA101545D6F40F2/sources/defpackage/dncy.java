package defpackage;
/* compiled from: PG */
/* renamed from: dncy  reason: default package */
/* loaded from: classes6.dex */
public final class dncy extends dsqw<dncy, dncx> implements dssk {
    public static final dncy a;
    private static volatile dssr<dncy> c;
    private byte b = 2;

    static {
        dncy dncyVar = new dncy();
        a = dncyVar;
        dsqw.cc(dncy.class, dncyVar);
    }

    private dncy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dncy();
            }
            if (i2 == 4) {
                return new dncx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dncy> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dncy.class) {
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
