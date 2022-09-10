package defpackage;
/* compiled from: PG */
/* renamed from: dotf  reason: default package */
/* loaded from: classes6.dex */
public final class dotf extends dsqw<dotf, dota> implements dssk {
    public static final dotf b;
    private static volatile dssr<dotf> c;
    public dsrj<dote> a = dssu.b;

    static {
        dotf dotfVar = new dotf();
        b = dotfVar;
        dsqw.cc(dotf.class, dotfVar);
    }

    private dotf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dote.class});
            }
            if (i2 == 3) {
                return new dotf();
            }
            if (i2 == 4) {
                return new dota();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dotf> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dotf.class) {
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
