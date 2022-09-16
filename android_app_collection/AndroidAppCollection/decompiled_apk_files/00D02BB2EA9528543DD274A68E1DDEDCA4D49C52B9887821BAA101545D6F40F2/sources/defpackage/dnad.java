package defpackage;
/* compiled from: PG */
/* renamed from: dnad  reason: default package */
/* loaded from: classes6.dex */
public final class dnad extends dsqw<dnad, dnac> implements dssk {
    public static final dnad d;
    private static volatile dssr<dnad> e;
    public int a;
    public int b;
    public int c;

    static {
        dnad dnadVar = new dnad();
        d = dnadVar;
        dsqw.cc(dnad.class, dnadVar);
    }

    private dnad() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnad();
            }
            if (i2 == 4) {
                return new dnac();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnad> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnad.class) {
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
