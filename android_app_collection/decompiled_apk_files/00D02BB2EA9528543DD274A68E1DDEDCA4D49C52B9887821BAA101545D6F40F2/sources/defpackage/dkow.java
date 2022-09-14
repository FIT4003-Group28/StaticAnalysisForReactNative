package defpackage;
/* compiled from: PG */
/* renamed from: dkow  reason: default package */
/* loaded from: classes6.dex */
public final class dkow extends dsqw<dkow, dkov> implements dssk {
    public static final dkow i;
    private static volatile dssr<dkow> j;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public dkyx h;

    static {
        dkow dkowVar = new dkow();
        i = dkowVar;
        dsqw.cc(dkow.class, dkowVar);
    }

    private dkow() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0006ဇ\u0005\fဇ\u000b\rဉ\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dkow();
            }
            if (i3 == 4) {
                return new dkov();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dkow> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dkow.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
