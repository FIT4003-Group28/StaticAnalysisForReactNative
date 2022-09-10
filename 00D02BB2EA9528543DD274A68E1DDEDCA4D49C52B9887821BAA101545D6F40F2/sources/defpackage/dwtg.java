package defpackage;
/* compiled from: PG */
/* renamed from: dwtg  reason: default package */
/* loaded from: classes.dex */
public final class dwtg extends dsqw<dwtg, dwsy> implements dssk {
    public static final dwtg j;
    private static volatile dssr<dwtg> l;
    public dwtf a;
    public dwsx c;
    public boolean f;
    public dwta g;
    private int k;
    public int b = 20;
    public int d = 5;
    public int e = 1;
    public boolean h = true;
    public int i = 1;

    static {
        dwtg dwtgVar = new dwtg();
        j = dwtgVar;
        dsqw.cc(dwtg.class, dwtgVar);
    }

    private dwtg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဉ\u0002\u0004င\u0003\u0006ဌ\u0005\u0007ဇ\u0006\bဉ\u0007\tဇ\b\nဌ\t", new Object[]{"k", "a", "b", "c", "d", "e", dwsu.a, "f", "g", "h", "i", dwtb.a});
            }
            if (i2 == 3) {
                return new dwtg();
            }
            if (i2 == 4) {
                return new dwsy();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwtg> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dwtg.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
