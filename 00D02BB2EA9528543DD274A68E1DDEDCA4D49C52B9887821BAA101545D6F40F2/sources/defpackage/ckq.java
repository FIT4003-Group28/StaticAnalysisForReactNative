package defpackage;
/* compiled from: PG */
/* renamed from: ckq  reason: default package */
/* loaded from: classes4.dex */
public final class ckq extends dsqw<ckq, ckp> implements dssk {
    public static final ckq d;
    private static volatile dssr<ckq> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        ckq ckqVar = new ckq();
        d = ckqVar;
        dsqw.cc(ckq.class, ckqVar);
    }

    private ckq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ckq();
            }
            if (i2 == 4) {
                return new ckp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ckq.class) {
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
