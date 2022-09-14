package defpackage;
/* compiled from: PG */
/* renamed from: dodc  reason: default package */
/* loaded from: classes6.dex */
public final class dodc extends dsqw<dodc, docz> implements dssk {
    public static final dodc i;
    private static volatile dssr<dodc> j;
    public int a;
    public int c;
    public boolean d;
    public int e;
    public doud g;
    public String b = "";
    public dsrj<dodb> f = dssu.b;
    public dsrj<String> h = dssu.b;

    static {
        dodc dodcVar = new dodc();
        i = dodcVar;
        dsqw.cc(dodc.class, dodcVar);
    }

    private dodc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0005ဌ\u0005\u0006\u001b\u0007ဉ\u0006\b\u001a\tဇ\u0003", new Object[]{"a", "b", "c", drlf.c(), "e", drla.a, "f", dodb.class, "g", "h", "d"});
            }
            if (i3 == 3) {
                return new dodc();
            }
            if (i3 == 4) {
                return new docz();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dodc> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dodc.class) {
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
