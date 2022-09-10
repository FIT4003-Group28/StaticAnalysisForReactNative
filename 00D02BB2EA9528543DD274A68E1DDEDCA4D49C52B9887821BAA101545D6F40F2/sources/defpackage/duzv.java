package defpackage;
/* compiled from: PG */
/* renamed from: duzv  reason: default package */
/* loaded from: classes6.dex */
public final class duzv extends dsqw<duzv, duzu> implements dssk {
    public static final duzv k;
    private static volatile dssr<duzv> m;
    public int a;
    public dngs b;
    public dvab d;
    public dpop e;
    public dvba g;
    public dvaf i;
    public dvah j;
    private byte l = 2;
    public dsrj<dvay> c = dssu.b;
    public dsrj<duzq> f = dssu.b;
    public dsrj<duzx> h = dssu.b;

    static {
        duzv duzvVar = new duzv();
        k = duzvVar;
        dsqw.cc(duzv.class, duzvVar);
    }

    private duzv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0002\f\t\u0000\u0003\u0001\u0002Л\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0000\b\u001b\tဉ\u0003\n\u001b\u000bဉ\u0004\fဉ\u0005", new Object[]{"a", "c", dvay.class, "d", "e", "b", "f", duzq.class, "g", "h", duzx.class, "i", "j"});
            }
            if (i2 == 3) {
                return new duzv();
            }
            if (i2 == 4) {
                return new duzu();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<duzv> dssrVar = m;
            if (dssrVar == null) {
                synchronized (duzv.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }

    public final void c() {
        dsrj<dvay> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
