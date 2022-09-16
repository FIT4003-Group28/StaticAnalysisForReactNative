package defpackage;
/* compiled from: PG */
/* renamed from: dkcm  reason: default package */
/* loaded from: classes6.dex */
public final class dkcm extends dsqw<dkcm, dkcl> implements dssk {
    public static final dkcm c;
    private static volatile dssr<dkcm> e;
    public dmbc a;
    public dsrj<dmba> b = dssu.b;
    private int d;

    static {
        dkcm dkcmVar = new dkcm();
        c = dkcmVar;
        dsqw.cc(dkcm.class, dkcmVar);
    }

    private dkcm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dmba.class});
            }
            if (i2 == 3) {
                return new dkcm();
            }
            if (i2 == 4) {
                return new dkcl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkcm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkcm.class) {
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
