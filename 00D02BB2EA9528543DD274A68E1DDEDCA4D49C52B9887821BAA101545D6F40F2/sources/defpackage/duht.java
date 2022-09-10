package defpackage;
/* compiled from: PG */
/* renamed from: duht  reason: default package */
/* loaded from: classes6.dex */
public final class duht extends dsqs<duht, duhq> implements dsqt {
    public static final duht d;
    private static volatile dssr<duht> k;
    public int a;
    public int b;
    public dtro c;
    private int e;
    private dhhd f;
    private dhgv g;
    private dszu h;
    private dssd<String, duhp> i = dssd.b;
    private byte j = 2;

    static {
        duht duhtVar = new duht();
        d = duhtVar;
        dsqw.cc(duht.class, duhtVar);
    }

    private duht() {
        dssu<Object> dssuVar = dssu.b;
        dspd dspdVar = dspd.b;
        dsqz dsqzVar = dsqz.b;
        dsrx dsrxVar = dsrx.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0006\u0000\u0002\u0001c\u0006\u0001\u0000\u0004\u0001ဌ\u0000\u001bᐉ\u0018\u001cᐉ\u0019)ᐉ&+2cᐉ\u001a", new Object[]{"a", "e", "b", duhs.a, "f", "c", "h", "i", duhr.a, "g"});
            }
            if (i2 == 3) {
                return new duht();
            }
            if (i2 == 4) {
                return new duhq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<duht> dssrVar = k;
            if (dssrVar == null) {
                synchronized (duht.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
