package defpackage;
/* compiled from: PG */
/* renamed from: dsjk  reason: default package */
/* loaded from: classes6.dex */
public final class dsjk extends dsqw<dsjk, dsjj> implements dssk {
    public static final dsjk e;
    private static volatile dssr<dsjk> f;
    public int a;
    public long b;
    public long c;
    public int d;

    static {
        dsjk dsjkVar = new dsjk();
        e = dsjkVar;
        dsqw.cc(dsjk.class, dsjkVar);
    }

    private dsjk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dsjk();
            }
            if (i2 == 4) {
                return new dsjj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsjk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsjk.class) {
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
