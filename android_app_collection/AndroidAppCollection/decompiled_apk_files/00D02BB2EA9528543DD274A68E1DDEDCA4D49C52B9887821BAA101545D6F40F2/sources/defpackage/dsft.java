package defpackage;
/* compiled from: PG */
/* renamed from: dsft  reason: default package */
/* loaded from: classes6.dex */
public final class dsft extends dsqw<dsft, dsfs> implements dssk {
    public static final dsft d;
    private static volatile dssr<dsft> f;
    public dsfg a;
    public dsfc b;
    public dsfc c;
    private int e;

    static {
        dsft dsftVar = new dsft();
        d = dsftVar;
        dsqw.cc(dsft.class, dsftVar);
    }

    private dsft() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dsft();
            }
            if (i2 == 4) {
                return new dsfs();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsft> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsft.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
