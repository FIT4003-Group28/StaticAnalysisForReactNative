package defpackage;
/* compiled from: PG */
/* renamed from: cbtn  reason: default package */
/* loaded from: classes4.dex */
public final class cbtn extends dsqw<cbtn, cbtk> implements dssk {
    public static final cbtn e;
    private static volatile dssr<cbtn> f;
    public int a;
    public String b = "";
    public String c = "";
    public int d = 1;

    static {
        cbtn cbtnVar = new cbtn();
        e = cbtnVar;
        dsqw.cc(cbtn.class, cbtnVar);
    }

    private cbtn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", cbtl.a});
            }
            if (i2 == 3) {
                return new cbtn();
            }
            if (i2 == 4) {
                return new cbtk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cbtn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cbtn.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
