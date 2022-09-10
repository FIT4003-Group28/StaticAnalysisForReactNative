package defpackage;
/* compiled from: PG */
/* renamed from: dxvw  reason: default package */
/* loaded from: classes6.dex */
public final class dxvw extends dsqw<dxvw, dxvv> implements dssk {
    public static final dxvw c;
    private static volatile dssr<dxvw> d;
    public dspd a = dspd.b;
    public String b = "";

    static {
        dxvw dxvwVar = new dxvw();
        c = dxvwVar;
        dsqw.cc(dxvw.class, dxvwVar);
    }

    private dxvw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxvw();
            }
            if (i2 == 4) {
                return new dxvv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxvw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxvw.class) {
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
