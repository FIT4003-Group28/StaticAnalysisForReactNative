package defpackage;
/* compiled from: PG */
/* renamed from: dtuu  reason: default package */
/* loaded from: classes6.dex */
public final class dtuu extends dsqw<dtuu, dtue> implements dssk {
    public static final dtuu c;
    private static volatile dssr<dtuu> d;
    public int a = 0;
    public Object b;

    static {
        dtuu dtuuVar = new dtuu();
        c = dtuuVar;
        dsqw.cc(dtuu.class, dtuuVar);
    }

    private dtuu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"b", "a", dtuk.class, dtug.class, dtut.class, dtup.class, dtui.class, dtur.class});
            }
            if (i2 == 3) {
                return new dtuu();
            }
            if (i2 == 4) {
                return new dtue();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtuu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtuu.class) {
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
