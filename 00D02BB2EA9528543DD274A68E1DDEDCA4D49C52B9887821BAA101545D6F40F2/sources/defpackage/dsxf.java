package defpackage;
/* compiled from: PG */
/* renamed from: dsxf  reason: default package */
/* loaded from: classes6.dex */
public final class dsxf extends dsqw<dsxf, dswz> implements dssk {
    public static final dsxf a;
    private static volatile dssr<dsxf> j;
    private int b;
    private drth c;
    private drth d;
    private dstq e;
    private dssd<String, Long> f = dssd.b;
    private dssd<String, dsxb> g = dssd.b;
    private dssd<String, dsww> h = dssd.b;
    private byte i = 2;

    static {
        dsxf dsxfVar = new dsxf();
        a = dsxfVar;
        dsqw.cc(dsxf.class, dsxfVar);
    }

    private dsxf() {
        dssu<Object> dssuVar = dssu.b;
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0006\u0000\u0001\u0007\u001b\u0006\u0003\u0000\u0002\u0007ဉ\u0006\u0010ᐉ\u0001\u00112\u0014ᐉ\u0002\u00182\u001b2", new Object[]{"b", "e", "c", "f", dsxd.a, "d", "g", dsxc.a, "h", dsxe.a});
            }
            if (i2 == 3) {
                return new dsxf();
            }
            if (i2 == 4) {
                return new dswz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dsxf> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dsxf.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
