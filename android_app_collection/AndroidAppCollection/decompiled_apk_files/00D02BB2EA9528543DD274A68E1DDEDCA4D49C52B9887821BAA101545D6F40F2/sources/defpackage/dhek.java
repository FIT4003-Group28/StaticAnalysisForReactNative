package defpackage;
/* compiled from: PG */
/* renamed from: dhek  reason: default package */
/* loaded from: classes6.dex */
public final class dhek extends dsqw<dhek, dhei> implements dssk {
    public static final dhek h;
    private static volatile dssr<dhek> i;
    public dsrj<String> a = dssu.b;
    public int b;
    public dhfg c;
    public dhfp d;
    public dhex e;
    public dhdg f;
    public dhdu g;

    static {
        dhek dhekVar = new dhek();
        h = dhekVar;
        dsqw.cc(dhek.class, dhekVar);
    }

    private dhek() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0000\u0007\u0000\u0000\u0001\f\u0007\u0000\u0001\u0000\u0001Ț\u0002\f\u0005\t\u0006\t\b\t\t\t\f\t", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dhek();
            }
            if (i3 == 4) {
                return new dhei();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dhek> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dhek.class) {
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
