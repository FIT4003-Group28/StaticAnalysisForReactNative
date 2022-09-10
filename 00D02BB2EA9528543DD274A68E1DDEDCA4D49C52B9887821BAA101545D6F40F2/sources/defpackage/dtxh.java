package defpackage;
/* compiled from: PG */
/* renamed from: dtxh  reason: default package */
/* loaded from: classes6.dex */
public final class dtxh extends dsqw<dtxh, dtxg> implements dssk {
    public static final dtxh a;
    private static volatile dssr<dtxh> c;
    private byte b = 2;

    static {
        dtxh dtxhVar = new dtxh();
        a = dtxhVar;
        dsqw.cc(dtxh.class, dtxhVar);
    }

    private dtxh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtxh();
            }
            if (i2 == 4) {
                return new dtxg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dtxh> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtxh.class) {
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
