package defpackage;
/* compiled from: PG */
/* renamed from: dxme  reason: default package */
/* loaded from: classes6.dex */
public final class dxme extends dsqw<dxme, dxmd> implements dssk {
    public static final dxme b;
    private static volatile dssr<dxme> c;
    public String a = "";

    static {
        dxme dxmeVar = new dxme();
        b = dxmeVar;
        dsqw.cc(dxme.class, dxmeVar);
    }

    private dxme() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxme();
            }
            if (i2 == 4) {
                return new dxmd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxme> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxme.class) {
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