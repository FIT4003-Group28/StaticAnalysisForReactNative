package defpackage;
/* compiled from: PG */
/* renamed from: dsvf  reason: default package */
/* loaded from: classes6.dex */
public final class dsvf extends dsqw<dsvf, dsve> implements dssk {
    public static final dsvf c;
    private static volatile dssr<dsvf> e;
    private byte d = 2;
    public dsrj<dsyn> a = dssu.b;
    public dsrj<dsyn> b = dssu.b;

    static {
        dsvf dsvfVar = new dsvf();
        c = dsvfVar;
        dsqw.cc(dsvf.class, dsvfVar);
    }

    private dsvf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"a", dsyn.class, "b", dsyn.class});
            }
            if (i2 == 3) {
                return new dsvf();
            }
            if (i2 == 4) {
                return new dsve();
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
            dssr<dsvf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsvf.class) {
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
