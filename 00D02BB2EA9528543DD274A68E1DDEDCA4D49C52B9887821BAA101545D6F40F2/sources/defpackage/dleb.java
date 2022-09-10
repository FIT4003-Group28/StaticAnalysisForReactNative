package defpackage;
/* compiled from: PG */
/* renamed from: dleb  reason: default package */
/* loaded from: classes6.dex */
public final class dleb extends dsqw<dleb, dldy> implements dssk {
    public static final dleb b;
    private static volatile dssr<dleb> d;
    private byte c = 2;
    public dsrj<dlea> a = dssu.b;

    static {
        dleb dlebVar = new dleb();
        b = dlebVar;
        dsqw.cc(dleb.class, dlebVar);
    }

    private dleb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dlea.class});
            }
            if (i2 == 3) {
                return new dleb();
            }
            if (i2 == 4) {
                return new dldy();
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
            dssr<dleb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dleb.class) {
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
