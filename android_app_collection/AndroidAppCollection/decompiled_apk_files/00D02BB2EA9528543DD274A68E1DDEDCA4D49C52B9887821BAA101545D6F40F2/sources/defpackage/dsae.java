package defpackage;
/* compiled from: PG */
/* renamed from: dsae  reason: default package */
/* loaded from: classes6.dex */
public final class dsae extends dsqw<dsae, dsad> implements dssk {
    public static final dsae d;
    private static volatile dssr<dsae> e;
    public int a;
    public drxx b;
    public int c;

    static {
        dsae dsaeVar = new dsae();
        d = dsaeVar;
        dsqw.cc(dsae.class, dsaeVar);
    }

    private dsae() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dsab.a});
            }
            if (i2 == 3) {
                return new dsae();
            }
            if (i2 == 4) {
                return new dsad();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsae> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsae.class) {
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
