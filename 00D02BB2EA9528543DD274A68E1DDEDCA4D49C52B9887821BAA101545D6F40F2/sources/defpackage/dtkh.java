package defpackage;
/* compiled from: PG */
/* renamed from: dtkh  reason: default package */
/* loaded from: classes6.dex */
public final class dtkh extends dsqw<dtkh, dtkg> implements dssk {
    public static final dtkh d;
    private static volatile dssr<dtkh> f;
    public boolean a = true;
    public boolean b = true;
    public boolean c;
    private int e;

    static {
        dtkh dtkhVar = new dtkh();
        d = dtkhVar;
        dsqw.cc(dtkh.class, dtkhVar);
    }

    private dtkh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\n\u0003\u0000\u0000\u0000\u0001ဇ\u0000\bဇ\u0006\nဇ\u0001", new Object[]{"e", "a", "c", "b"});
            }
            if (i2 == 3) {
                return new dtkh();
            }
            if (i2 == 4) {
                return new dtkg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtkh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtkh.class) {
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
