package defpackage;
/* compiled from: PG */
/* renamed from: dlbg  reason: default package */
/* loaded from: classes6.dex */
public final class dlbg extends dsqw<dlbg, dlbf> implements dssk {
    public static final dlbg a;
    private static volatile dssr<dlbg> c;
    private byte b = 2;

    static {
        dlbg dlbgVar = new dlbg();
        a = dlbgVar;
        dsqw.cc(dlbg.class, dlbgVar);
    }

    private dlbg() {
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
                return new dlbg();
            }
            if (i2 == 4) {
                return new dlbf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dlbg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dlbg.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
