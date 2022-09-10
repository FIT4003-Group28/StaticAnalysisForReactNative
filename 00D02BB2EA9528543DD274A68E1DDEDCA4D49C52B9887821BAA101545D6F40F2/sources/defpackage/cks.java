package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: cks  reason: default package */
/* loaded from: classes4.dex */
public final class cks extends dsqw<cks, ckr> implements dssk {
    public static final cks a;
    private static volatile dssr<cks> d;
    private ckw b;
    private ckw c;

    static {
        cks cksVar = new cks();
        a = cksVar;
        dsqw.cc(cks.class, cksVar);
    }

    private cks() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new cks();
            }
            if (i2 == 4) {
                return new ckr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cks> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cks.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
