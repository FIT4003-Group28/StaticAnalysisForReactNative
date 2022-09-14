package defpackage;
/* compiled from: PG */
/* renamed from: ajnx  reason: default package */
/* loaded from: classes2.dex */
public final class ajnx extends dsqw<ajnx, ajnw> implements dssk {
    public static final ajnx b;
    private static volatile dssr<ajnx> c;
    public dsrj<ditl> a = dssu.b;

    static {
        ajnx ajnxVar = new ajnx();
        b = ajnxVar;
        dsqw.cc(ajnx.class, ajnxVar);
    }

    private ajnx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ditl.class});
            }
            if (i2 == 3) {
                return new ajnx();
            }
            if (i2 == 4) {
                return new ajnw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ajnx> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ajnx.class) {
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
