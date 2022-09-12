package defpackage;
/* compiled from: PG */
/* renamed from: doxf  reason: default package */
/* loaded from: classes6.dex */
public final class doxf extends dsqw<doxf, doxe> implements dssk {
    public static final doxf k;
    private static volatile dssr<doxf> l;
    public int a;
    public dowb b;
    public dowb c;
    public dowb d;
    public dowb e;
    public dowb f;
    public dowb g;
    public dsrf h = dsqz.b;
    public dsrf i = dsqz.b;
    public boolean j;

    static {
        doxf doxfVar = new doxf();
        k = doxfVar;
        dsqw.cc(doxf.class, doxfVar);
    }

    private doxf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007/\b/\tဇ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new doxf();
            }
            if (i2 == 4) {
                return new doxe();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doxf> dssrVar = l;
            if (dssrVar == null) {
                synchronized (doxf.class) {
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
