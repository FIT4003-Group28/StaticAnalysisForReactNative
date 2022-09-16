package defpackage;
/* compiled from: PG */
/* renamed from: dxma  reason: default package */
/* loaded from: classes6.dex */
public final class dxma extends dsqw<dxma, dxlz> implements dssk {
    public static final dxma c;
    private static volatile dssr<dxma> d;
    public dsrj<dxla> a = dssu.b;
    public String b = "";

    static {
        dxma dxmaVar = new dxma();
        c = dxmaVar;
        dsqw.cc(dxma.class, dxmaVar);
    }

    private dxma() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003Ȉ", new Object[]{"a", dxla.class, "b"});
            }
            if (i2 == 3) {
                return new dxma();
            }
            if (i2 == 4) {
                return new dxlz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxma> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxma.class) {
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
