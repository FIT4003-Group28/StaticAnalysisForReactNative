package defpackage;
/* compiled from: PG */
/* renamed from: dffy  reason: default package */
/* loaded from: classes6.dex */
public final class dffy extends dsqw<dffy, dffv> implements dssk {
    public static final dffy b;
    private static volatile dssr<dffy> d;
    private byte c = 2;
    public dsrj<dffx> a = dssu.b;

    static {
        dffy dffyVar = new dffy();
        b = dffyVar;
        dsqw.cc(dffy.class, dffyVar);
    }

    private dffy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dffx.class});
            }
            if (i2 == 3) {
                return new dffy();
            }
            if (i2 == 4) {
                return new dffv();
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
            dssr<dffy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dffy.class) {
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
