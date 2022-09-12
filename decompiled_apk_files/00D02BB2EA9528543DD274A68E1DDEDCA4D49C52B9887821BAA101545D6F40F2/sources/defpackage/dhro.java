package defpackage;
/* compiled from: PG */
/* renamed from: dhro  reason: default package */
/* loaded from: classes6.dex */
public final class dhro extends dsqs<dhro, dhrn> implements dsqt {
    public static final dhro a;
    private static volatile dssr<dhro> c;
    private byte b = 2;

    static {
        dhro dhroVar = new dhro();
        a = dhroVar;
        dsqw.cc(dhro.class, dhroVar);
    }

    private dhro() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhro();
            }
            if (i2 == 4) {
                return new dhrn();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dhro> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhro.class) {
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
