package defpackage;
/* compiled from: PG */
/* renamed from: dtdv  reason: default package */
/* loaded from: classes6.dex */
public final class dtdv extends dsqs<dtdv, dtdu> implements dsqt {
    public static final dtdv c;
    private static volatile dssr<dtdv> i;
    public int a;
    public dhhn b;
    private dtdr d;
    private dtdx e;
    private dtdt f;
    private dekl g;
    private byte h = 2;

    static {
        dtdv dtdvVar = new dtdv();
        c = dtdvVar;
        dsqw.cc(dtdv.class, dtdvVar);
    }

    private dtdv() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(c, "\u0001\u0005\u0000\u0001\u0002\f\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ᐉ\u0002\u0007ᐉ\u0003\u000bᐉ\u0007\fᐉ\t", new Object[]{"a", "d", "e", "f", "g", "b"});
            }
            if (i3 == 3) {
                return new dtdv();
            }
            if (i3 == 4) {
                return new dtdu();
            }
            if (i3 == 5) {
                return c;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dtdv> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dtdv.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
