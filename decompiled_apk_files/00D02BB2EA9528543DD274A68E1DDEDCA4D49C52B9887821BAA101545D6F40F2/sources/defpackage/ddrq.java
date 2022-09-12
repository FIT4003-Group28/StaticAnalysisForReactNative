package defpackage;
/* compiled from: PG */
/* renamed from: ddrq  reason: default package */
/* loaded from: classes6.dex */
public final class ddrq extends dsqw<ddrq, ddrp> implements dssk {
    public static final ddrq a;
    private static volatile dssr<ddrq> d;
    private int b;
    private boolean c;

    static {
        ddrq ddrqVar = new ddrq();
        a = ddrqVar;
        dsqw.cc(ddrq.class, ddrqVar);
    }

    private ddrq() {
    }

    public static /* synthetic */ void b(ddrq ddrqVar) {
        ddrqVar.b |= 1;
        ddrqVar.c = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new ddrq();
            }
            if (i2 == 4) {
                return new ddrp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddrq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddrq.class) {
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
