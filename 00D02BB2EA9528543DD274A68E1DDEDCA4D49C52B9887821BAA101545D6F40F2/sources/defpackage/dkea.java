package defpackage;
/* compiled from: PG */
/* renamed from: dkea  reason: default package */
/* loaded from: classes.dex */
public final class dkea extends dsqw<dkea, dkdz> implements dssk {
    public static final dkea d;
    private static volatile dssr<dkea> e;
    public int a;
    public long b;
    public dsrj<dkec> c = dssu.b;

    static {
        dkea dkeaVar = new dkea();
        d = dkeaVar;
        dsqw.cc(dkea.class, dkeaVar);
    }

    private dkea() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"a", "b", "c", dkec.class});
            }
            if (i2 == 3) {
                return new dkea();
            }
            if (i2 == 4) {
                return new dkdz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkea> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkea.class) {
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

    public final void b() {
        dsrj<dkec> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
