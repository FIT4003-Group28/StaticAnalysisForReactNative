package defpackage;
/* compiled from: PG */
/* renamed from: ducc  reason: default package */
/* loaded from: classes6.dex */
public final class ducc extends dsqw<ducc, ducb> implements dssk {
    public static final ducc f;
    private static volatile dssr<ducc> g;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        ducc duccVar = new ducc();
        f = duccVar;
        dsqw.cc(ducc.class, duccVar);
    }

    private ducc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ducc();
            }
            if (i2 == 4) {
                return new ducb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ducc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ducc.class) {
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
