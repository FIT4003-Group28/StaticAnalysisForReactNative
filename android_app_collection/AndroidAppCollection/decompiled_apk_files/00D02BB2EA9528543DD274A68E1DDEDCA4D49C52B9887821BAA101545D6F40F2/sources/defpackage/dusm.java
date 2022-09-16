package defpackage;
/* compiled from: PG */
/* renamed from: dusm  reason: default package */
/* loaded from: classes6.dex */
public final class dusm extends dsqw<dusm, dusl> implements dssk {
    public static final dusm a;
    private static volatile dssr<dusm> d;
    private int b;
    private int c = 5;

    static {
        dusm dusmVar = new dusm();
        a = dusmVar;
        dsqw.cc(dusm.class, dusmVar);
    }

    private dusm() {
    }

    public static /* synthetic */ void c(dusm dusmVar) {
        dusmVar.b |= 1;
        dusmVar.c = 20;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dusm();
            }
            if (i2 == 4) {
                return new dusl();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dusm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dusm.class) {
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
