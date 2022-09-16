package defpackage;
/* compiled from: PG */
/* renamed from: dgji  reason: default package */
/* loaded from: classes6.dex */
public final class dgji extends dsqw<dgji, dgjh> implements dssk {
    public static final dgji c;
    private static volatile dssr<dgji> e;
    public int a;
    public float b;
    private int d;

    static {
        dgji dgjiVar = new dgji();
        c = dgjiVar;
        dsqw.cc(dgji.class, dgjiVar);
    }

    private dgji() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dgji();
            }
            if (i2 == 4) {
                return new dgjh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgji> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgji.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
