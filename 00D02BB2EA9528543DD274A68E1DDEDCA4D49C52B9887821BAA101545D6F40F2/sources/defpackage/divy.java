package defpackage;
/* compiled from: PG */
/* renamed from: divy  reason: default package */
/* loaded from: classes6.dex */
public final class divy extends dsqw<divy, divx> implements dssk {
    public static final divy f;
    private static volatile dssr<divy> h;
    public dvyy c;
    private int g;
    public String a = "";
    public String b = "";
    public String d = "";
    public String e = "";

    static {
        divy divyVar = new divy();
        f = divyVar;
        dsqw.cc(divy.class, divyVar);
    }

    private divy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new divy();
            }
            if (i2 == 4) {
                return new divx();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<divy> dssrVar = h;
            if (dssrVar == null) {
                synchronized (divy.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
