package defpackage;
/* compiled from: PG */
/* renamed from: bqhv  reason: default package */
/* loaded from: classes4.dex */
public final class bqhv extends dsqw<bqhv, bqhm> implements dssk {
    public static final bqhv i;
    private static volatile dssr<bqhv> j;
    public int a;
    public dnqe b;
    public bokm c;
    public int d;
    public bqhr f;
    public bqhp h;
    public String e = "";
    public dsrj<bqhu> g = dssu.b;

    static {
        bqhv bqhvVar = new bqhv();
        i = bqhvVar;
        dsqw.cc(bqhv.class, bqhvVar);
    }

    private bqhv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဈ\u0003\u0005ဌ\u0002\u0006ဉ\u0005\u0007ဉ\u0004", new Object[]{"a", "b", "g", bqhu.class, "c", "e", "d", dnez.a, "h", "f"});
            }
            if (i3 == 3) {
                return new bqhv();
            }
            if (i3 == 4) {
                return new bqhm();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<bqhv> dssrVar = j;
            if (dssrVar == null) {
                synchronized (bqhv.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
