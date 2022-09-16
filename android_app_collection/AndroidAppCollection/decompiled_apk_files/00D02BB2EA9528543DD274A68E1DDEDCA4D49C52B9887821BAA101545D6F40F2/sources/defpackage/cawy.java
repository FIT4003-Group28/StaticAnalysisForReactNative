package defpackage;
/* compiled from: PG */
/* renamed from: cawy  reason: default package */
/* loaded from: classes4.dex */
public final class cawy extends dsqw<cawy, cawx> implements dssk {
    public static final cawy h;
    private static volatile dssr<cawy> i;
    public int a;
    public dqkn b;
    public boolean c;
    public dqwa d;
    public dkfx e;
    public diog f;
    public dwui g;

    static {
        cawy cawyVar = new cawy();
        h = cawyVar;
        dsqw.cc(cawy.class, cawyVar);
    }

    private cawy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\nဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new cawy();
            }
            if (i3 == 4) {
                return new cawx();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<cawy> dssrVar = i;
            if (dssrVar == null) {
                synchronized (cawy.class) {
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
