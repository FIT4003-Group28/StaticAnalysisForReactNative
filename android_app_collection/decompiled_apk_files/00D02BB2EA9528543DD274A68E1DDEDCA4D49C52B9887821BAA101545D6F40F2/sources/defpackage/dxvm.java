package defpackage;
/* compiled from: PG */
/* renamed from: dxvm  reason: default package */
/* loaded from: classes6.dex */
public final class dxvm extends dsqw<dxvm, dxvl> implements dssk {
    public static final dxvm c;
    private static volatile dssr<dxvm> d;
    public dspd a = dspd.b;
    public long b;

    static {
        dxvm dxvmVar = new dxvm();
        c = dxvmVar;
        dsqw.cc(dxvm.class, dxvmVar);
    }

    private dxvm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0002", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxvm();
            }
            if (i2 == 4) {
                return new dxvl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxvm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxvm.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
