package defpackage;
/* compiled from: PG */
/* renamed from: dtvt  reason: default package */
/* loaded from: classes6.dex */
public final class dtvt extends dsqw<dtvt, dtvs> implements dssk {
    public static final dtvt f;
    private static volatile dssr<dtvt> g;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        dtvt dtvtVar = new dtvt();
        f = dtvtVar;
        dsqw.cc(dtvt.class, dtvtVar);
    }

    private dtvt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dtvt();
            }
            if (i2 == 4) {
                return new dtvs();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtvt> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtvt.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
