package defpackage;
/* compiled from: PG */
/* renamed from: dioz  reason: default package */
/* loaded from: classes6.dex */
public final class dioz extends dsqw<dioz, dioy> implements dssk {
    public static final dioz d;
    private static volatile dssr<dioz> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dioz diozVar = new dioz();
        d = diozVar;
        dsqw.cc(dioz.class, diozVar);
    }

    private dioz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dioz();
            }
            if (i2 == 4) {
                return new dioy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dioz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dioz.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
