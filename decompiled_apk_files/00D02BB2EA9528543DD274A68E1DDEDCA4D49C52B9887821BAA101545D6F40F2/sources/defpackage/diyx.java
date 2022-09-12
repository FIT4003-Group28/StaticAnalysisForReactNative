package defpackage;
/* compiled from: PG */
/* renamed from: diyx  reason: default package */
/* loaded from: classes6.dex */
public final class diyx extends dsqw<diyx, diyw> implements dssk {
    public static final diyx c;
    private static volatile dssr<diyx> e;
    public dlxk a;
    public dsrf b = dsqz.b;
    private int d;

    static {
        diyx diyxVar = new diyx();
        c = diyxVar;
        dsqw.cc(diyx.class, diyxVar);
    }

    private diyx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001d", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new diyx();
            }
            if (i2 == 4) {
                return new diyw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diyx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diyx.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
