package defpackage;
/* compiled from: PG */
/* renamed from: zzm  reason: default package */
/* loaded from: classes7.dex */
public final class zzm extends dsqw<zzm, zzl> implements dssk {
    public static final zzm d;
    private static volatile dssr<zzm> e;
    public int a;
    public dsrj<duhe> b = dssu.b;
    public double c;

    static {
        zzm zzmVar = new zzm();
        d = zzmVar;
        dsqw.cc(zzm.class, zzmVar);
    }

    private zzm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002က\u0000", new Object[]{"a", "b", duhe.class, "c"});
            }
            if (i2 == 3) {
                return new zzm();
            }
            if (i2 == 4) {
                return new zzl();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<zzm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (zzm.class) {
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
