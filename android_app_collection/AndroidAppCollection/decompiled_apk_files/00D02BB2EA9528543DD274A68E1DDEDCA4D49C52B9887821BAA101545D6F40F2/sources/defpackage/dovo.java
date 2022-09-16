package defpackage;
/* compiled from: PG */
/* renamed from: dovo  reason: default package */
/* loaded from: classes6.dex */
public final class dovo extends dsqw<dovo, dovj> implements dssk {
    public static final dovo d;
    private static volatile dssr<dovo> f;
    public Object b;
    public int a = 0;
    private byte e = 2;
    public dsrj<dovn> c = dssu.b;

    static {
        dovo dovoVar = new dovo();
        d = dovoVar;
        dsqw.cc(dovo.class, dovoVar);
    }

    private dovo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0001\u0001\u0001့\u0000\u0002Л\u0004့\u0000", new Object[]{"b", "a", "c", dovn.class});
            }
            if (i2 == 3) {
                return new dovo();
            }
            if (i2 == 4) {
                return new dovj();
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
            dssr<dovo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dovo.class) {
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
