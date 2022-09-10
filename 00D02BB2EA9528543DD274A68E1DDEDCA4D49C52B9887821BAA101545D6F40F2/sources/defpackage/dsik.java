package defpackage;
/* compiled from: PG */
/* renamed from: dsik  reason: default package */
/* loaded from: classes6.dex */
public final class dsik extends dsqw<dsik, dsij> implements dssk {
    public static final dsik d;
    private static volatile dssr<dsik> e;
    public int a;
    public int b;
    public dsgm c;

    static {
        dsik dsikVar = new dsik();
        d = dsikVar;
        dsqw.cc(dsik.class, dsikVar);
    }

    private dsik() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", dued.c(), "c"});
            }
            if (i2 == 3) {
                return new dsik();
            }
            if (i2 == 4) {
                return new dsij();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsik> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsik.class) {
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
