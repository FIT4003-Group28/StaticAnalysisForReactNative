package defpackage;
/* compiled from: PG */
/* renamed from: dkmn  reason: default package */
/* loaded from: classes.dex */
public final class dkmn extends dsqw<dkmn, dkmk> implements dssk {
    public static final dkmn d;
    private static volatile dssr<dkmn> f;
    public dsrj<dkmm> a = dssu.b;
    public int b;
    public boolean c;
    private int e;

    static {
        dkmn dkmnVar = new dkmn();
        d = dkmnVar;
        dsqw.cc(dkmn.class, dkmnVar);
    }

    private dkmn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003ဇ\u0001", new Object[]{"e", "a", dkmm.class, "b", "c"});
            }
            if (i2 == 3) {
                return new dkmn();
            }
            if (i2 == 4) {
                return new dkmk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkmn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkmn.class) {
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
