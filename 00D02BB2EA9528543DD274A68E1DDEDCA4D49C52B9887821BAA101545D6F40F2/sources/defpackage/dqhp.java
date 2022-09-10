package defpackage;
/* compiled from: PG */
/* renamed from: dqhp  reason: default package */
/* loaded from: classes6.dex */
public final class dqhp extends dsqw<dqhp, dqho> implements dssk {
    public static final dqhp d;
    private static volatile dssr<dqhp> e;
    public int a;
    public dpnu b;
    public dpnu c;

    static {
        dqhp dqhpVar = new dqhp();
        d = dqhpVar;
        dsqw.cc(dqhp.class, dqhpVar);
    }

    private dqhp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqhp();
            }
            if (i2 == 4) {
                return new dqho();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqhp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqhp.class) {
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
