package defpackage;
/* compiled from: PG */
/* renamed from: ckxu  reason: default package */
/* loaded from: classes5.dex */
public final class ckxu extends dsqw<ckxu, ckxt> implements dssk {
    public static final ckxu e;
    private static volatile dssr<ckxu> f;
    public int a;
    public String b = "";
    public boolean c;
    public ckxf d;

    static {
        ckxu ckxuVar = new ckxu();
        e = ckxuVar;
        dsqw.cc(ckxu.class, ckxuVar);
    }

    private ckxu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ckxu();
            }
            if (i2 == 4) {
                return new ckxt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckxu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ckxu.class) {
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
