package defpackage;
/* compiled from: PG */
/* renamed from: dtfb  reason: default package */
/* loaded from: classes6.dex */
public final class dtfb extends dsqw<dtfb, dtfa> implements dssk {
    public static final dtfb a;
    private static volatile dssr<dtfb> e;
    private int b;
    private dtdh c;
    private byte d = 2;

    static {
        dtfb dtfbVar = new dtfb();
        a = dtfbVar;
        dsqw.cc(dtfb.class, dtfbVar);
    }

    private dtfb() {
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
                return new dtfb();
            }
            if (i2 == 4) {
                return new dtfa();
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
            dssr<dtfb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtfb.class) {
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
