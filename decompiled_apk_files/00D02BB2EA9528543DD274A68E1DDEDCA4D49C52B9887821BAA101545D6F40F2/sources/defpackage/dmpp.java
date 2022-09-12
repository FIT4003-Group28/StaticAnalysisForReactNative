package defpackage;
/* compiled from: PG */
/* renamed from: dmpp  reason: default package */
/* loaded from: classes.dex */
public final class dmpp extends dsqw<dmpp, dmpo> implements dssk {
    public static final dmpp b;
    private static volatile dssr<dmpp> d;
    private byte c = 2;
    public dsrj<dmpn> a = dssu.b;

    static {
        dmpp dmppVar = new dmpp();
        b = dmppVar;
        dsqw.cc(dmpp.class, dmppVar);
    }

    private dmpp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dmpn.class});
            }
            if (i2 == 3) {
                return new dmpp();
            }
            if (i2 == 4) {
                return new dmpo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dmpp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmpp.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }

    public final void b() {
        dsrj<dmpn> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
