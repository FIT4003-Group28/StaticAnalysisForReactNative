package defpackage;
/* compiled from: PG */
/* renamed from: dtyx  reason: default package */
/* loaded from: classes6.dex */
public final class dtyx extends dsqw<dtyx, dtyw> implements dssk {
    public static final dtyx f;
    private static volatile dssr<dtyx> g;
    public duch a;
    public dubf b;
    public String c = "";
    public dsrj<String> d = dssu.b;
    public String e = "";

    static {
        dtyx dtyxVar = new dtyx();
        f = dtyxVar;
        dsqw.cc(dtyx.class, dtyxVar);
    }

    private dtyx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0002\t\u0003Ȉ\u0004Ț\u0005Ȉ", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dtyx();
            }
            if (i2 == 4) {
                return new dtyw();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtyx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtyx.class) {
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
