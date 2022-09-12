package defpackage;
/* compiled from: PG */
/* renamed from: dgjq  reason: default package */
/* loaded from: classes6.dex */
public final class dgjq extends dsqw<dgjq, dgjp> implements dssk {
    public static final dgjq d;
    private static volatile dssr<dgjq> e;
    public int a;
    public String b = "";
    public dsrj<dgkm> c = dssu.b;

    static {
        dgjq dgjqVar = new dgjq();
        d = dgjqVar;
        dsqw.cc(dgjq.class, dgjqVar);
    }

    private dgjq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dgkm.class});
            }
            if (i2 == 3) {
                return new dgjq();
            }
            if (i2 == 4) {
                return new dgjp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgjq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgjq.class) {
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
