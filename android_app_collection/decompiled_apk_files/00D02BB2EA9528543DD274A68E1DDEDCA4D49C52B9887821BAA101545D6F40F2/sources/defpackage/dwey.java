package defpackage;
/* compiled from: PG */
/* renamed from: dwey  reason: default package */
/* loaded from: classes.dex */
public final class dwey extends dsqw<dwey, dwex> implements dssk {
    public static final dwey c;
    private static volatile dssr<dwey> e;
    public int a;
    public boolean b;
    private boolean d;

    static {
        dwey dweyVar = new dwey();
        c = dweyVar;
        dsqw.cc(dwey.class, dweyVar);
    }

    private dwey() {
    }

    public static /* synthetic */ void c(dwey dweyVar) {
        dweyVar.a |= 2;
        dweyVar.d = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "d"});
            }
            if (i2 == 3) {
                return new dwey();
            }
            if (i2 == 4) {
                return new dwex();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwey> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwey.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
