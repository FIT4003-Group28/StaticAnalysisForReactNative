package defpackage;
/* compiled from: PG */
/* renamed from: dqtn  reason: default package */
/* loaded from: classes6.dex */
public final class dqtn extends dsqw<dqtn, dqtm> implements dssk {
    public static final dqtn a;
    private static volatile dssr<dqtn> f;
    private int b;
    private boolean c;
    private boolean d;
    private boolean e;

    static {
        dqtn dqtnVar = new dqtn();
        a = dqtnVar;
        dsqw.cc(dqtn.class, dqtnVar);
    }

    private dqtn() {
    }

    public static /* synthetic */ void b(dqtn dqtnVar) {
        dqtnVar.b |= 1;
        dqtnVar.c = true;
    }

    public static /* synthetic */ void c(dqtn dqtnVar) {
        dqtnVar.b |= 2;
        dqtnVar.d = true;
    }

    public static /* synthetic */ void d(dqtn dqtnVar) {
        dqtnVar.b |= 4;
        dqtnVar.e = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0001\u0002ဇ\u0000\u0003ဇ\u0002", new Object[]{"b", "d", "c", "e"});
            }
            if (i2 == 3) {
                return new dqtn();
            }
            if (i2 == 4) {
                return new dqtm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqtn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqtn.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
