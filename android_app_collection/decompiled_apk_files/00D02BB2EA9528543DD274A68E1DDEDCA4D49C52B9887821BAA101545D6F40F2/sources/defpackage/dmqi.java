package defpackage;
/* compiled from: PG */
/* renamed from: dmqi  reason: default package */
/* loaded from: classes.dex */
public final class dmqi extends dsqw<dmqi, dmqh> implements dssk {
    public static final dmqi b;
    private static volatile dssr<dmqi> d;
    private byte c = 2;
    public dsrj<dmqg> a = dssu.b;

    static {
        dmqi dmqiVar = new dmqi();
        b = dmqiVar;
        dsqw.cc(dmqi.class, dmqiVar);
    }

    private dmqi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dmqg.class});
            }
            if (i2 == 3) {
                return new dmqi();
            }
            if (i2 == 4) {
                return new dmqh();
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
            dssr<dmqi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmqi.class) {
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
        dsrj<dmqg> dsrjVar = this.a;
        if (!dsrjVar.a()) {
            this.a = dsqw.cl(dsrjVar);
        }
    }
}
