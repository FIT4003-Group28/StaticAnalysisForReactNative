package defpackage;
/* compiled from: PG */
/* renamed from: cpyz  reason: default package */
/* loaded from: classes5.dex */
public final class cpyz extends dsqw<cpyz, cpyy> implements dssk {
    public static final cpyz i;
    private static volatile dssr<cpyz> j;
    public int a;
    public boolean f;
    public boolean h;
    public dsrf b = dsqz.b;
    public dsrj<String> c = dssu.b;
    public String d = "";
    public String e = "";
    public dsrf g = dsqz.b;

    static {
        cpyz cpyzVar = new cpyz();
        i = cpyzVar;
        dsqw.cc(cpyz.class, cpyzVar);
    }

    private cpyz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u0016\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဇ\u0002\u0005\u001a\u0006\u0016\u0007ဇ\u0003", new Object[]{"a", "b", "d", "e", "f", "c", "g", "h"});
            }
            if (i3 == 3) {
                return new cpyz();
            }
            if (i3 == 4) {
                return new cpyy();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<cpyz> dssrVar = j;
            if (dssrVar == null) {
                synchronized (cpyz.class) {
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
