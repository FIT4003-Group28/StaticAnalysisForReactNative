package defpackage;
/* compiled from: PG */
/* renamed from: dtts  reason: default package */
/* loaded from: classes6.dex */
public final class dtts extends dsqw<dtts, dtth> implements dssk {
    public static final dtts d;
    private static volatile dssr<dtts> e;
    public int a = 0;
    public Object b;
    public int c;

    static {
        dtts dttsVar = new dtts();
        d = dttsVar;
        dsqw.cc(dtts.class, dttsVar);
    }

    private dtts() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", "c", dttr.class, dttj.class, dttn.class, dttl.class});
            }
            if (i2 == 3) {
                return new dtts();
            }
            if (i2 == 4) {
                return new dtth();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtts> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtts.class) {
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
