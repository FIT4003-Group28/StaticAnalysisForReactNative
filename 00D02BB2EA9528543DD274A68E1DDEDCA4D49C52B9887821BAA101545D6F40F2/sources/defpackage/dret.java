package defpackage;
/* compiled from: PG */
/* renamed from: dret  reason: default package */
/* loaded from: classes6.dex */
public final class dret extends dsqw<dret, dres> implements dssk {
    public static final dret a;
    private static volatile dssr<dret> b;

    static {
        dret dretVar = new dret();
        a = dretVar;
        dsqw.cc(dret.class, dretVar);
    }

    private dret() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dret();
            }
            if (i2 == 4) {
                return new dres();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dret> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dret.class) {
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
