package defpackage;
/* compiled from: PG */
/* renamed from: dswj  reason: default package */
/* loaded from: classes6.dex */
public final class dswj extends dsqw<dswj, dswi> implements dssk {
    public static final dswj b;
    private static volatile dssr<dswj> d;
    private byte c = 2;
    public dsrj<dsvd> a = dssu.b;

    static {
        dswj dswjVar = new dswj();
        b = dswjVar;
        dsqw.cc(dswj.class, dswjVar);
    }

    private dswj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dsvd.class});
            }
            if (i2 == 3) {
                return new dswj();
            }
            if (i2 == 4) {
                return new dswi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dswj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dswj.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
