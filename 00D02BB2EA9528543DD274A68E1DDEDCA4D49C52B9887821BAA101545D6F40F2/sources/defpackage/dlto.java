package defpackage;
/* compiled from: PG */
/* renamed from: dlto  reason: default package */
/* loaded from: classes6.dex */
public final class dlto extends dsqw<dlto, dltn> implements dssk {
    public static final dlto a;
    private static volatile dssr<dlto> b;

    static {
        dlto dltoVar = new dlto();
        a = dltoVar;
        dsqw.cc(dlto.class, dltoVar);
    }

    private dlto() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dlto();
            }
            if (i2 == 4) {
                return new dltn();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlto> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dlto.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
