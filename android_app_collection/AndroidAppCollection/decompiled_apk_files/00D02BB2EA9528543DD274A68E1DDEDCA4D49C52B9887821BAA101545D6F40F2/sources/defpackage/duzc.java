package defpackage;
/* compiled from: PG */
/* renamed from: duzc  reason: default package */
/* loaded from: classes6.dex */
public final class duzc extends dsqw<duzc, duyr> implements dssk {
    public static final duzc h;
    private static volatile dssr<duzc> j;
    public int a;
    public dngs b;
    public dngq c;
    public boolean d;
    public dnwb e;
    public dnqh f;
    public duzb g;
    private byte i = 2;

    static {
        duzc duzcVar = new duzc();
        h = duzcVar;
        dsqw.cc(duzc.class, duzcVar);
    }

    private duzc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0004\u0005ᐉ\u0005\u0006ဇ\u0003\u0007ဉ\u0006", new Object[]{"a", "b", "c", "e", "f", "d", "g"});
            }
            if (i2 == 3) {
                return new duzc();
            }
            if (i2 == 4) {
                return new duyr();
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
            dssr<duzc> dssrVar = j;
            if (dssrVar == null) {
                synchronized (duzc.class) {
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
