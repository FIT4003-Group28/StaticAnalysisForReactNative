package defpackage;
/* compiled from: PG */
/* renamed from: diwa  reason: default package */
/* loaded from: classes6.dex */
public final class diwa extends dsqw<diwa, divz> implements dssk {
    public static final diwa c;
    private static volatile dssr<diwa> d;
    public int a;
    public String b = "";

    static {
        diwa diwaVar = new diwa();
        c = diwaVar;
        dsqw.cc(diwa.class, diwaVar);
    }

    private diwa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new diwa();
            }
            if (i2 == 4) {
                return new divz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diwa> dssrVar = d;
            if (dssrVar == null) {
                synchronized (diwa.class) {
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
