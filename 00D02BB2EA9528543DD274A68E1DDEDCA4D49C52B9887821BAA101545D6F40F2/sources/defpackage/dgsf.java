package defpackage;
/* compiled from: PG */
/* renamed from: dgsf  reason: default package */
/* loaded from: classes6.dex */
public final class dgsf extends dsqw<dgsf, dgsa> implements dssk {
    public static final dgsf i;
    private static volatile dssr<dgsf> j;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g = 1;
    public int h;

    static {
        dgsf dgsfVar = new dgsf();
        i = dgsfVar;
        dsqw.cc(dgsf.class, dgsfVar);
    }

    private dgsf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဌ\u0004\bဌ\u0007\tင\b", new Object[]{"a", "b", "c", "d", "e", "f", dgsb.a, "g", dgsd.a, "h"});
            }
            if (i3 == 3) {
                return new dgsf();
            }
            if (i3 == 4) {
                return new dgsa();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dgsf> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dgsf.class) {
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
