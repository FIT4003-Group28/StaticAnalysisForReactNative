package defpackage;
/* compiled from: PG */
/* renamed from: dtfn  reason: default package */
/* loaded from: classes6.dex */
public final class dtfn extends dsqw<dtfn, dtfm> implements dssk {
    public static final dtfn a;
    private static volatile dssr<dtfn> e;
    private int b;
    private dtdh c;
    private byte d = 2;

    static {
        dtfn dtfnVar = new dtfn();
        a = dtfnVar;
        dsqw.cc(dtfn.class, dtfnVar);
    }

    private dtfn() {
        dssu<Object> dssuVar = dssu.b;
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\n\n\u0001\u0000\u0000\u0001\nᐉ\u0006", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dtfn();
            }
            if (i2 == 4) {
                return new dtfm();
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
            dssr<dtfn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtfn.class) {
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
