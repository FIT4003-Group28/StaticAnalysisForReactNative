package defpackage;
/* compiled from: PG */
/* renamed from: diey  reason: default package */
/* loaded from: classes6.dex */
public final class diey extends dsqw<diey, diex> implements dssk {
    public static final diey d;
    private static volatile dssr<diey> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        diey dieyVar = new diey();
        d = dieyVar;
        dsqw.cc(diey.class, dieyVar);
    }

    private diey() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new diey();
            }
            if (i2 == 4) {
                return new diex();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diey> dssrVar = e;
            if (dssrVar == null) {
                synchronized (diey.class) {
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
