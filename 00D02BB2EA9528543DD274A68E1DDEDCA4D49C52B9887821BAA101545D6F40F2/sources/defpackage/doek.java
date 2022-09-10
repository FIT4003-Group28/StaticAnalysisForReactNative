package defpackage;
/* compiled from: PG */
/* renamed from: doek  reason: default package */
/* loaded from: classes6.dex */
public final class doek extends dsqw<doek, doej> implements dssk {
    public static final doek f;
    private static volatile dssr<doek> g;
    public int a;
    public long b;
    public doqt c;
    public boolean d;
    public long e;

    static {
        doek doekVar = new doek();
        f = doekVar;
        dsqw.cc(doek.class, doekVar);
    }

    private doek() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဃ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new doek();
            }
            if (i2 == 4) {
                return new doej();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doek> dssrVar = g;
            if (dssrVar == null) {
                synchronized (doek.class) {
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
