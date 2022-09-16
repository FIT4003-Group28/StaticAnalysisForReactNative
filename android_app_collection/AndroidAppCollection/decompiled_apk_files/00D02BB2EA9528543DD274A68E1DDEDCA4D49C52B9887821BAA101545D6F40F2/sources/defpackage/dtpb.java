package defpackage;
/* compiled from: PG */
/* renamed from: dtpb  reason: default package */
/* loaded from: classes6.dex */
public final class dtpb extends dsqw<dtpb, dtpa> implements dssk {
    public static final dtpb b;
    private static volatile dssr<dtpb> e;
    public dwco a;
    private int c;
    private byte d = 2;

    static {
        dtpb dtpbVar = new dtpb();
        b = dtpbVar;
        dsqw.cc(dtpb.class, dtpbVar);
    }

    private dtpb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dtpb();
            }
            if (i2 == 4) {
                return new dtpa();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.d = b2;
                return null;
            }
            dssr<dtpb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtpb.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
