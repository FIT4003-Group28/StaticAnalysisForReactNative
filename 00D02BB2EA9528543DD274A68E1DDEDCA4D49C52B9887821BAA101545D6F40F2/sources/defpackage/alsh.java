package defpackage;
/* compiled from: PG */
/* renamed from: alsh  reason: default package */
/* loaded from: classes2.dex */
public final class alsh extends dsqw<alsh, alsa> implements dssk {
    public static final alsh h;
    private static volatile dssr<alsh> j;
    public int b;
    public alsg d;
    public alsg e;
    private int i;
    public dsrj<alsc> a = dssu.b;
    public dsrj<String> c = dssu.b;
    public dsrj<alse> f = dssu.b;
    public dspd g = dspd.b;

    static {
        alsh alshVar = new alsh();
        h = alshVar;
        dsqw.cc(alsh.class, alshVar);
    }

    private alsh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u001b\u0002င\u0000\u0003\u001a\u0004ဉ\u0001\u0005ဉ\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"i", "a", alsc.class, "b", "c", "d", "e", "f", alse.class, "g"});
            }
            if (i2 == 3) {
                return new alsh();
            }
            if (i2 == 4) {
                return new alsa();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<alsh> dssrVar = j;
            if (dssrVar == null) {
                synchronized (alsh.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
