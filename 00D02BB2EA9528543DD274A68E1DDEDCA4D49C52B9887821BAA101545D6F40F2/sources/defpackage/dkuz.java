package defpackage;
/* compiled from: PG */
/* renamed from: dkuz  reason: default package */
/* loaded from: classes.dex */
public final class dkuz extends dsqw<dkuz, dkuy> implements dssk {
    public static final dkuz i;
    private static volatile dssr<dkuz> k;
    public boolean a;
    public boolean b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean h;
    private int j;
    public int c = 5000;
    public int g = 10000;

    static {
        dkuz dkuzVar = new dkuz();
        i = dkuzVar;
        dsqw.cc(dkuz.class, dkuzVar);
    }

    private dkuz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004င\u0003\u0005ဇ\u0004\u0007ဇ\u0006\bဇ\u0007\tင\b\u000bဇ\n", new Object[]{"j", "a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dkuz();
            }
            if (i3 == 4) {
                return new dkuy();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dkuz> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dkuz.class) {
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
