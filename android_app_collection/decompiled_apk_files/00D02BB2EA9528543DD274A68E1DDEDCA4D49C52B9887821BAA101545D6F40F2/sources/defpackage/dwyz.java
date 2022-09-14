package defpackage;
/* compiled from: PG */
/* renamed from: dwyz  reason: default package */
/* loaded from: classes6.dex */
public final class dwyz extends dsqw<dwyz, dwyy> implements dssk {
    public static final dwyz b;
    private static volatile dssr<dwyz> d;
    private byte c = 2;
    public dsrj<dwzq> a = dssu.b;

    static {
        dwyz dwyzVar = new dwyz();
        b = dwyzVar;
        dsqw.cc(dwyz.class, dwyzVar);
    }

    private dwyz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dwzq.class});
            }
            if (i2 == 3) {
                return new dwyz();
            }
            if (i2 == 4) {
                return new dwyy();
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
            dssr<dwyz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwyz.class) {
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
