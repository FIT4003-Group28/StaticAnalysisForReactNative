package defpackage;
/* compiled from: PG */
/* renamed from: dmnt  reason: default package */
/* loaded from: classes.dex */
public final class dmnt extends dsqw<dmnt, dmns> implements dssk {
    public static final dmnt d;
    private static volatile dssr<dmnt> e;
    public int a;
    public String b = "";
    public int c;

    static {
        dmnt dmntVar = new dmnt();
        d = dmntVar;
        dsqw.cc(dmnt.class, dmntVar);
    }

    private dmnt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmnt();
            }
            if (i2 == 4) {
                return new dmns();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmnt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmnt.class) {
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
