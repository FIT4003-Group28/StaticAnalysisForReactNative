package defpackage;
/* compiled from: PG */
/* renamed from: dmku  reason: default package */
/* loaded from: classes6.dex */
public final class dmku extends dsqw<dmku, dmkt> implements dssk {
    public static final dmku e;
    private static volatile dssr<dmku> f;
    public int a;
    public dspd b = dspd.b;
    public String c = "";
    public boolean d;

    static {
        dmku dmkuVar = new dmku();
        e = dmkuVar;
        dsqw.cc(dmku.class, dmkuVar);
    }

    private dmku() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0002\u0006\u0004\u0000\u0000\u0000\u0002\u000b\u0004\n\u0005Ȉ\u0006\u0007", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dmku();
            }
            if (i2 == 4) {
                return new dmkt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmku> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmku.class) {
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
