package defpackage;
/* compiled from: PG */
/* renamed from: dkqn  reason: default package */
/* loaded from: classes.dex */
public final class dkqn extends dsqw<dkqn, dkqm> implements dssk {
    public static final dkqn i;
    private static volatile dssr<dkqn> j;
    public int a;
    public dkhd b;
    public boolean c;
    public boolean e;
    public boolean f;
    public int d = 600;
    public int g = 10080;
    public int h = 5000;

    static {
        dkqn dkqnVar = new dkqn();
        i = dkqnVar;
        dsqw.cc(dkqn.class, dkqnVar);
    }

    private dkqn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0006င\u0007\bဇ\u0001\tဇ\b\u000bဇ\t\fင\n\rင\u000b", new Object[]{"a", "b", "d", "c", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dkqn();
            }
            if (i3 == 4) {
                return new dkqm();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dkqn> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dkqn.class) {
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
