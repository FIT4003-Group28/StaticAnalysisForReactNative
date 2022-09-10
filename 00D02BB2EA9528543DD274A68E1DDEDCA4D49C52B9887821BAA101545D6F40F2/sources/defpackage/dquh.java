package defpackage;
/* compiled from: PG */
/* renamed from: dquh  reason: default package */
/* loaded from: classes6.dex */
public final class dquh extends dsqw<dquh, dqug> implements dssk {
    public static final dquh c;
    private static volatile dssr<dquh> d;
    public int a;
    public String b = "";

    static {
        dquh dquhVar = new dquh();
        c = dquhVar;
        dsqw.cc(dquh.class, dquhVar);
    }

    private dquh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dquh();
            }
            if (i2 == 4) {
                return new dqug();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dquh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dquh.class) {
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
