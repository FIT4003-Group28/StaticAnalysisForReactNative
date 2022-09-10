package defpackage;
/* compiled from: PG */
/* renamed from: dmzz  reason: default package */
/* loaded from: classes6.dex */
public final class dmzz extends dsqw<dmzz, dmzy> implements dssk {
    public static final dmzz f;
    private static volatile dssr<dmzz> h;
    public int b;
    public int c;
    public boolean d;
    private int g;
    public dsrj<dmzn> a = dssu.b;
    public dsrj<dmzr> e = dssu.b;

    static {
        dmzz dmzzVar = new dmzz();
        f = dmzzVar;
        dsqw.cc(dmzz.class, dmzzVar);
    }

    private dmzz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0002\u0000\u0001\u001b\u0003င\u0002\u0004ဇ\u0003\u0005င\u0000\b\u001b", new Object[]{"g", "a", dmzn.class, "c", "d", "b", "e", dmzr.class});
            }
            if (i2 == 3) {
                return new dmzz();
            }
            if (i2 == 4) {
                return new dmzy();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmzz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dmzz.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
