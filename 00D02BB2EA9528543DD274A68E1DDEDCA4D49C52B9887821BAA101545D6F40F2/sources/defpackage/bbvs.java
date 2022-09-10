package defpackage;
/* compiled from: PG */
/* renamed from: bbvs  reason: default package */
/* loaded from: classes3.dex */
public final class bbvs extends dsqw<bbvs, bbvp> implements dssk {
    public static final bbvs d;
    private static volatile dssr<bbvs> e;
    public int a;
    public int b;
    public long c;

    static {
        bbvs bbvsVar = new bbvs();
        d = bbvsVar;
        dsqw.cc(bbvs.class, bbvsVar);
    }

    private bbvs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", bbvq.a, "c"});
            }
            if (i2 == 3) {
                return new bbvs();
            }
            if (i2 == 4) {
                return new bbvp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bbvs> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bbvs.class) {
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
