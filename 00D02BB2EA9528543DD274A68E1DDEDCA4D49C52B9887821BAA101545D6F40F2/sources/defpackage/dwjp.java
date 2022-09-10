package defpackage;
/* compiled from: PG */
/* renamed from: dwjp  reason: default package */
/* loaded from: classes6.dex */
public final class dwjp extends dsqw<dwjp, dwjo> implements dssk {
    public static final dwjp h;
    private static volatile dssr<dwjp> j;
    public int a;
    public dwjh b;
    public int c;
    public ddfz e;
    public drgr f;
    public drgv g;
    private byte i = 2;
    public dspd d = dspd.b;

    static {
        dwjp dwjpVar = new dwjp();
        h = dwjpVar;
        dsqw.cc(dwjp.class, dwjpVar);
    }

    private dwjp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003ည\u0002\u0004ဉ\u0003\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i2 == 3) {
                return new dwjp();
            }
            if (i2 == 4) {
                return new dwjo();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dwjp> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dwjp.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
