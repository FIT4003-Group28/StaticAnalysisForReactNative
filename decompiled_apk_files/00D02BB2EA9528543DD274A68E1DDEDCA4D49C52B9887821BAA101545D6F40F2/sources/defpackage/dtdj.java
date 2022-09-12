package defpackage;
/* compiled from: PG */
/* renamed from: dtdj  reason: default package */
/* loaded from: classes6.dex */
public final class dtdj extends dsqs<dtdj, dtdi> implements dsqt {
    public static final dtdj a;
    private static volatile dssr<dtdj> c;
    private byte b = 2;

    static {
        dtdj dtdjVar = new dtdj();
        a = dtdjVar;
        dsqw.cc(dtdj.class, dtdjVar);
    }

    private dtdj() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtdj();
            }
            if (i2 == 4) {
                return new dtdi();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dtdj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtdj.class) {
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
