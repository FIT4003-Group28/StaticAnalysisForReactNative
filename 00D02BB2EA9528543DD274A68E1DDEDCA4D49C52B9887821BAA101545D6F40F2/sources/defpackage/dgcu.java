package defpackage;
/* compiled from: PG */
/* renamed from: dgcu  reason: default package */
/* loaded from: classes6.dex */
public final class dgcu extends dsqw<dgcu, dgct> implements dssk {
    public static final dgcu k;
    private static volatile dssr<dgcu> m;
    public dgda a;
    public dgda b;
    public dgda c;
    public dgda d;
    public dgda e;
    public dgda f;
    public dgda g;
    public dgda h;
    public dgda i;
    public dgda j;
    private int l;

    static {
        dgcu dgcuVar = new dgcu();
        k = dgcuVar;
        dsqw.cc(dgcu.class, dgcuVar);
    }

    private dgcu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t", new Object[]{"l", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new dgcu();
            }
            if (i2 == 4) {
                return new dgct();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgcu> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dgcu.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
