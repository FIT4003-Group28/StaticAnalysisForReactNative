package defpackage;
/* compiled from: PG */
/* renamed from: dvcz  reason: default package */
/* loaded from: classes.dex */
public final class dvcz extends dsqw<dvcz, dvcy> implements dssk {
    public static final dvcz k;
    private static volatile dssr<dvcz> l;
    public int a;
    public boolean e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean j;
    public float b = -1.0f;
    public float c = -1.0f;
    public int d = 5000;
    public int i = 100;

    static {
        dvcz dvczVar = new dvcz();
        k = dvczVar;
        dsqw.cc(dvcz.class, dvczVar);
    }

    private dvcz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0002\f\t\u0000\u0000\u0000\u0002ခ\u0001\u0003ခ\u0002\u0005င\u0004\u0007ဇ\u0006\bင\u0007\tဇ\b\nဇ\t\u000bင\n\fဇ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new dvcz();
            }
            if (i2 == 4) {
                return new dvcy();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvcz> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dvcz.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
