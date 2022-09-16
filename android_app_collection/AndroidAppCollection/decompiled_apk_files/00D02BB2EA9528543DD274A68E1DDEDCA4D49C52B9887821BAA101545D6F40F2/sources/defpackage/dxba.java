package defpackage;
/* compiled from: PG */
/* renamed from: dxba  reason: default package */
/* loaded from: classes6.dex */
public final class dxba extends dsqw<dxba, dxaz> implements dssk {
    public static final dxba a;
    private static volatile dssr<dxba> g;
    private int b;
    private dwzm d;
    private dxay e;
    private byte f = 2;
    private String c = "";

    static {
        dxba dxbaVar = new dxba();
        a = dxbaVar;
        dsqw.cc(dxba.class, dxbaVar);
    }

    private dxba() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001ᔈ\u0000\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dxba();
            }
            if (i2 == 4) {
                return new dxaz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dxba> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dxba.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
