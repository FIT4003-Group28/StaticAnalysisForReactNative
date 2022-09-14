package defpackage;
/* compiled from: PG */
/* renamed from: drmj  reason: default package */
/* loaded from: classes6.dex */
public final class drmj extends dsqw<drmj, drmc> implements dssk {
    public static final drmj h;
    private static volatile dssr<drmj> i;
    public int a;
    public String b = "";
    public boolean c;
    public boolean d;
    public drmi e;
    public int f;
    public drme g;

    static {
        drmj drmjVar = new drmj();
        h = drmjVar;
        dsqw.cc(drmj.class, drmjVar);
    }

    private drmj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new drmj();
            }
            if (i3 == 4) {
                return new drmc();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<drmj> dssrVar = i;
            if (dssrVar == null) {
                synchronized (drmj.class) {
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
