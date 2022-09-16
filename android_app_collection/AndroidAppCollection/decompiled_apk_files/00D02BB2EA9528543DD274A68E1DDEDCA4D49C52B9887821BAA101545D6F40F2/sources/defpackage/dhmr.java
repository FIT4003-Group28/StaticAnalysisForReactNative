package defpackage;
/* compiled from: PG */
/* renamed from: dhmr  reason: default package */
/* loaded from: classes6.dex */
public final class dhmr extends dsqw<dhmr, dhmg> implements dssk {
    public static final dhmr i;
    private static volatile dssr<dhmr> j;
    public int a;
    public int b;
    public dhmm c;
    public dhmi d;
    public dhmk e;
    public dhmq f;
    public dhmf g;
    public dsrj<dhmd> h = dssu.b;

    static {
        dhmr dhmrVar = new dhmr();
        i = dhmrVar;
        dsqw.cc(dhmr.class, dhmrVar);
    }

    private dhmr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007\u001b", new Object[]{"a", "b", dhmo.c(), "c", "d", "e", "f", "g", "h", dhmd.class});
            }
            if (i3 == 3) {
                return new dhmr();
            }
            if (i3 == 4) {
                return new dhmg();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dhmr> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dhmr.class) {
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
