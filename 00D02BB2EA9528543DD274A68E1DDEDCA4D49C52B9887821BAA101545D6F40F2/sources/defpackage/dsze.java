package defpackage;
/* compiled from: PG */
/* renamed from: dsze  reason: default package */
/* loaded from: classes6.dex */
public final class dsze extends dsqw<dsze, dszd> implements dssk {
    public static final dsze d;
    private static volatile dssr<dsze> e;
    public int a;
    public dsza b;
    public dszc c;

    static {
        dsze dszeVar = new dsze();
        d = dszeVar;
        dsqw.cc(dsze.class, dszeVar);
    }

    private dsze() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dsze();
            }
            if (i2 == 4) {
                return new dszd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsze> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsze.class) {
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
