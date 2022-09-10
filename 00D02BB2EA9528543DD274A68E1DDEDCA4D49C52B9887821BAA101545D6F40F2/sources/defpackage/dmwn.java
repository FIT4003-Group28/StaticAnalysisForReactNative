package defpackage;
/* compiled from: PG */
/* renamed from: dmwn  reason: default package */
/* loaded from: classes6.dex */
public final class dmwn extends dsqw<dmwn, dmwm> implements dssk {
    public static final dmwn e;
    private static volatile dssr<dmwn> i;
    public int a;
    public int b;
    public dgrn c;
    public dgrn d;
    private dmyb f;
    private dgrn g;
    private byte h = 2;

    static {
        dmwn dmwnVar = new dmwn();
        e = dmwnVar;
        dsqw.cc(dmwn.class, dmwnVar);
    }

    private dmwn() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(e, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0004\u0001ᐉ\u0003\u0002ဋ\u0000\u0003ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006", new Object[]{"a", "f", "b", "g", "c", "d"});
            }
            if (i3 == 3) {
                return new dmwn();
            }
            if (i3 == 4) {
                return new dmwm();
            }
            if (i3 == 5) {
                return e;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dmwn> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dmwn.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
