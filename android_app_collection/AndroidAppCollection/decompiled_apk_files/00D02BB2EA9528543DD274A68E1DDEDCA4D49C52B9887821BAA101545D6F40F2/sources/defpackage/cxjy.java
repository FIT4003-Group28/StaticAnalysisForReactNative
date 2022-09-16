package defpackage;
/* compiled from: PG */
/* renamed from: cxjy  reason: default package */
/* loaded from: classes5.dex */
public final class cxjy extends dsqw<cxjy, cxjx> implements dssk {
    public static final cxjy i;
    private static volatile dssr<cxjy> j;
    public int a;
    public String b = "";
    public dspd c = dspd.b;
    public String d = "";
    public dsrj<cxka> e = dssu.b;
    public dsrj<String> f = dssu.b;
    public boolean g;
    public long h;

    static {
        cxjy cxjyVar = new cxjy();
        i = cxjyVar;
        dsqw.cc(cxjy.class, cxjyVar);
    }

    private cxjy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"a", "d", "b", "c", "e", cxka.class, "f", "g", "h"});
            }
            if (i3 == 3) {
                return new cxjy();
            }
            if (i3 == 4) {
                return new cxjx();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<cxjy> dssrVar = j;
            if (dssrVar == null) {
                synchronized (cxjy.class) {
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
