package defpackage;
/* compiled from: PG */
/* renamed from: dgha  reason: default package */
/* loaded from: classes6.dex */
public final class dgha extends dsqw<dgha, dggv> implements dssk {
    public static final dgha d;
    private static volatile dssr<dgha> f;
    public dsrj<dggz> a = dssu.b;
    public float b;
    public dggx c;
    private int e;

    static {
        dgha dghaVar = new dgha();
        d = dghaVar;
        dsqw.cc(dgha.class, dghaVar);
    }

    private dgha() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ခ\u0000\u0003ဉ\u0001", new Object[]{"e", "a", dggz.class, "b", "c"});
            }
            if (i2 == 3) {
                return new dgha();
            }
            if (i2 == 4) {
                return new dggv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgha> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgha.class) {
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
