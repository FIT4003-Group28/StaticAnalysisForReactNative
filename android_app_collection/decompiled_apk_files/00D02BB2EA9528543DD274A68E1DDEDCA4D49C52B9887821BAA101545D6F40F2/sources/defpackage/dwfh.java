package defpackage;
/* compiled from: PG */
/* renamed from: dwfh  reason: default package */
/* loaded from: classes.dex */
public final class dwfh extends dsqw<dwfh, dwfg> implements dssk {
    public static final dwfh d;
    private static volatile dssr<dwfh> e;
    public int a;
    public String b = "";
    public dnpq c;

    static {
        dwfh dwfhVar = new dwfh();
        d = dwfhVar;
        dsqw.cc(dwfh.class, dwfhVar);
    }

    private dwfh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwfh();
            }
            if (i2 == 4) {
                return new dwfg();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwfh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwfh.class) {
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
