package defpackage;
/* compiled from: PG */
/* renamed from: dupx  reason: default package */
/* loaded from: classes.dex */
public final class dupx extends dsqw<dupx, dupw> implements dssk {
    public static final dupx c;
    private static volatile dssr<dupx> e;
    public drlr a;
    public dsrj<drlr> b = dssu.b;
    private int d;

    static {
        dupx dupxVar = new dupx();
        c = dupxVar;
        dsqw.cc(dupx.class, dupxVar);
    }

    private dupx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", drlr.class});
            }
            if (i2 == 3) {
                return new dupx();
            }
            if (i2 == 4) {
                return new dupw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dupx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dupx.class) {
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
