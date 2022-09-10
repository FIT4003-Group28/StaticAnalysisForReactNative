package defpackage;
/* compiled from: PG */
/* renamed from: eacm  reason: default package */
/* loaded from: classes.dex */
public final class eacm extends dsqw<eacm, eaci> implements dssk {
    public static final eacm h;
    private static volatile dssr<eacm> i;
    public int a;
    public int b;
    public int c;
    public int d;
    public dsrj<eacl> e = dssu.b;
    public dsrf f = dsqz.b;
    public dsrj<each> g = dssu.b;

    static {
        eacm eacmVar = new eacm();
        h = eacmVar;
        dsqw.cc(eacm.class, eacmVar);
    }

    private eacm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b\u0005'\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", eacl.class, "f", "g", each.class});
            }
            if (i3 == 3) {
                return new eacm();
            }
            if (i3 == 4) {
                return new eaci();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<eacm> dssrVar = i;
            if (dssrVar == null) {
                synchronized (eacm.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
