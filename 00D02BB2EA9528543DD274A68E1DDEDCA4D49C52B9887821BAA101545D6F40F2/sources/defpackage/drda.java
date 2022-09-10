package defpackage;
/* compiled from: PG */
/* renamed from: drda  reason: default package */
/* loaded from: classes6.dex */
public final class drda extends dsqw<drda, drcz> implements dssk {
    public static final drda e;
    private static volatile dssr<drda> f;
    public int a;
    public dsrj<drcg> b = dssu.b;
    public boolean c;
    public boolean d;

    static {
        drda drdaVar = new drda();
        e = drdaVar;
        dsqw.cc(drda.class, drdaVar);
    }

    private drda() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u001b\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"a", "b", drcg.class, "c", "d"});
            }
            if (i2 == 3) {
                return new drda();
            }
            if (i2 == 4) {
                return new drcz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drda> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drda.class) {
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
