package defpackage;
/* compiled from: PG */
/* renamed from: chxp  reason: default package */
/* loaded from: classes4.dex */
public final class chxp extends dsqw<chxp, chxm> implements dssk {
    public static final chxp k;
    private static volatile dssr<chxp> l;
    public int a;
    public int b;
    public boolean d;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public dsrj<String> c = dssu.b;
    public dsrj<String> e = dssu.b;

    static {
        chxp chxpVar = new chxp();
        k = chxpVar;
        dsqw.cc(chxp.class, chxpVar);
    }

    private chxp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0002\u0000\u0001\u001a\u0003ဇ\u0001\u0004ဌ\u0000\u0005ဋ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဇ\u0005\tဇ\u0006\n\u001a", new Object[]{"a", "c", "d", "b", chxo.c(), "f", "g", "h", "i", "j", "e"});
            }
            if (i2 == 3) {
                return new chxp();
            }
            if (i2 == 4) {
                return new chxm();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chxp> dssrVar = l;
            if (dssrVar == null) {
                synchronized (chxp.class) {
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
