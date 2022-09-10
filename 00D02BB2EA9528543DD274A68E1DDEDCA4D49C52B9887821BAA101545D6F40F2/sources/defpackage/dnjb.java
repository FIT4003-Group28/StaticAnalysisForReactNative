package defpackage;
/* compiled from: PG */
/* renamed from: dnjb  reason: default package */
/* loaded from: classes6.dex */
public final class dnjb extends dsqw<dnjb, dnja> implements dssk {
    public static final dnjb h;
    private static volatile dssr<dnjb> j;
    public String a = "";
    public dsrj<String> b = dssu.b;
    public String c = "";
    public dsrj<String> d = dssu.b;
    public String e = "";
    public boolean f;
    public dodk g;
    private int i;

    static {
        dnjb dnjbVar = new dnjb();
        h = dnjbVar;
        dsqw.cc(dnjb.class, dnjbVar);
    }

    private dnjb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0002\u0005ဇ\u0003\u0006ဈ\u0001\bဉ\u0005", new Object[]{"i", "a", "b", "d", "e", "f", "c", "g"});
            }
            if (i2 == 3) {
                return new dnjb();
            }
            if (i2 == 4) {
                return new dnja();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnjb> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dnjb.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
