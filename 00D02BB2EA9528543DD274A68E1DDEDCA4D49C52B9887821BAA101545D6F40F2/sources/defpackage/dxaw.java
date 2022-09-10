package defpackage;
/* compiled from: PG */
/* renamed from: dxaw  reason: default package */
/* loaded from: classes6.dex */
public final class dxaw extends dsqw<dxaw, dxau> implements dssk {
    public static final dxaw a;
    private static volatile dssr<dxaw> h;
    private int b;
    private long c;
    private int e;
    private boolean f;
    private byte g = 2;
    private String d = "";

    static {
        dxaw dxawVar = new dxaw();
        a = dxawVar;
        dsqw.cc(dxaw.class, dxawVar);
    }

    private dxaw() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0004\u0000\u0001o\u0081\u0004\u0000\u0000\u0004oᔂ\u0000pᔈ\u0001\u0080ᔌ\u0005\u0081ᔇ\u0006", new Object[]{"b", "c", "d", "e", dxav.a, "f"});
            }
            if (i2 == 3) {
                return new dxaw();
            }
            if (i2 == 4) {
                return new dxau();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dxaw> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dxaw.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
