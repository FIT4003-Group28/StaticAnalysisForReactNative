package defpackage;
/* compiled from: PG */
/* renamed from: akva  reason: default package */
/* loaded from: classes.dex */
public final class akva extends dsqw<akva, akuz> implements dssk {
    public static final akva h;
    private static volatile dssr<akva> i;
    public int a;
    public boolean b;
    public long d;
    public int e;
    public dhjz g;
    public int c = -1;
    public String f = "";

    static {
        akva akvaVar = new akva();
        h = akvaVar;
        dsqw.cc(akva.class, akvaVar);
    }

    private akva() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဋ\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", dndr.c(), "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new akva();
            }
            if (i3 == 4) {
                return new akuz();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<akva> dssrVar = i;
            if (dssrVar == null) {
                synchronized (akva.class) {
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
