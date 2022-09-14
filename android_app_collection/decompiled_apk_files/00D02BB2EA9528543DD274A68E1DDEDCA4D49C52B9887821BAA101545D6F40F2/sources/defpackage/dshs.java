package defpackage;
/* compiled from: PG */
/* renamed from: dshs  reason: default package */
/* loaded from: classes6.dex */
public final class dshs extends dsqw<dshs, dshp> implements dssk {
    public static final dshs d;
    private static volatile dssr<dshs> f;
    public int a = 0;
    public Object b;
    public dshl c;
    private int e;

    static {
        dshs dshsVar = new dshs();
        d = dshsVar;
        dsqw.cc(dshs.class, dshsVar);
    }

    private dshs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u0003ဿ\u0000", new Object[]{"b", "a", "e", "c", dsgk.class, dshq.a});
            }
            if (i2 == 3) {
                return new dshs();
            }
            if (i2 == 4) {
                return new dshp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dshs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dshs.class) {
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
