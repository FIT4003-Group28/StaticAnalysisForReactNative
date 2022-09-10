package defpackage;
/* compiled from: PG */
/* renamed from: dmnn  reason: default package */
/* loaded from: classes.dex */
public final class dmnn extends dsqw<dmnn, dmnm> implements dssk {
    public static final dmnn c;
    private static volatile dssr<dmnn> e;
    public dsrj<dmsn> a = dssu.b;
    public dmme b;
    private int d;

    static {
        dmnn dmnnVar = new dmnn();
        c = dmnnVar;
        dsqw.cc(dmnn.class, dmnnVar);
    }

    private dmnn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"d", "a", dmsn.class, "b"});
            }
            if (i2 == 3) {
                return new dmnn();
            }
            if (i2 == 4) {
                return new dmnm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmnn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmnn.class) {
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
