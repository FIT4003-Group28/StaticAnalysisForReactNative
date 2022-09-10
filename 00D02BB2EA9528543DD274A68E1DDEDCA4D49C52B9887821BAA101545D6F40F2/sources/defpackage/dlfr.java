package defpackage;
/* compiled from: PG */
/* renamed from: dlfr  reason: default package */
/* loaded from: classes6.dex */
public final class dlfr extends dsqw<dlfr, dlfk> implements dssk {
    public static final dlfr e;
    private static volatile dssr<dlfr> f;
    public int a;
    public dlfq b;
    public String c = "";
    public dlfo d;

    static {
        dlfr dlfrVar = new dlfr();
        e = dlfrVar;
        dsqw.cc(dlfr.class, dlfrVar);
    }

    private dlfr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dlfr();
            }
            if (i2 == 4) {
                return new dlfk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlfr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlfr.class) {
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
