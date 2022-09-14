package defpackage;
/* compiled from: PG */
/* renamed from: dqch  reason: default package */
/* loaded from: classes6.dex */
public final class dqch extends dsqw<dqch, dqcg> implements dssk {
    public static final dqch a;
    private static volatile dssr<dqch> d;
    private int b;
    private boolean c;

    static {
        dqch dqchVar = new dqch();
        a = dqchVar;
        dsqw.cc(dqch.class, dqchVar);
    }

    private dqch() {
    }

    public static /* synthetic */ void b(dqch dqchVar) {
        dqchVar.b |= 1;
        dqchVar.c = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dqch();
            }
            if (i2 == 4) {
                return new dqcg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqch> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqch.class) {
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
