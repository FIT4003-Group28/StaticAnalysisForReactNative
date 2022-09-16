package defpackage;
/* compiled from: PG */
/* renamed from: eaxx  reason: default package */
/* loaded from: classes6.dex */
public final class eaxx extends dsqw<eaxx, eaxw> implements dssk {
    public static final eaxx k;
    private static volatile dssr<eaxx> l;
    public int a;
    public int b;
    public dudj c;
    public long f;
    public int h;
    public int i;
    public int j;
    public String d = "";
    public String e = "";
    public dsrj<String> g = dssu.b;

    static {
        eaxx eaxxVar = new eaxx();
        k = eaxxVar;
        dsqw.cc(eaxx.class, eaxxVar);
    }

    private eaxx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0002\u000b\t\u0000\u0001\u0000\u0002ဌ\u0000\u0003ဉ\u0001\u0005ဈ\u0002\u0006\u001a\u0007ဂ\u0004\bင\u0005\tဌ\u0006\nဈ\u0003\u000bဌ\u0007", new Object[]{"a", "b", eawa.a, "c", "d", "g", "f", "h", "i", eaxt.a, "e", "j", czgq.c()});
            }
            if (i2 == 3) {
                return new eaxx();
            }
            if (i2 == 4) {
                return new eaxw();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eaxx> dssrVar = l;
            if (dssrVar == null) {
                synchronized (eaxx.class) {
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
