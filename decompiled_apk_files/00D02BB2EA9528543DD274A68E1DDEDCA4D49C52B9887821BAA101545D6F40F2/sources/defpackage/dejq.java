package defpackage;
/* compiled from: PG */
/* renamed from: dejq  reason: default package */
/* loaded from: classes6.dex */
public final class dejq extends dsqw<dejq, dejp> implements dssk {
    public static final dejq b;
    private static volatile dssr<dejq> c;
    public long a;

    static {
        dejq dejqVar = new dejq();
        b = dejqVar;
        dsqw.cc(dejq.class, dejqVar);
    }

    private dejq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dejq();
            }
            if (i2 == 4) {
                return new dejp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dejq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dejq.class) {
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
