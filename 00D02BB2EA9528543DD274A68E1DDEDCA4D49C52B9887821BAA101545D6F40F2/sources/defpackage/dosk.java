package defpackage;
/* compiled from: PG */
/* renamed from: dosk  reason: default package */
/* loaded from: classes6.dex */
public final class dosk extends dsqw<dosk, dosj> implements dssk {
    public static final dosk i;
    private static volatile dssr<dosk> j;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public dnfe e;
    public int f;
    public dosi g;
    public doad h;

    static {
        dosk doskVar = new dosk();
        i = doskVar;
        dsqw.cc(dosk.class, doskVar);
    }

    private dosk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", "c", dqgh.c(), "d", dosq.c(), "e", "f", doso.c(), "g", "h"});
            }
            if (i3 == 3) {
                return new dosk();
            }
            if (i3 == 4) {
                return new dosj();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dosk> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dosk.class) {
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
