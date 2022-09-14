package defpackage;
/* compiled from: PG */
/* renamed from: ckyc  reason: default package */
/* loaded from: classes5.dex */
public final class ckyc extends dsqw<ckyc, ckxz> implements dssk {
    public static final ckyc d;
    private static volatile dssr<ckyc> e;
    public int a;
    public long b;
    public ckyb c;

    static {
        ckyc ckycVar = new ckyc();
        d = ckycVar;
        dsqw.cc(ckyc.class, ckycVar);
    }

    private ckyc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ckyc();
            }
            if (i2 == 4) {
                return new ckxz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckyc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ckyc.class) {
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
