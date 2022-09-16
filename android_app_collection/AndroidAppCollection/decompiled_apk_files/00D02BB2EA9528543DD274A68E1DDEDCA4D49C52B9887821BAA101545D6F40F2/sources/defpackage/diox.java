package defpackage;
/* compiled from: PG */
/* renamed from: diox  reason: default package */
/* loaded from: classes6.dex */
public final class diox extends dsqw<diox, diow> implements dssk {
    public static final diox e;
    private static volatile dssr<diox> f;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        diox dioxVar = new diox();
        e = dioxVar;
        dsqw.cc(diox.class, dioxVar);
    }

    private diox() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new diox();
            }
            if (i2 == 4) {
                return new diow();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diox> dssrVar = f;
            if (dssrVar == null) {
                synchronized (diox.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
