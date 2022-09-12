package defpackage;
/* compiled from: PG */
/* renamed from: aknq  reason: default package */
/* loaded from: classes2.dex */
public final class aknq extends dsqw<aknq, aknp> implements dssk {
    public static final aknq d;
    private static volatile dssr<aknq> f;
    public int a;
    public int b;
    public diwb c;
    private byte e = 2;

    static {
        aknq aknqVar = new aknq();
        d = aknqVar;
        dsqw.cc(aknq.class, aknqVar);
    }

    private aknq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", aknt.c(), "c"});
            }
            if (i2 == 3) {
                return new aknq();
            }
            if (i2 == 4) {
                return new aknp();
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
            dssr<aknq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (aknq.class) {
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
