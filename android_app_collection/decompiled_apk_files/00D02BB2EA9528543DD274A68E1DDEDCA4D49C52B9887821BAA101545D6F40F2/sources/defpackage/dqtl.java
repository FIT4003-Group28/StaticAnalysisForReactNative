package defpackage;
/* compiled from: PG */
/* renamed from: dqtl  reason: default package */
/* loaded from: classes6.dex */
public final class dqtl extends dsqw<dqtl, dqti> implements dssk {
    public static final dqtl e;
    private static volatile dssr<dqtl> f;
    public int a;
    public String b = "";
    public dsrj<dqtk> c = dssu.b;
    public dsrj<dqtk> d = dssu.b;

    static {
        dqtl dqtlVar = new dqtl();
        e = dqtlVar;
        dsqw.cc(dqtl.class, dqtlVar);
    }

    private dqtl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", "c", dqtk.class, "d", dqtk.class});
            }
            if (i2 == 3) {
                return new dqtl();
            }
            if (i2 == 4) {
                return new dqti();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqtl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqtl.class) {
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
