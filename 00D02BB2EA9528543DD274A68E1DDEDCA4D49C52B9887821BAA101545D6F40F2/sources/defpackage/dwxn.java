package defpackage;
/* compiled from: PG */
/* renamed from: dwxn  reason: default package */
/* loaded from: classes6.dex */
public final class dwxn extends dsqw<dwxn, dwxm> implements dssk {
    public static final dwxn e;
    private static volatile dssr<dwxn> h;
    public int a;
    public dwwx b;
    public dusm c;
    public dvpj d;
    private dnqh f;
    private byte g = 2;

    static {
        dwxn dwxnVar = new dwxn();
        e = dwxnVar;
        dsqw.cc(dwxn.class, dwxnVar);
    }

    private dwxn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0001\u0002ᐉ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "f", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dwxn();
            }
            if (i2 == 4) {
                return new dwxm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dwxn> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwxn.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
