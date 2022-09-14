package defpackage;
/* compiled from: PG */
/* renamed from: dshf  reason: default package */
/* loaded from: classes6.dex */
public final class dshf extends dsqw<dshf, dshe> implements dssk {
    public static final dshf e;
    private static volatile dssr<dshf> g;
    public dsgv a;
    public int c;
    private int f;
    public dsrj<dsia> b = dssu.b;
    public String d = "";

    static {
        dshf dshfVar = new dshf();
        e = dshfVar;
        dsqw.cc(dshf.class, dshfVar);
    }

    private dshf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001\u0004ဈ\u0002", new Object[]{"f", "a", "b", dsia.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dshf();
            }
            if (i2 == 4) {
                return new dshe();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dshf> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dshf.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
