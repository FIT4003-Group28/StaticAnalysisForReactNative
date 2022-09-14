package defpackage;
/* compiled from: PG */
/* renamed from: doco  reason: default package */
/* loaded from: classes.dex */
public final class doco extends dsqw<doco, docn> implements dssk {
    public static final doco k;
    private static volatile dssr<doco> m;
    public int a;
    public docg c;
    public docg d;
    public dgjo e;
    public boolean f;
    public boolean g;
    public boolean h;
    public docm i;
    public boolean j;
    private byte l = 2;
    public dsrj<docg> b = dssu.b;

    static {
        doco docoVar = new doco();
        k = docoVar;
        dsqw.cc(doco.class, docoVar);
    }

    private doco() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0001\u0003\u0001Л\u0003ᐉ\u0000\u0004ဉ\u0002\u0005ဇ\u0003\bဇ\u0004\tဇ\u0005\nဉ\u0006\fᐉ\u0001\u0010ဇ\b", new Object[]{"a", "b", docg.class, "c", "e", "f", "g", "h", "i", "d", "j"});
            }
            if (i2 == 3) {
                return new doco();
            }
            if (i2 == 4) {
                return new docn();
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
            dssr<doco> dssrVar = m;
            if (dssrVar == null) {
                synchronized (doco.class) {
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

    public final void b() {
        dsrj<docg> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
