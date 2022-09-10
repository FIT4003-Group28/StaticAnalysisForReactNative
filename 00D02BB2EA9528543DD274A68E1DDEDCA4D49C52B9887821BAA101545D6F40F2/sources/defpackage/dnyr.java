package defpackage;
/* compiled from: PG */
/* renamed from: dnyr  reason: default package */
/* loaded from: classes6.dex */
public final class dnyr extends dsqw<dnyr, dnyq> implements dssk {
    public static final dnyr a;
    private static volatile dssr<dnyr> d;
    private int b;
    private boolean c;

    static {
        dnyr dnyrVar = new dnyr();
        a = dnyrVar;
        dsqw.cc(dnyr.class, dnyrVar);
    }

    private dnyr() {
    }

    public static /* synthetic */ void b(dnyr dnyrVar) {
        dnyrVar.b |= 1;
        dnyrVar.c = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dnyr();
            }
            if (i2 == 4) {
                return new dnyq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnyr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnyr.class) {
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
