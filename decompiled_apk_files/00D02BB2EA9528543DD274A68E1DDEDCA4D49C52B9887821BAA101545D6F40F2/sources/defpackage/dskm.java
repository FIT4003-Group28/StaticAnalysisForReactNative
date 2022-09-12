package defpackage;
/* compiled from: PG */
/* renamed from: dskm  reason: default package */
/* loaded from: classes6.dex */
public final class dskm extends dsqw<dskm, dskl> implements dssk {
    public static final dskm c;
    private static volatile dssr<dskm> d;
    public int a;
    public int b;

    static {
        dskm dskmVar = new dskm();
        c = dskmVar;
        dsqw.cc(dskm.class, dskmVar);
    }

    private dskm() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dskm();
            }
            if (i2 == 4) {
                return new dskl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dskm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dskm.class) {
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
