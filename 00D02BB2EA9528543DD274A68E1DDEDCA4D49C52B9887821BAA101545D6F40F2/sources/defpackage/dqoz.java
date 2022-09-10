package defpackage;
/* compiled from: PG */
/* renamed from: dqoz  reason: default package */
/* loaded from: classes.dex */
public final class dqoz extends dsqw<dqoz, dqoy> implements dssk {
    public static final dqoz i;
    private static volatile dssr<dqoz> j;
    public int a;
    public dsrj<dpuq> b = dssu.b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public float h;

    static {
        dqoz dqozVar = new dqoz();
        i = dqozVar;
        dsqw.cc(dqoz.class, dqozVar);
    }

    private dqoz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000\u0003ဌ\u0001\u0004ဋ\u0002\u0005ဋ\u0003\u0006ခ\u0004\u0007ခ\u0005", new Object[]{"a", "b", dpuq.class, "c", dqow.a, "d", dqow.a, "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dqoz();
            }
            if (i3 == 4) {
                return new dqoy();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqoz> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dqoz.class) {
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
