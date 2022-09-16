package defpackage;
/* compiled from: PG */
/* renamed from: dtel  reason: default package */
/* loaded from: classes6.dex */
public final class dtel extends dsqw<dtel, dtek> implements dssk {
    public static final dtel a;
    private static volatile dssr<dtel> p;
    private int b;
    private dtff c;
    private dtet d;
    private dtej e;
    private dtev f;
    private dtfb g;
    private dtfd h;
    private dtex i;
    private dter j;
    private dten k;
    private dtez l;
    private dtep m;
    private dtfh n;
    private byte o = 2;

    static {
        dtel dtelVar = new dtel();
        a = dtelVar;
        dsqw.cc(dtel.class, dtelVar);
    }

    private dtel() {
        dssu<Object> dssuVar = dssu.b;
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\f\u0000\u0001\u0001\u0013\f\u0000\u0000\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\t\tᐉ\n\rᐉ\u000e\u000eᐉ\u000f\u0013ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "n", "h"});
            }
            if (i2 == 3) {
                return new dtel();
            }
            if (i2 == 4) {
                return new dtek();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.o = b;
                return null;
            }
            dssr<dtel> dssrVar = p;
            if (dssrVar == null) {
                synchronized (dtel.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.o);
    }
}
