package defpackage;
/* compiled from: PG */
/* renamed from: dkbk  reason: default package */
/* loaded from: classes6.dex */
public final class dkbk extends dsqw<dkbk, dkbj> implements dssk {
    public static final dkbk a;
    private static volatile dssr<dkbk> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dkbk dkbkVar = new dkbk();
        a = dkbkVar;
        dsqw.cc(dkbk.class, dkbkVar);
    }

    private dkbk() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dkbk();
            }
            if (i2 == 4) {
                return new dkbj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dkbk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkbk.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
