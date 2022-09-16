package defpackage;
/* compiled from: PG */
/* renamed from: docq  reason: default package */
/* loaded from: classes6.dex */
public final class docq extends dsqw<docq, docp> implements dssk {
    public static final docq a;
    private static volatile dssr<docq> e;
    private int b;
    private dfxu c;
    private byte d = 2;

    static {
        docq docqVar = new docq();
        a = docqVar;
        dsqw.cc(docq.class, docqVar);
    }

    private docq() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0001\u000bᐉ\u0006", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new docq();
            }
            if (i2 == 4) {
                return new docp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<docq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (docq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
