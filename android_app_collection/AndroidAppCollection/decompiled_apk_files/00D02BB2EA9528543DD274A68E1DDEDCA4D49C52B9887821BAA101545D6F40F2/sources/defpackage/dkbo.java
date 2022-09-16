package defpackage;
/* compiled from: PG */
/* renamed from: dkbo  reason: default package */
/* loaded from: classes6.dex */
public final class dkbo extends dsqw<dkbo, dkbn> implements dssk {
    public static final dkbo f;
    private static volatile dssr<dkbo> g;
    public int a;
    public String b = "";
    public doek c;
    public dqyd d;
    public long e;

    static {
        dkbo dkboVar = new dkbo();
        f = dkboVar;
        dsqw.cc(dkbo.class, dkboVar);
    }

    private dkbo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0005ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dkbo();
            }
            if (i2 == 4) {
                return new dkbn();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkbo> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkbo.class) {
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
