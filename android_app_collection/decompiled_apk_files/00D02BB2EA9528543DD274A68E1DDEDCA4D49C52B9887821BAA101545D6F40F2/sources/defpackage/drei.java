package defpackage;
/* compiled from: PG */
/* renamed from: drei  reason: default package */
/* loaded from: classes6.dex */
public final class drei extends dsqw<drei, dreh> implements dssk {
    public static final drei b;
    private static volatile dssr<drei> d;
    public String a = "";
    private int c;

    static {
        drei dreiVar = new drei();
        b = dreiVar;
        dsqw.cc(drei.class, dreiVar);
    }

    private drei() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drei();
            }
            if (i2 == 4) {
                return new dreh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drei> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drei.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
