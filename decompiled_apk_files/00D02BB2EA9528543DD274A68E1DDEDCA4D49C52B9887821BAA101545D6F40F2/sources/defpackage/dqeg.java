package defpackage;
/* compiled from: PG */
/* renamed from: dqeg  reason: default package */
/* loaded from: classes6.dex */
public final class dqeg extends dsqw<dqeg, dqef> implements dssk {
    public static final dqeg c;
    private static volatile dssr<dqeg> e;
    public String a = "";
    public dsrj<dqee> b = dssu.b;
    private int d;

    static {
        dqeg dqegVar = new dqeg();
        c = dqegVar;
        dsqw.cc(dqeg.class, dqegVar);
    }

    private dqeg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dqee.class});
            }
            if (i2 == 3) {
                return new dqeg();
            }
            if (i2 == 4) {
                return new dqef();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqeg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqeg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
