package defpackage;
/* compiled from: PG */
/* renamed from: dsgt  reason: default package */
/* loaded from: classes6.dex */
public final class dsgt extends dsqw<dsgt, dsgr> implements dssk {
    public static final dsgt f;
    private static volatile dssr<dsgt> g;
    public int a;
    public Object c;
    public dsgv d;
    public int b = 0;
    public dsrj<dsii> e = dssu.b;

    static {
        dsgt dsgtVar = new dsgt();
        f = dsgtVar;
        dsqw.cc(dsgt.class, dsgtVar);
    }

    private dsgt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005\u001b", new Object[]{"c", "b", "a", "d", dshb.class, dsic.class, dshi.class, "e", dsii.class});
            }
            if (i2 == 3) {
                return new dsgt();
            }
            if (i2 == 4) {
                return new dsgr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsgt> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dsgt.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
