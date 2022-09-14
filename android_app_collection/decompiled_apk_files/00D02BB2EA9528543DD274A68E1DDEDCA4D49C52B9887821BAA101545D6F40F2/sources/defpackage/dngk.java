package defpackage;
/* compiled from: PG */
/* renamed from: dngk  reason: default package */
/* loaded from: classes6.dex */
public final class dngk extends dsqw<dngk, dngd> implements dssk {
    public static final dngk j;
    private static volatile dssr<dngk> k;
    public int a;
    public int b;
    public float d;
    public int f;
    public int h;
    public dngj i;
    public String c = "";
    public String e = "";
    public dsrj<dngc> g = dssu.b;

    static {
        dngk dngkVar = new dngk();
        j = dngkVar;
        dsqw.cc(dngk.class, dngkVar);
    }

    private dngk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0000\u0001ဈ\u0001\u0004\u001b\u0005င\u0005\u0006ဌ\u0000\u0007ခ\u0002\bဌ\u0004\tဈ\u0003\nဉ\u0006", new Object[]{"a", "c", "g", dngc.class, "h", "b", dngf.c(), "d", "f", dngg.a, "e", "i"});
            }
            if (i2 == 3) {
                return new dngk();
            }
            if (i2 == 4) {
                return new dngd();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dngk> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dngk.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
