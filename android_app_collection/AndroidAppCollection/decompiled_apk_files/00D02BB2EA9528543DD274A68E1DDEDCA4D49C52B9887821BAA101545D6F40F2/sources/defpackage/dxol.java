package defpackage;
/* compiled from: PG */
/* renamed from: dxol  reason: default package */
/* loaded from: classes6.dex */
public final class dxol extends dsqw<dxol, dxok> implements dssk {
    public static final dxol b;
    private static volatile dssr<dxol> c;
    public String a = "";

    static {
        dxol dxolVar = new dxol();
        b = dxolVar;
        dsqw.cc(dxol.class, dxolVar);
    }

    private dxol() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxol();
            }
            if (i2 == 4) {
                return new dxok();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxol> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxol.class) {
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
