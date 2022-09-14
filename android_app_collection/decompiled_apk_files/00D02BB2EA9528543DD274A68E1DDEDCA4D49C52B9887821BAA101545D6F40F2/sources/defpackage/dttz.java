package defpackage;
/* compiled from: PG */
/* renamed from: dttz  reason: default package */
/* loaded from: classes6.dex */
public final class dttz extends dsqw<dttz, dtte> implements dssk {
    public static final dttz d;
    private static volatile dssr<dttz> e;
    public int a = 0;
    public Object b;
    public dspt c;

    static {
        dttz dttzVar = new dttz();
        d = dttzVar;
        dsqw.cc(dttz.class, dttzVar);
    }

    private dttz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"b", "a", "c", dtty.class, dttu.class, dttg.class, dtts.class, dttw.class});
            }
            if (i2 == 3) {
                return new dttz();
            }
            if (i2 == 4) {
                return new dtte();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dttz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dttz.class) {
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
