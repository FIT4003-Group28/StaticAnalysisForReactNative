package defpackage;
/* compiled from: PG */
/* renamed from: dftb  reason: default package */
/* loaded from: classes6.dex */
public final class dftb extends dsqw<dftb, dfta> implements dssk {
    public static final dftb n;
    private static volatile dssr<dftb> o;
    public int a;
    public dftd b;
    public dhjz c;
    public dhkb d;
    public dhkd e;
    public dhkd f;
    public dhkd g;
    public dhkd h;
    public dfth i;
    public dfsi k;
    public dsrj<dfsz> j = dssu.b;
    public dsrj<dftr> l = dssu.b;
    public int m = 1;

    static {
        dftb dftbVar = new dftb();
        n = dftbVar;
        dsqw.cc(dftb.class, dftbVar);
    }

    private dftb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\t\u001b\nဉ\b\u000b\u001b\fဌ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", dfsz.class, "k", "l", dftr.class, "m", dftk.a});
            }
            if (i2 == 3) {
                return new dftb();
            }
            if (i2 == 4) {
                return new dfta();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dftb> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dftb.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
