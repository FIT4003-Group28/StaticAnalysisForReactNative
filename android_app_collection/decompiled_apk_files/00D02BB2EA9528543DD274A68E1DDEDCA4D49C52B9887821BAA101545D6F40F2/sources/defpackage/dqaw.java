package defpackage;
/* compiled from: PG */
/* renamed from: dqaw  reason: default package */
/* loaded from: classes6.dex */
public final class dqaw extends dsqw<dqaw, dqav> implements dssk {
    public static final dqaw d;
    private static volatile dssr<dqaw> e;
    public int a;
    public int b;
    public long c;

    static {
        dqaw dqawVar = new dqaw();
        d = dqawVar;
        dsqw.cc(dqaw.class, dqawVar);
    }

    private dqaw() {
    }

    public static /* synthetic */ void b(dqaw dqawVar) {
        dqawVar.a |= 2;
        dqawVar.c = -1L;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", dfqe.c(), "c"});
            }
            if (i2 == 3) {
                return new dqaw();
            }
            if (i2 == 4) {
                return new dqav();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqaw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqaw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
