package defpackage;
/* compiled from: PG */
/* renamed from: dizl  reason: default package */
/* loaded from: classes6.dex */
public final class dizl extends dsqw<dizl, dizk> implements dssk {
    public static final dizl e;
    private static volatile dssr<dizl> f;
    public int a;
    public dsrj<dizn> b = dssu.b;
    public float c;
    public dizj d;

    static {
        dizl dizlVar = new dizl();
        e = dizlVar;
        dsqw.cc(dizl.class, dizlVar);
    }

    private dizl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0005\u0007\u0003\u0000\u0001\u0000\u0005\u001b\u0006ခ\u0000\u0007ဉ\u0001", new Object[]{"a", "b", dizn.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dizl();
            }
            if (i2 == 4) {
                return new dizk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dizl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dizl.class) {
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
