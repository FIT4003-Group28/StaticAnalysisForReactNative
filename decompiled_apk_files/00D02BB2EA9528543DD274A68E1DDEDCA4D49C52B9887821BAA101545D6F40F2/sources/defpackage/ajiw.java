package defpackage;
/* compiled from: PG */
/* renamed from: ajiw  reason: default package */
/* loaded from: classes2.dex */
public final class ajiw extends dsqw<ajiw, ajiv> implements dssk {
    public static final ajiw b;
    private static volatile dssr<ajiw> c;
    public dsrj<ajiu> a = dssu.b;

    static {
        ajiw ajiwVar = new ajiw();
        b = ajiwVar;
        dsqw.cc(ajiw.class, ajiwVar);
    }

    private ajiw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ajiu.class});
            }
            if (i2 == 3) {
                return new ajiw();
            }
            if (i2 == 4) {
                return new ajiv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ajiw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ajiw.class) {
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
