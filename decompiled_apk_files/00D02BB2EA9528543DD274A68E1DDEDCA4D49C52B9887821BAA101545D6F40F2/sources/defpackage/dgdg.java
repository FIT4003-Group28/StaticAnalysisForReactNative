package defpackage;
/* compiled from: PG */
/* renamed from: dgdg  reason: default package */
/* loaded from: classes6.dex */
public final class dgdg extends dsqw<dgdg, dgdf> implements dssk {
    public static final dgdg d;
    private static volatile dssr<dgdg> e;
    public int a;
    public dsrf b = dsqz.b;
    public dgdj c;

    static {
        dgdg dgdgVar = new dgdg();
        d = dgdgVar;
        dsqw.cc(dgdg.class, dgdgVar);
    }

    private dgdg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001e\u0002ဉ\u0000", new Object[]{"a", "b", dgdc.c(), "c"});
            }
            if (i2 == 3) {
                return new dgdg();
            }
            if (i2 == 4) {
                return new dgdf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgdg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgdg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
