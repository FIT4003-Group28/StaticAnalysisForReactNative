package defpackage;
/* compiled from: PG */
/* renamed from: dqcy  reason: default package */
/* loaded from: classes.dex */
public final class dqcy extends dsqw<dqcy, dqcx> implements dssk {
    public static final dqcy a;
    private static volatile dssr<dqcy> d;
    private int b;
    private boolean c;

    static {
        dqcy dqcyVar = new dqcy();
        a = dqcyVar;
        dsqw.cc(dqcy.class, dqcyVar);
    }

    private dqcy() {
    }

    public static /* synthetic */ void b(dqcy dqcyVar) {
        dqcyVar.b |= 1;
        dqcyVar.c = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dqcy();
            }
            if (i2 == 4) {
                return new dqcx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqcy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqcy.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
