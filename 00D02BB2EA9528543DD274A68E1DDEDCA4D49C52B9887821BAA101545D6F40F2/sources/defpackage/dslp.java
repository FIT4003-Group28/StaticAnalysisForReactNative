package defpackage;
/* compiled from: PG */
/* renamed from: dslp  reason: default package */
/* loaded from: classes6.dex */
public final class dslp extends dsqw<dslp, dslo> implements dssk {
    public static final dslp d;
    private static volatile dssr<dslp> e;
    public int a;
    public String b = "";
    public dsrf c = dsqz.b;

    static {
        dslp dslpVar = new dslp();
        d = dslpVar;
        dsqw.cc(dslp.class, dslpVar);
    }

    private dslp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001e", new Object[]{"a", "b", "c", dsmf.c()});
            }
            if (i2 == 3) {
                return new dslp();
            }
            if (i2 == 4) {
                return new dslo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dslp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dslp.class) {
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
