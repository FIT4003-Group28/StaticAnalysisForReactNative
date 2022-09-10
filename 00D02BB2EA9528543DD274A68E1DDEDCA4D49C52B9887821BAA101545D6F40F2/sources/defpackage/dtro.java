package defpackage;
/* compiled from: PG */
/* renamed from: dtro  reason: default package */
/* loaded from: classes.dex */
public final class dtro extends dsqs<dtro, dtrn> implements dsqt {
    public static final dtro a;
    private static volatile dssr<dtro> c;
    private byte b = 2;

    static {
        dtro dtroVar = new dtro();
        a = dtroVar;
        dsqw.cc(dtro.class, dtroVar);
    }

    private dtro() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0003\u0000", null);
            }
            if (i2 == 3) {
                return new dtro();
            }
            if (i2 == 4) {
                return new dtrn();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dtro> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtro.class) {
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
