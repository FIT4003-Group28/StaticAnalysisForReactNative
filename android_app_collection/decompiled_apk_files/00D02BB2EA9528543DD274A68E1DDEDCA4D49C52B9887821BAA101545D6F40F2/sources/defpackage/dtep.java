package defpackage;
/* compiled from: PG */
/* renamed from: dtep  reason: default package */
/* loaded from: classes6.dex */
public final class dtep extends dsqw<dtep, dteo> implements dssk {
    public static final dtep a;
    private static volatile dssr<dtep> e;
    private int b;
    private dtdh c;
    private byte d = 2;

    static {
        dtep dtepVar = new dtep();
        a = dtepVar;
        dsqw.cc(dtep.class, dtepVar);
    }

    private dtep() {
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
                return new dtep();
            }
            if (i2 == 4) {
                return new dteo();
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
            dssr<dtep> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtep.class) {
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
