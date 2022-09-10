package defpackage;
/* compiled from: PG */
/* renamed from: dncq  reason: default package */
/* loaded from: classes6.dex */
public final class dncq extends dsqw<dncq, dnco> implements dssk {
    public static final dncq b;
    private static volatile dssr<dncq> e;
    private Object c;
    public int a = 0;
    private byte d = 2;

    static {
        dncq dncqVar = new dncq();
        b = dncqVar;
        dsqw.cc(dncq.class, dncqVar);
    }

    private dncq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ᐼ\u0000\u0006ᐼ\u0000", new Object[]{"c", "a", dncn.class, dncs.class, dncy.class, dncw.class, dnda.class, dncu.class});
            }
            if (i2 == 3) {
                return new dncq();
            }
            if (i2 == 4) {
                return new dnco();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.d = b2;
                return null;
            }
            dssr<dncq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dncq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
