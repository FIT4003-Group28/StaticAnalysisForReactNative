package defpackage;
/* compiled from: PG */
/* renamed from: dlrg  reason: default package */
/* loaded from: classes6.dex */
public final class dlrg extends dsqw<dlrg, dlrf> implements dssk {
    public static final dlrg d;
    private static volatile dssr<dlrg> e;
    public int a;
    public dsrj<dspd> b = dssu.b;
    public int c;

    static {
        dlrg dlrgVar = new dlrg();
        d = dlrgVar;
        dsqw.cc(dlrg.class, dlrgVar);
    }

    private dlrg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001c\u0002င\u0000", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlrg();
            }
            if (i2 == 4) {
                return new dlrf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlrg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlrg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
