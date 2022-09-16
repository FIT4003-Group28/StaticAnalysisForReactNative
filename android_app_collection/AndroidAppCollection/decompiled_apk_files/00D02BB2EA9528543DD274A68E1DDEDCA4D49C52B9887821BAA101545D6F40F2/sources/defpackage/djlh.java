package defpackage;
/* compiled from: PG */
/* renamed from: djlh  reason: default package */
/* loaded from: classes6.dex */
public final class djlh extends dsqw<djlh, djlf> implements dssk {
    public static final djlh c;
    private static volatile dssr<djlh> d;
    public int a;
    public int b;

    static {
        djlh djlhVar = new djlh();
        c = djlhVar;
        dsqw.cc(djlh.class, djlhVar);
    }

    private djlh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", djlg.a});
            }
            if (i2 == 3) {
                return new djlh();
            }
            if (i2 == 4) {
                return new djlf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djlh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djlh.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
