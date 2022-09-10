package defpackage;
/* compiled from: PG */
/* renamed from: dsgh  reason: default package */
/* loaded from: classes6.dex */
public final class dsgh extends dsqw<dsgh, dsgg> implements dssk {
    public static final dsgh c;
    private static volatile dssr<dsgh> e;
    public dsrj<dsgk> a = dssu.b;
    public dudy b;
    private int d;

    static {
        dsgh dsghVar = new dsgh();
        c = dsghVar;
        dsqw.cc(dsgh.class, dsghVar);
    }

    private dsgh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"d", "a", dsgk.class, "b"});
            }
            if (i2 == 3) {
                return new dsgh();
            }
            if (i2 == 4) {
                return new dsgg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsgh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsgh.class) {
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
