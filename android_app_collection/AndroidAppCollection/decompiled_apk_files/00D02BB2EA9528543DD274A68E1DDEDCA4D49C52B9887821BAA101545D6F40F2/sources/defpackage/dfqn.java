package defpackage;
/* compiled from: PG */
/* renamed from: dfqn  reason: default package */
/* loaded from: classes6.dex */
public final class dfqn extends dsqw<dfqn, dfqm> implements dssk {
    public static final dfqn d;
    private static volatile dssr<dfqn> e;
    public int a;
    public float b;
    public float c;

    static {
        dfqn dfqnVar = new dfqn();
        d = dfqnVar;
        dsqw.cc(dfqn.class, dfqnVar);
    }

    private dfqn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfqn();
            }
            if (i2 == 4) {
                return new dfqm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfqn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfqn.class) {
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
