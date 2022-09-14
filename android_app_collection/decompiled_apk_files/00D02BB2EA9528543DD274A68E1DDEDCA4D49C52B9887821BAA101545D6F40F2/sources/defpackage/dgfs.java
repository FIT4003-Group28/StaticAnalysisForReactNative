package defpackage;
/* compiled from: PG */
/* renamed from: dgfs  reason: default package */
/* loaded from: classes6.dex */
public final class dgfs extends dsqw<dgfs, dgfr> implements dssk {
    public static final dgfs f;
    private static volatile dssr<dgfs> g;
    public int a;
    public dgfi c;
    public dgly e;
    public dsrj<dgfm> b = dssu.b;
    public String d = "";

    static {
        dgfs dgfsVar = new dgfs();
        f = dgfsVar;
        dsqw.cc(dgfs.class, dgfsVar);
    }

    private dgfs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0005ဈ\u0003\u0006ဉ\u0004", new Object[]{"a", "b", dgfm.class, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dgfs();
            }
            if (i2 == 4) {
                return new dgfr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgfs> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgfs.class) {
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
