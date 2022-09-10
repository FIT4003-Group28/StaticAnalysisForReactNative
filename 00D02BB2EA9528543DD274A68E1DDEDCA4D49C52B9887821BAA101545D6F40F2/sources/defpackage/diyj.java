package defpackage;
/* compiled from: PG */
/* renamed from: diyj  reason: default package */
/* loaded from: classes6.dex */
public final class diyj extends dsqw<diyj, diyi> implements dssk {
    public static final diyj i;
    private static volatile dssr<diyj> k;
    public dihv a;
    public dihv b;
    public dihv c;
    public dnpq d;
    public String e = "";
    public String f = "";
    public dihz g;
    public dnpq h;
    private int j;

    static {
        diyj diyjVar = new diyj();
        i = diyjVar;
        dsqw.cc(diyj.class, diyjVar);
    }

    private diyj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"j", "a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new diyj();
            }
            if (i3 == 4) {
                return new diyi();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<diyj> dssrVar = k;
            if (dssrVar == null) {
                synchronized (diyj.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
