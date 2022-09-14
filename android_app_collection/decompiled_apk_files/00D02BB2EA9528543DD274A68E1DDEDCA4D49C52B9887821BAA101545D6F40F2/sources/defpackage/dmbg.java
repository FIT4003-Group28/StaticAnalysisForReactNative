package defpackage;
/* compiled from: PG */
/* renamed from: dmbg  reason: default package */
/* loaded from: classes6.dex */
public final class dmbg extends dsqw<dmbg, dmbf> implements dssk {
    public static final dmbg i;
    private static volatile dssr<dmbg> j;
    public int a;
    public dmca b;
    public dmcc c;
    public dmce e;
    public dqwy f;
    public dsrj<dmay> d = dssu.b;
    public dsrj<dreq> g = dssu.b;
    public dsrj<drfo> h = dssu.b;

    static {
        dmbg dmbgVar = new dmbg();
        i = dmbgVar;
        dsqw.cc(dmbg.class, dmbgVar);
    }

    private dmbg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003\u0006\u001b\u0007\u001b", new Object[]{"a", "b", "c", "d", dmay.class, "e", "f", "g", dreq.class, "h", drfo.class});
            }
            if (i3 == 3) {
                return new dmbg();
            }
            if (i3 == 4) {
                return new dmbf();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dmbg> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dmbg.class) {
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
