package defpackage;
/* compiled from: PG */
/* renamed from: eabp  reason: default package */
/* loaded from: classes.dex */
public final class eabp extends dsqw<eabp, eabm> implements dssk {
    public static final eabp k;
    private static volatile dssr<eabp> l;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public dsrj<eabo> j = dssu.b;

    static {
        eabp eabpVar = new eabp();
        k = eabpVar;
        dsqw.cc(eabp.class, eabpVar);
    }

    private eabp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\n\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", eabo.class});
            }
            if (i2 == 3) {
                return new eabp();
            }
            if (i2 == 4) {
                return new eabm();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eabp> dssrVar = l;
            if (dssrVar == null) {
                synchronized (eabp.class) {
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

    public final void c() {
        dsrj<eabo> dsrjVar = this.j;
        if (!dsrjVar.a()) {
            this.j = dsqw.cl(dsrjVar);
        }
    }
}
