package defpackage;
/* compiled from: PG */
/* renamed from: dpci  reason: default package */
/* loaded from: classes6.dex */
public final class dpci extends dsqw<dpci, dpch> implements dssk {
    public static final dpci i;
    private static volatile dssr<dpci> j;
    public int a;
    public dgaw b;
    public dgaw c;
    public dgas d;
    public dgaw e;
    public dgaw f;
    public int g;
    public int h;

    static {
        dpci dpciVar = new dpci();
        i = dpciVar;
        dsqw.cc(dpci.class, dpciVar);
    }

    private dpci() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", dpbt.a, "h", dpbw.c()});
            }
            if (i3 == 3) {
                return new dpci();
            }
            if (i3 == 4) {
                return new dpch();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dpci> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dpci.class) {
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
