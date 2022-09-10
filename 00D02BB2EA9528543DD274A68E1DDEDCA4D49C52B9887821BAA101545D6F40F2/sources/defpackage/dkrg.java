package defpackage;
/* compiled from: PG */
/* renamed from: dkrg  reason: default package */
/* loaded from: classes6.dex */
public final class dkrg extends dsqw<dkrg, dkrf> implements dssk {
    public static final dkrg c;
    private static volatile dssr<dkrg> d;
    public dsrj<diyf> a;
    public dsrj<dkmm> b;

    static {
        dkrg dkrgVar = new dkrg();
        c = dkrgVar;
        dsqw.cc(dkrg.class, dkrgVar);
    }

    private dkrg() {
        dssu<Object> dssuVar = dssu.b;
        this.a = dssu.b;
        this.b = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"a", diyf.class, "b", dkmm.class});
            }
            if (i2 == 3) {
                return new dkrg();
            }
            if (i2 == 4) {
                return new dkrf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkrg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkrg.class) {
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
