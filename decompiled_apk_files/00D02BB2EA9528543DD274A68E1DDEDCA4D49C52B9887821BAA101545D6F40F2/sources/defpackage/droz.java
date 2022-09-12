package defpackage;
/* compiled from: PG */
/* renamed from: droz  reason: default package */
/* loaded from: classes6.dex */
public final class droz extends dsqw<droz, droy> implements dssk {
    public static final droz f;
    private static volatile dssr<droz> g;
    public int a;
    public int c;
    public dnoh d;
    public String b = "";
    public String e = "";

    static {
        droz drozVar = new droz();
        f = drozVar;
        dsqw.cc(droz.class, drozVar);
    }

    private droz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0007ဌ\u0001\bဉ\u0002", new Object[]{"a", "b", "e", "c", dnis.a, "d"});
            }
            if (i2 == 3) {
                return new droz();
            }
            if (i2 == 4) {
                return new droy();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<droz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (droz.class) {
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
