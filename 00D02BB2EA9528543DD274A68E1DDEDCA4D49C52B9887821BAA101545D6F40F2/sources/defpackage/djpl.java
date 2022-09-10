package defpackage;
/* compiled from: PG */
/* renamed from: djpl  reason: default package */
/* loaded from: classes6.dex */
public final class djpl extends dsqw<djpl, djpc> implements dssk {
    public static final djpl f;
    private static volatile dssr<djpl> g;
    public int a;
    public djpk b;
    public djpe c;
    public dsrj<djpi> d = dssu.b;
    public String e = "";

    static {
        djpl djplVar = new djpl();
        f = djplVar;
        dsqw.cc(djpl.class, djplVar);
    }

    private djpl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဈ\u0002", new Object[]{"a", "b", "c", "d", djpi.class, "e"});
            }
            if (i2 == 3) {
                return new djpl();
            }
            if (i2 == 4) {
                return new djpc();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djpl> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djpl.class) {
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
