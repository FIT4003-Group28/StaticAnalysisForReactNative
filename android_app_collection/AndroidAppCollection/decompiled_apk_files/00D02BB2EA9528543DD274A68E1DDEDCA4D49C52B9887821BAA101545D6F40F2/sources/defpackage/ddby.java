package defpackage;
/* compiled from: PG */
/* renamed from: ddby  reason: default package */
/* loaded from: classes5.dex */
public final class ddby extends dsqw<ddby, ddbx> implements dssk {
    public static final ddby g;
    private static volatile dssr<ddby> j;
    public int a;
    public ddxz b;
    public ddxz d;
    public ddhe e;
    public ddeg f;
    private ddxz h;
    private byte i = 2;
    public dsrj<ddhk> c = dssu.b;

    static {
        ddby ddbyVar = new ddby();
        g = ddbyVar;
        dsqw.cc(ddby.class, ddbyVar);
    }

    private ddby() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0006\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0003", new Object[]{"a", "b", "c", ddhk.class, "d", "e", "f", "h"});
            }
            if (i2 == 3) {
                return new ddby();
            }
            if (i2 == 4) {
                return new ddbx();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<ddby> dssrVar = j;
            if (dssrVar == null) {
                synchronized (ddby.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
