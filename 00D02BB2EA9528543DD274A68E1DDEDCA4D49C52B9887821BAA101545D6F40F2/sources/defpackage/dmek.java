package defpackage;
/* compiled from: PG */
/* renamed from: dmek  reason: default package */
/* loaded from: classes6.dex */
public final class dmek extends dsqw<dmek, dmej> implements dssk {
    public static final dmek d;
    private static volatile dssr<dmek> e;
    public int a;
    public dmdp b;
    public dsrj<dmei> c = dssu.b;

    static {
        dmek dmekVar = new dmek();
        d = dmekVar;
        dsqw.cc(dmek.class, dmekVar);
    }

    private dmek() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dmei.class});
            }
            if (i2 == 3) {
                return new dmek();
            }
            if (i2 == 4) {
                return new dmej();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmek> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmek.class) {
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
