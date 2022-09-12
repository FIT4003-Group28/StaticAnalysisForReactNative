package defpackage;
/* compiled from: PG */
/* renamed from: dxqu  reason: default package */
/* loaded from: classes6.dex */
public final class dxqu extends dsqw<dxqu, dxqt> implements dssk {
    public static final dxqu b;
    private static volatile dssr<dxqu> c;
    public String a = "";

    static {
        dxqu dxquVar = new dxqu();
        b = dxquVar;
        dsqw.cc(dxqu.class, dxquVar);
    }

    private dxqu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxqu();
            }
            if (i2 == 4) {
                return new dxqt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxqu> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxqu.class) {
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
