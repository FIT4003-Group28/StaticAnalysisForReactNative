package defpackage;
/* compiled from: PG */
/* renamed from: dxoh  reason: default package */
/* loaded from: classes6.dex */
public final class dxoh extends dsqw<dxoh, dxog> implements dssk {
    public static final dxoh c;
    private static volatile dssr<dxoh> d;
    public String a = "";
    public dsrj<dxoj> b = dssu.b;

    static {
        dxoh dxohVar = new dxoh();
        c = dxohVar;
        dsqw.cc(dxoh.class, dxohVar);
    }

    private dxoh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"a", "b", dxoj.class});
            }
            if (i2 == 3) {
                return new dxoh();
            }
            if (i2 == 4) {
                return new dxog();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxoh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxoh.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
