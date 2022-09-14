package defpackage;
/* compiled from: PG */
/* renamed from: dlsf  reason: default package */
/* loaded from: classes6.dex */
public final class dlsf extends dsqw<dlsf, dlsc> implements dssk {
    public static final dlsf b;
    private static volatile dssr<dlsf> c;
    public dsrj<dlse> a = dssu.b;

    static {
        dlsf dlsfVar = new dlsf();
        b = dlsfVar;
        dsqw.cc(dlsf.class, dlsfVar);
    }

    private dlsf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dlse.class});
            }
            if (i2 == 3) {
                return new dlsf();
            }
            if (i2 == 4) {
                return new dlsc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlsf> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlsf.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
