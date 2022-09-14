package defpackage;
/* compiled from: PG */
/* renamed from: dqex  reason: default package */
/* loaded from: classes.dex */
public final class dqex extends dsqw<dqex, dqeu> implements dssk {
    public static final dqex e;
    private static volatile dssr<dqex> f;
    public int a;
    public boolean b;
    public dsrj<dpva> c = dssu.b;
    public dsrf d = dsqz.b;

    static {
        dqex dqexVar = new dqex();
        e = dqexVar;
        dsqw.cc(dqex.class, dqexVar);
    }

    private dqex() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဇ\u0000\u0002\u001b\u0003\u001e", new Object[]{"a", "b", "c", dpva.class, "d", dqew.c()});
            }
            if (i2 == 3) {
                return new dqex();
            }
            if (i2 == 4) {
                return new dqeu();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqex> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqex.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
