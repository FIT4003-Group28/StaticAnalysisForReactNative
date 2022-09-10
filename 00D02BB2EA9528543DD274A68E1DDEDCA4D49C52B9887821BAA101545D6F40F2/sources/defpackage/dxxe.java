package defpackage;
/* compiled from: PG */
/* renamed from: dxxe  reason: default package */
/* loaded from: classes6.dex */
public final class dxxe extends dsqw<dxxe, dxxd> implements dssk {
    public static final dxxe e;
    private static volatile dssr<dxxe> f;
    public int a = 0;
    public Object b;
    public dxwi c;
    public int d;

    static {
        dxxe dxxeVar = new dxxe();
        e = dxxeVar;
        dsqw.cc(dxxe.class, dxxeVar);
    }

    private dxxe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\t\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", "d", "c", dxvs.class, dxvs.class, dxvu.class});
            }
            if (i2 == 3) {
                return new dxxe();
            }
            if (i2 == 4) {
                return new dxxd();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxxe> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxxe.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
