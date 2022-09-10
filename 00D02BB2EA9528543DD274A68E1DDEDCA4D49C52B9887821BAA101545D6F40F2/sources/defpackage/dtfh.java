package defpackage;
/* compiled from: PG */
/* renamed from: dtfh  reason: default package */
/* loaded from: classes6.dex */
public final class dtfh extends dsqw<dtfh, dtfg> implements dssk {
    public static final dtfh a;
    private static volatile dssr<dtfh> e;
    private int b;
    private dtdh c;
    private byte d = 2;

    static {
        dtfh dtfhVar = new dtfh();
        a = dtfhVar;
        dsqw.cc(dtfh.class, dtfhVar);
    }

    private dtfh() {
        dssu<Object> dssuVar = dssu.b;
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
                return new dtfh();
            }
            if (i2 == 4) {
                return new dtfg();
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
            dssr<dtfh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtfh.class) {
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
