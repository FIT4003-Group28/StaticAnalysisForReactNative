package defpackage;
/* compiled from: PG */
/* renamed from: ajjc  reason: default package */
/* loaded from: classes2.dex */
public final class ajjc extends dsqw<ajjc, ajjb> implements dssk {
    public static final ajjc f;
    private static volatile dssr<ajjc> g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        ajjc ajjcVar = new ajjc();
        f = ajjcVar;
        dsqw.cc(ajjc.class, ajjcVar);
    }

    private ajjc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ajjc();
            }
            if (i2 == 4) {
                return new ajjb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ajjc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ajjc.class) {
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
