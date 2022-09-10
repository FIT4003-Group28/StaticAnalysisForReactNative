package defpackage;
/* compiled from: PG */
/* renamed from: dsjz  reason: default package */
/* loaded from: classes6.dex */
public final class dsjz extends dsqw<dsjz, dsjy> implements dssk {
    public static final dsjz a;
    private static volatile dssr<dsjz> b;

    static {
        dsjz dsjzVar = new dsjz();
        a = dsjzVar;
        dsqw.cc(dsjz.class, dsjzVar);
    }

    private dsjz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dsjz();
            }
            if (i2 == 4) {
                return new dsjy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsjz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dsjz.class) {
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
