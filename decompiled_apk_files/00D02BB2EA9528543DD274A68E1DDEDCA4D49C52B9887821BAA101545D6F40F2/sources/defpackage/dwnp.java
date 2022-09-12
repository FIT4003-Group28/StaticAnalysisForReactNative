package defpackage;
/* compiled from: PG */
/* renamed from: dwnp  reason: default package */
/* loaded from: classes6.dex */
public final class dwnp extends dsqw<dwnp, dwno> implements dssk {
    public static final dwnp b;
    private static volatile dssr<dwnp> d;
    private byte c = 2;
    public dsrj<dwnl> a = dssu.b;

    static {
        dwnp dwnpVar = new dwnp();
        b = dwnpVar;
        dsqw.cc(dwnp.class, dwnpVar);
    }

    private dwnp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0000\u0001\u0001\u0004Л", new Object[]{"a", dwnl.class});
            }
            if (i2 == 3) {
                return new dwnp();
            }
            if (i2 == 4) {
                return new dwno();
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
            dssr<dwnp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwnp.class) {
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
