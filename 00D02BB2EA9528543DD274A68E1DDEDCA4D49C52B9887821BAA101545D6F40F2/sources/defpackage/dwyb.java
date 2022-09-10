package defpackage;
/* compiled from: PG */
/* renamed from: dwyb  reason: default package */
/* loaded from: classes6.dex */
public final class dwyb extends dsqw<dwyb, dwya> implements dssk {
    public static final dwyb e;
    private static volatile dssr<dwyb> f;
    public int a;
    public boolean c;
    public String b = "";
    public dsrj<dwxz> d = dssu.b;

    static {
        dwyb dwybVar = new dwyb();
        e = dwybVar;
        dsqw.cc(dwyb.class, dwybVar);
    }

    private dwyb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", dwxz.class});
            }
            if (i2 == 3) {
                return new dwyb();
            }
            if (i2 == 4) {
                return new dwya();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwyb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwyb.class) {
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
