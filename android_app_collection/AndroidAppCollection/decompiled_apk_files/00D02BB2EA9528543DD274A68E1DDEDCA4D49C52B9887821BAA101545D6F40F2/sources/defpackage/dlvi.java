package defpackage;
/* compiled from: PG */
/* renamed from: dlvi  reason: default package */
/* loaded from: classes6.dex */
public final class dlvi extends dsqw<dlvi, dlvh> implements dssk {
    public static final dlvi k;
    private static volatile dssr<dlvi> l;
    public int a;
    public long b;
    public double c;
    public double d;
    public String e = "";
    public dsrj<String> f = dssu.b;
    public int g;
    public int h;
    public long i;
    public boolean j;

    static {
        dlvi dlviVar = new dlvi();
        k = dlviVar;
        dsqw.cc(dlvi.class, dlviVar);
    }

    private dlvi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0002\u000b\t\u0000\u0001\u0000\u0002ဃ\u0000\u0003က\u0001\u0004က\u0002\u0005ဈ\u0003\u0006\u001a\u0007င\u0005\bင\u0006\nဇ\b\u000bဃ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "j", "i"});
            }
            if (i2 == 3) {
                return new dlvi();
            }
            if (i2 == 4) {
                return new dlvh();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlvi> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dlvi.class) {
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
