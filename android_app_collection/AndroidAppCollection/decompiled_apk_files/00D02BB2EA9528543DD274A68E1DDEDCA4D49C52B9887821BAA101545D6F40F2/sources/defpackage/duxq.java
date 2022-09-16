package defpackage;
/* compiled from: PG */
/* renamed from: duxq  reason: default package */
/* loaded from: classes6.dex */
public final class duxq extends dsqw<duxq, duxp> implements dssk {
    public static final duxq c;
    private static volatile dssr<duxq> e;
    public int a;
    public dmni b;
    private byte d = 2;

    static {
        duxq duxqVar = new duxq();
        c = duxqVar;
        dsqw.cc(duxq.class, duxqVar);
    }

    private duxq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new duxq();
            }
            if (i2 == 4) {
                return new duxp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<duxq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duxq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
