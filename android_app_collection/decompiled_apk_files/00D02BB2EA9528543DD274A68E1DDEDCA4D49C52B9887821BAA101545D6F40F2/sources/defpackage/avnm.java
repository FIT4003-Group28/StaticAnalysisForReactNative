package defpackage;
/* compiled from: PG */
/* renamed from: avnm  reason: default package */
/* loaded from: classes3.dex */
public final class avnm extends dsqw<avnm, avnl> implements dssk {
    public static final avnm d;
    private static volatile dssr<avnm> f;
    public int a;
    public int b;
    private byte e = 2;
    public dsrj<drsu> c = dssu.b;

    static {
        avnm avnmVar = new avnm();
        d = avnmVar;
        dsqw.cc(avnm.class, avnmVar);
    }

    private avnm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001င\u0000\u0002Л", new Object[]{"a", "b", "c", drsu.class});
            }
            if (i2 == 3) {
                return new avnm();
            }
            if (i2 == 4) {
                return new avnl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<avnm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (avnm.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
