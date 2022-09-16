package defpackage;
/* compiled from: PG */
/* renamed from: dsxh  reason: default package */
/* loaded from: classes6.dex */
public final class dsxh extends dsqw<dsxh, dsxg> implements dssk {
    public static final dsxh c;
    private static volatile dssr<dsxh> d;
    public long a;
    public int b;

    static {
        dsxh dsxhVar = new dsxh();
        c = dsxhVar;
        dsqw.cc(dsxh.class, dsxhVar);
    }

    private dsxh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dsxh();
            }
            if (i2 == 4) {
                return new dsxg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsxh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsxh.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
