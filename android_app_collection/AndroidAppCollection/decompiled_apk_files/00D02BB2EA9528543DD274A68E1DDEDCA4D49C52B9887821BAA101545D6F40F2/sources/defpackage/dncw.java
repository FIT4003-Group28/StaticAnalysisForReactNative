package defpackage;
/* compiled from: PG */
/* renamed from: dncw  reason: default package */
/* loaded from: classes6.dex */
public final class dncw extends dsqw<dncw, dncv> implements dssk {
    public static final dncw a;
    private static volatile dssr<dncw> g;
    private int b;
    private dncn c;
    private dncn d;
    private dgrn e;
    private byte f = 2;

    static {
        dncw dncwVar = new dncw();
        a = dncwVar;
        dsqw.cc(dncw.class, dncwVar);
    }

    private dncw() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dncw();
            }
            if (i2 == 4) {
                return new dncv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dncw> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dncw.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
