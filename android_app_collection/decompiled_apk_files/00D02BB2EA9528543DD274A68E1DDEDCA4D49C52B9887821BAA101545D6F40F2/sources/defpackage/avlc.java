package defpackage;
/* compiled from: PG */
/* renamed from: avlc  reason: default package */
/* loaded from: classes3.dex */
public final class avlc extends dsqw<avlc, avlb> implements dssk {
    public static final avlc g;
    private static volatile dssr<avlc> h;
    public int a;
    public avla b;
    public dlua c;
    public boolean d;
    public String e = "";
    public boolean f;

    static {
        avlc avlcVar = new avlc();
        g = avlcVar;
        dsqw.cc(avlc.class, avlcVar);
    }

    private avlc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new avlc();
            }
            if (i2 == 4) {
                return new avlb();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<avlc> dssrVar = h;
            if (dssrVar == null) {
                synchronized (avlc.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
