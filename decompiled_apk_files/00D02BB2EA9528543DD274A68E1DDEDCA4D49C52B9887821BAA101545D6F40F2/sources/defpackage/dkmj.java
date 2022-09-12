package defpackage;
/* compiled from: PG */
/* renamed from: dkmj  reason: default package */
/* loaded from: classes.dex */
public final class dkmj extends dsqw<dkmj, dkmi> implements dssk {
    public static final dkmj a;
    private static volatile dssr<dkmj> b;

    static {
        dkmj dkmjVar = new dkmj();
        a = dkmjVar;
        dsqw.cc(dkmj.class, dkmjVar);
    }

    private dkmj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkmj();
            }
            if (i2 == 4) {
                return new dkmi();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkmj> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkmj.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
