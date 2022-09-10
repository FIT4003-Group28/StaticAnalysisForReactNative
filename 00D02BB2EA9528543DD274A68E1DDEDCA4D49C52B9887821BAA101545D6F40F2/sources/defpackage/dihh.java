package defpackage;
/* compiled from: PG */
/* renamed from: dihh  reason: default package */
/* loaded from: classes6.dex */
public final class dihh extends dsqw<dihh, diha> implements dssk {
    public static final dihh c;
    private static volatile dssr<dihh> d;
    public dsrj<dvzn> a = dssu.b;
    public dsrj<dihg> b = dssu.b;

    static {
        dihh dihhVar = new dihh();
        c = dihhVar;
        dsqw.cc(dihh.class, dihhVar);
    }

    private dihh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001b\u0003\u001b", new Object[]{"a", dvzn.class, "b", dihg.class});
            }
            if (i2 == 3) {
                return new dihh();
            }
            if (i2 == 4) {
                return new diha();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dihh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dihh.class) {
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
