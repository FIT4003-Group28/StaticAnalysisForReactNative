package defpackage;
/* compiled from: PG */
/* renamed from: dsmc  reason: default package */
/* loaded from: classes6.dex */
public final class dsmc extends dsqw<dsmc, dsmb> implements dssk {
    public static final dsmc d;
    private static volatile dssr<dsmc> e;
    public int a;
    public String b = "";
    public int c;

    static {
        dsmc dsmcVar = new dsmc();
        d = dsmcVar;
        dsqw.cc(dsmc.class, dsmcVar);
    }

    private dsmc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dsmc();
            }
            if (i2 == 4) {
                return new dsmb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsmc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsmc.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}