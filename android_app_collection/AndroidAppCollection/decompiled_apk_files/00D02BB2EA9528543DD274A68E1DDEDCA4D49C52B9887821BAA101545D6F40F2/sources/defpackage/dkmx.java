package defpackage;
/* compiled from: PG */
/* renamed from: dkmx  reason: default package */
/* loaded from: classes6.dex */
public final class dkmx extends dsqw<dkmx, dkmq> implements dssk {
    public static final dkmx i;
    private static volatile dssr<dkmx> k;
    public boolean a;
    public boolean b;
    public boolean d;
    public boolean e;
    public dkmw g;
    public dkmu h;
    private int j;
    public dsrj<String> c = dssu.b;
    public int f = 10;

    static {
        dkmx dkmxVar = new dkmx();
        i = dkmxVar;
        dsqw.cc(dkmx.class, dkmxVar);
    }

    private dkmx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003\u001a\u0004ဇ\u0002\u0005ဇ\u0003\u0006င\u0004\u0007ဉ\u0005\bဉ\u0006", new Object[]{"j", "a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dkmx();
            }
            if (i3 == 4) {
                return new dkmq();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dkmx> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dkmx.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
