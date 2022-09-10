package defpackage;
/* compiled from: PG */
/* renamed from: dunr  reason: default package */
/* loaded from: classes.dex */
public final class dunr extends dsqw<dunr, dunq> implements dssk {
    public static final dsrg<Integer, dxdd> c = new dunp();
    public static final dunr d;
    private static volatile dssr<dunr> f;
    public int a;
    public dsrf b = dsqz.b;
    private int e;

    static {
        dunr dunrVar = new dunr();
        d = dunrVar;
        dsqw.cc(dunr.class, dunrVar);
    }

    private dunr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001e", new Object[]{"e", "a", "b", dxdd.c()});
            }
            if (i2 == 3) {
                return new dunr();
            }
            if (i2 == 4) {
                return new dunq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dunr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dunr.class) {
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
