package defpackage;
/* compiled from: PG */
/* renamed from: tqn  reason: default package */
/* loaded from: classes7.dex */
public final class tqn extends dsqw<tqn, tqm> implements dssk {
    public static final tqn b;
    private static volatile dssr<tqn> c;
    public dsrj<tql> a = dssu.b;

    static {
        tqn tqnVar = new tqn();
        b = tqnVar;
        dsqw.cc(tqn.class, tqnVar);
    }

    private tqn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", tql.class});
            }
            if (i2 == 3) {
                return new tqn();
            }
            if (i2 == 4) {
                return new tqm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<tqn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (tqn.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
