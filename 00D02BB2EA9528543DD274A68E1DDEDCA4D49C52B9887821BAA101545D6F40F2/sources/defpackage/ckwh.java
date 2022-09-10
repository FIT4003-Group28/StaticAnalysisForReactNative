package defpackage;
/* compiled from: PG */
/* renamed from: ckwh  reason: default package */
/* loaded from: classes5.dex */
public final class ckwh extends dsqw<ckwh, ckwe> implements dssk {
    public static final ckwh c;
    private static volatile dssr<ckwh> e;
    public ckvz a;
    public dsrj<ckwg> b = dssu.b;
    private int d;

    static {
        ckwh ckwhVar = new ckwh();
        c = ckwhVar;
        dsqw.cc(ckwh.class, ckwhVar);
    }

    private ckwh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", ckwg.class});
            }
            if (i2 == 3) {
                return new ckwh();
            }
            if (i2 == 4) {
                return new ckwe();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckwh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ckwh.class) {
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
