package defpackage;
/* compiled from: PG */
/* renamed from: doqt  reason: default package */
/* loaded from: classes6.dex */
public final class doqt extends dsqw<doqt, doqq> implements dssk {
    public static final doqt k;
    private static volatile dssr<doqt> l;
    public int a;
    public int c;
    public int d;
    public doud e;
    public dowb g;
    public dgas h;
    public boolean i;
    public int j;
    public dsrj<dpjx> b = dssu.b;
    public dsrj<doqs> f = dssu.b;

    static {
        doqt doqtVar = new doqt();
        k = doqtVar;
        dsqw.cc(doqt.class, doqtVar);
    }

    private doqt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001\u001b\u0002ဌ\u0000\u0003ဌ\u0001\u0004ဉ\u0002\u0005\u001b\u0006ဉ\u0003\u0007ဉ\u0004\bဇ\u0005\tင\u0006", new Object[]{"a", "b", dpjx.class, "c", dqvj.d(), "d", dpej.c(), "e", "f", doqs.class, "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new doqt();
            }
            if (i2 == 4) {
                return new doqq();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doqt> dssrVar = l;
            if (dssrVar == null) {
                synchronized (doqt.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
