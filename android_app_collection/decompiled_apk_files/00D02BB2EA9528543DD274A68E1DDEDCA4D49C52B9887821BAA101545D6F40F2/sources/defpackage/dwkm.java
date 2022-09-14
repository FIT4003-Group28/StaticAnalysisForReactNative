package defpackage;
/* compiled from: PG */
/* renamed from: dwkm  reason: default package */
/* loaded from: classes.dex */
public final class dwkm extends dsqw<dwkm, dwkl> implements dssk {
    public static final dsrg<Integer, dxdd> c = new dwkk();
    public static final dwkm e;
    private static volatile dssr<dwkm> g;
    public int a = 2592000;
    public dsrf b = dsqz.b;
    public dsrj<dunr> d = dssu.b;
    private int f;

    static {
        dwkm dwkmVar = new dwkm();
        e = dwkmVar;
        dsqw.cc(dwkm.class, dwkmVar);
    }

    private dwkm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001e\u0003\u001b", new Object[]{"f", "a", "b", dxdd.c(), "d", dunr.class});
            }
            if (i2 == 3) {
                return new dwkm();
            }
            if (i2 == 4) {
                return new dwkl();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwkm> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwkm.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
