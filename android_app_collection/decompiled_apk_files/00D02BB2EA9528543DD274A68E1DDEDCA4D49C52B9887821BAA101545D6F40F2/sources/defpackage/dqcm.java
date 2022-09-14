package defpackage;
/* compiled from: PG */
/* renamed from: dqcm  reason: default package */
/* loaded from: classes.dex */
public final class dqcm extends dsqw<dqcm, dqck> implements dssk {
    public static final dqcm e;
    private static volatile dssr<dqcm> h;
    public int a;
    public int b = 0;
    public Object c;
    public boolean d;
    private boolean f;
    private boolean g;

    static {
        dqcm dqcmVar = new dqcm();
        e = dqcmVar;
        dsqw.cc(dqcm.class, dqcmVar);
    }

    private dqcm() {
    }

    public static /* synthetic */ void b(dqcm dqcmVar) {
        dqcmVar.a |= 8;
        dqcmVar.f = true;
    }

    public static /* synthetic */ void c(dqcm dqcmVar) {
        dqcmVar.a |= 16;
        dqcmVar.g = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0005\u0001\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"c", "b", "a", dqco.class, dqcf.class, "f", "g", "d"});
            }
            if (i2 == 3) {
                return new dqcm();
            }
            if (i2 == 4) {
                return new dqck();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqcm> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dqcm.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
