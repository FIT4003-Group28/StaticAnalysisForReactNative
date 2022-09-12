package defpackage;
/* compiled from: PG */
/* renamed from: bbvn  reason: default package */
/* loaded from: classes3.dex */
public final class bbvn extends dsqw<bbvn, bbvm> implements dssk {
    public static final bbvn d;
    private static volatile dssr<bbvn> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        bbvn bbvnVar = new bbvn();
        d = bbvnVar;
        dsqw.cc(bbvn.class, bbvnVar);
    }

    private bbvn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bbvn();
            }
            if (i2 == 4) {
                return new bbvm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bbvn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bbvn.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
