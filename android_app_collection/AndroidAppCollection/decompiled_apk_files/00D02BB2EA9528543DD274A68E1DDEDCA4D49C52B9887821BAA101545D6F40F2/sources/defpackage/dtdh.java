package defpackage;
/* compiled from: PG */
/* renamed from: dtdh  reason: default package */
/* loaded from: classes6.dex */
public final class dtdh extends dsqs<dtdh, dtdg> implements dsqt {
    public static final dtdh a;
    private static volatile dssr<dtdh> g;
    private int b;
    private dgrh c;
    private dgrn d;
    private dtro e;
    private byte f = 2;

    static {
        dtdh dtdhVar = new dtdh();
        a = dtdhVar;
        dsqw.cc(dtdh.class, dtdhVar);
    }

    private dtdh() {
        dssu<Object> dssuVar = dssu.b;
        dsrx dsrxVar = dsrx.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0003\u0000\u0001\b\u0018\u0003\u0000\u0000\u0003\bᐉ\b\tᐉ\t\u0018ᐉ\u000f", new Object[]{"b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dtdh();
            }
            if (i2 == 4) {
                return new dtdg();
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
            dssr<dtdh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtdh.class) {
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
