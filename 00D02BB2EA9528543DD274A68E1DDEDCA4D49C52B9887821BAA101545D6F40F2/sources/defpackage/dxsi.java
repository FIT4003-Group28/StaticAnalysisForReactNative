package defpackage;
/* compiled from: PG */
/* renamed from: dxsi  reason: default package */
/* loaded from: classes6.dex */
public final class dxsi extends dsqw<dxsi, dxsh> implements dssk {
    public static final dxsi b;
    private static volatile dssr<dxsi> c;
    public String a = "";

    static {
        dxsi dxsiVar = new dxsi();
        b = dxsiVar;
        dsqw.cc(dxsi.class, dxsiVar);
    }

    private dxsi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxsi();
            }
            if (i2 == 4) {
                return new dxsh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxsi> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxsi.class) {
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
