package defpackage;
/* compiled from: PG */
/* renamed from: dqmk  reason: default package */
/* loaded from: classes6.dex */
public final class dqmk extends dsqw<dqmk, dqmj> implements dssk {
    public static final dqmk c;
    private static volatile dssr<dqmk> e;
    public String a = "";
    public dnpq b;
    private int d;

    static {
        dqmk dqmkVar = new dqmk();
        c = dqmkVar;
        dsqw.cc(dqmk.class, dqmkVar);
    }

    private dqmk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqmk();
            }
            if (i2 == 4) {
                return new dqmj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqmk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqmk.class) {
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
