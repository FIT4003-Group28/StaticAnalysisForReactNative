package defpackage;
/* compiled from: PG */
/* renamed from: duje  reason: default package */
/* loaded from: classes6.dex */
public final class duje extends dsqw<duje, dujd> implements dssk {
    public static final duje d;
    private static volatile dssr<duje> e;
    public dsrf a;
    public dsrf b;
    public dsrj<String> c;

    static {
        duje dujeVar = new duje();
        d = dujeVar;
        dsqw.cc(duje.class, dujeVar);
    }

    private duje() {
        dspd dspdVar = dspd.b;
        this.a = dsqz.b;
        this.b = dsqz.b;
        this.c = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0000\u0001\n\u0003\u0000\u0003\u0000\u0001'\u0003'\n\u001a", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new duje();
            }
            if (i2 == 4) {
                return new dujd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duje> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duje.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
