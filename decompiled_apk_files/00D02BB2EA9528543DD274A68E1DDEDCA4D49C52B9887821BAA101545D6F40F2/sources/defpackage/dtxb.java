package defpackage;
/* compiled from: PG */
/* renamed from: dtxb  reason: default package */
/* loaded from: classes6.dex */
public final class dtxb extends dsqw<dtxb, dtxa> implements dssk {
    public static final dtxb a;
    private static volatile dssr<dtxb> e;
    private int b;
    private dgrh c;
    private byte d = 2;

    static {
        dtxb dtxbVar = new dtxb();
        a = dtxbVar;
        dsqw.cc(dtxb.class, dtxbVar);
    }

    private dtxb() {
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
                return new dtxb();
            }
            if (i2 == 4) {
                return new dtxa();
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
            dssr<dtxb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtxb.class) {
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
