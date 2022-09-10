package defpackage;
/* compiled from: PG */
/* renamed from: docy  reason: default package */
/* loaded from: classes6.dex */
public final class docy extends dsqw<docy, docv> implements dssk {
    public static final docy f;
    private static volatile dssr<docy> g;
    public int a;
    public docx b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        docy docyVar = new docy();
        f = docyVar;
        dsqw.cc(docy.class, docyVar);
    }

    private docy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new docy();
            }
            if (i2 == 4) {
                return new docv();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<docy> dssrVar = g;
            if (dssrVar == null) {
                synchronized (docy.class) {
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
