package defpackage;
/* compiled from: PG */
/* renamed from: dsxp  reason: default package */
/* loaded from: classes6.dex */
public final class dsxp extends dsqw<dsxp, dsxo> implements dssk {
    public static final dsxp a;
    private static volatile dssr<dsxp> i;
    private int b;
    private long d;
    private long e;
    private dsxn f;
    private dsxn g;
    private byte h = 2;
    private String c = "";

    static {
        dsxp dsxpVar = new dsxp();
        a = dsxpVar;
        dsqw.cc(dsxp.class, dsxpVar);
    }

    private dsxp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔈ\u0000\u0002ᔂ\u0001\u0003ᔂ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dsxp();
            }
            if (i3 == 4) {
                return new dsxo();
            }
            if (i3 == 5) {
                return a;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dsxp> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dsxp.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
