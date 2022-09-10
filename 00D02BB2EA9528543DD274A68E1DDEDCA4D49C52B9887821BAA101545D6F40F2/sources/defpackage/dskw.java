package defpackage;
/* compiled from: PG */
/* renamed from: dskw  reason: default package */
/* loaded from: classes6.dex */
public final class dskw extends dsqw<dskw, dskv> implements dssk {
    public static final dskw c;
    private static volatile dssr<dskw> d;
    public int a;
    public ddzr b;

    static {
        dskw dskwVar = new dskw();
        c = dskwVar;
        dsqw.cc(dskw.class, dskwVar);
    }

    private dskw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dskw();
            }
            if (i2 == 4) {
                return new dskv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dskw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dskw.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
