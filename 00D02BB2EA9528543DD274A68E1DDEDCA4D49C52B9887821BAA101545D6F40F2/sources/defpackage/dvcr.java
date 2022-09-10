package defpackage;
/* compiled from: PG */
/* renamed from: dvcr  reason: default package */
/* loaded from: classes6.dex */
public final class dvcr extends dsqw<dvcr, dvcq> implements dssk {
    public static final dvcr h;
    private static volatile dssr<dvcr> i;
    public int a;
    public dhjx d;
    public donu f;
    public dnpq g;
    public String b = "";
    public String c = "";
    public dsrj<dvcl> e = dssu.b;

    static {
        dvcr dvcrVar = new dvcr();
        h = dvcrVar;
        dsqw.cc(dvcr.class, dvcrVar);
    }

    private dvcr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003ဉ\u0003\u0004\u001b\u0005ဉ\u0004\tဉ\u0007", new Object[]{"a", "b", "c", "d", "e", dvcl.class, "f", "g"});
            }
            if (i3 == 3) {
                return new dvcr();
            }
            if (i3 == 4) {
                return new dvcq();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dvcr> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dvcr.class) {
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
