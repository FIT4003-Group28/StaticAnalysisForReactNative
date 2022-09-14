package defpackage;
/* compiled from: PG */
/* renamed from: dote  reason: default package */
/* loaded from: classes6.dex */
public final class dote extends dsqw<dote, dotd> implements dssk {
    public static final dote d;
    private static volatile dssr<dote> f;
    public int a;
    public int b;
    public int c;
    private int e;

    static {
        dote doteVar = new dote();
        d = doteVar;
        dsqw.cc(dote.class, doteVar);
    }

    private dote() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", dotb.a, "b", "c"});
            }
            if (i2 == 3) {
                return new dote();
            }
            if (i2 == 4) {
                return new dotd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dote> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dote.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
