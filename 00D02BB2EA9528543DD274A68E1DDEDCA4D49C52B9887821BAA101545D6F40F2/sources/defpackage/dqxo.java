package defpackage;
/* compiled from: PG */
/* renamed from: dqxo  reason: default package */
/* loaded from: classes.dex */
public final class dqxo extends dsqw<dqxo, dqxn> implements dssk {
    public static final dqxo b;
    private static volatile dssr<dqxo> c;
    public dsrj<dqxm> a = dssu.b;

    static {
        dqxo dqxoVar = new dqxo();
        b = dqxoVar;
        dsqw.cc(dqxo.class, dqxoVar);
    }

    private dqxo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqxm.class});
            }
            if (i2 == 3) {
                return new dqxo();
            }
            if (i2 == 4) {
                return new dqxn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqxo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dqxo.class) {
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
