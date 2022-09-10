package defpackage;
/* compiled from: PG */
/* renamed from: dkuf  reason: default package */
/* loaded from: classes6.dex */
public final class dkuf extends dsqw<dkuf, dkue> implements dssk {
    public static final dkuf d;
    private static volatile dssr<dkuf> f;
    public String a = "";
    public dsrj<dkuh> b = dssu.b;
    public int c;
    private int e;

    static {
        dkuf dkufVar = new dkuf();
        d = dkufVar;
        dsqw.cc(dkuf.class, dkufVar);
    }

    private dkuf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဈ\u0001\u0003\u001b\u0004င\u0003", new Object[]{"e", "a", "b", dkuh.class, "c"});
            }
            if (i2 == 3) {
                return new dkuf();
            }
            if (i2 == 4) {
                return new dkue();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkuf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkuf.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
