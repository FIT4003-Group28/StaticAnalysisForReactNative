package defpackage;
/* compiled from: PG */
/* renamed from: duca  reason: default package */
/* loaded from: classes6.dex */
public final class duca extends dsqw<duca, dubx> implements dssk {
    public static final duca b;
    private static volatile dssr<duca> c;
    public dsrj<dubz> a = dssu.b;

    static {
        duca ducaVar = new duca();
        b = ducaVar;
        dsqw.cc(duca.class, ducaVar);
    }

    private duca() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dubz.class});
            }
            if (i2 == 3) {
                return new duca();
            }
            if (i2 == 4) {
                return new dubx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duca> dssrVar = c;
            if (dssrVar == null) {
                synchronized (duca.class) {
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
