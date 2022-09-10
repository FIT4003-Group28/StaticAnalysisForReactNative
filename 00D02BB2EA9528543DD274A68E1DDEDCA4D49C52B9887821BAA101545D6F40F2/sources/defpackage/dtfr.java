package defpackage;
/* compiled from: PG */
/* renamed from: dtfr  reason: default package */
/* loaded from: classes6.dex */
public final class dtfr extends dsqw<dtfr, dtfq> implements dssk {
    public static final dtfr a;
    private static volatile dssr<dtfr> d;
    private dtfx b;
    private byte c = 2;

    static {
        dtfr dtfrVar = new dtfr();
        a = dtfrVar;
        dsqw.cc(dtfr.class, dtfrVar);
    }

    private dtfr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 0;
            if (i2 == 2) {
                return cd(a, "\u0000\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0000\u0001\u0005Љ", new Object[]{"b"});
            }
            if (i2 == 3) {
                return new dtfr();
            }
            if (i2 == 4) {
                return new dtfq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj != null) {
                    b = 1;
                }
                this.c = b;
                return null;
            }
            dssr<dtfr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtfr.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
