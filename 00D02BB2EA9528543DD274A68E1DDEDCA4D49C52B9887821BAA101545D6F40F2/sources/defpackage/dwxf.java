package defpackage;
/* compiled from: PG */
/* renamed from: dwxf  reason: default package */
/* loaded from: classes.dex */
public final class dwxf extends dsqw<dwxf, dwxe> implements dssk {
    public static final dwxf a;
    private static volatile dssr<dwxf> b;

    static {
        dwxf dwxfVar = new dwxf();
        a = dwxfVar;
        dsqw.cc(dwxf.class, dwxfVar);
    }

    private dwxf() {
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
                return new dwxf();
            }
            if (i2 == 4) {
                return new dwxe();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwxf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwxf.class) {
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
