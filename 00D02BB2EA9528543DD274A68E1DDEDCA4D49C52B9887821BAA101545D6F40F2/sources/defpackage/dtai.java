package defpackage;
/* compiled from: PG */
/* renamed from: dtai  reason: default package */
/* loaded from: classes6.dex */
public final class dtai extends dsqw<dtai, dtah> implements dssk {
    public static final dtai d;
    private static volatile dssr<dtai> e;
    public int a;
    public long b;
    public long c;

    static {
        dtai dtaiVar = new dtai();
        d = dtaiVar;
        dsqw.cc(dtai.class, dtaiVar);
    }

    private dtai() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002စ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtai();
            }
            if (i2 == 4) {
                return new dtah();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtai> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtai.class) {
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
