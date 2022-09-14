package defpackage;
/* compiled from: PG */
/* renamed from: dxlw  reason: default package */
/* loaded from: classes6.dex */
public final class dxlw extends dsqw<dxlw, dxlv> implements dssk {
    public static final dxlw c;
    private static volatile dssr<dxlw> d;
    public dsrj<dxku> a = dssu.b;
    public String b = "";

    static {
        dxlw dxlwVar = new dxlw();
        c = dxlwVar;
        dsqw.cc(dxlw.class, dxlwVar);
    }

    private dxlw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003Ȉ", new Object[]{"a", dxku.class, "b"});
            }
            if (i2 == 3) {
                return new dxlw();
            }
            if (i2 == 4) {
                return new dxlv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxlw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxlw.class) {
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
