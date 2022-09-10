package defpackage;
/* compiled from: PG */
/* renamed from: bkeu  reason: default package */
/* loaded from: classes3.dex */
public final class bkeu extends dsqw<bkeu, bket> implements dssk {
    public static final bkeu e;
    private static volatile dssr<bkeu> f;
    public int a;
    public long b;
    public long c;
    public long d;

    static {
        bkeu bkeuVar = new bkeu();
        e = bkeuVar;
        dsqw.cc(bkeu.class, bkeuVar);
    }

    private bkeu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new bkeu();
            }
            if (i2 == 4) {
                return new bket();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bkeu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bkeu.class) {
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
