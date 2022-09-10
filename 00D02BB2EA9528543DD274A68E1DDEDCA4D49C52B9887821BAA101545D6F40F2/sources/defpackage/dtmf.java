package defpackage;
/* compiled from: PG */
/* renamed from: dtmf  reason: default package */
/* loaded from: classes6.dex */
public final class dtmf extends dsqw<dtmf, dtme> implements dssk {
    public static final dtmf a;
    private static volatile dssr<dtmf> e;
    private int b;
    private dkcs c;
    private byte d = 2;

    static {
        dtmf dtmfVar = new dtmf();
        a = dtmfVar;
        dsqw.cc(dtmf.class, dtmfVar);
    }

    private dtmf() {
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
                return new dtmf();
            }
            if (i2 == 4) {
                return new dtme();
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
            dssr<dtmf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtmf.class) {
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
