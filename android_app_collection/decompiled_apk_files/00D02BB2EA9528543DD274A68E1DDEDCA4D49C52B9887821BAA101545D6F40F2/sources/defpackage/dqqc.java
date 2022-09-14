package defpackage;
/* compiled from: PG */
/* renamed from: dqqc  reason: default package */
/* loaded from: classes6.dex */
public final class dqqc extends dsqw<dqqc, dqqb> implements dssk {
    public static final dqqc i;
    private static volatile dssr<dqqc> j;
    public int a;
    public dqqk b;
    public dqqs c;
    public dqrb d;
    public dqrh e;
    public dqrp f;
    public dqrt g;
    public dqrx h;

    static {
        dqqc dqqcVar = new dqqc();
        i = dqqcVar;
        dsqw.cc(dqqc.class, dqqcVar);
    }

    private dqqc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0004\u0005ဉ\u0003\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d", "f", "e", "g", "h"});
            }
            if (i3 == 3) {
                return new dqqc();
            }
            if (i3 == 4) {
                return new dqqb();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqqc> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dqqc.class) {
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
