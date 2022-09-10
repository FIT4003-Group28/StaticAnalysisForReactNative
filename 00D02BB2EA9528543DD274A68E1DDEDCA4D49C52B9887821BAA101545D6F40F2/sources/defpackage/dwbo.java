package defpackage;
/* compiled from: PG */
/* renamed from: dwbo  reason: default package */
/* loaded from: classes6.dex */
public final class dwbo extends dsqw<dwbo, dwbn> implements dssk {
    public static final dwbo c;
    private static volatile dssr<dwbo> e;
    public int a;
    public dvzu b;
    private byte d = 2;

    static {
        dwbo dwboVar = new dwbo();
        c = dwboVar;
        dsqw.cc(dwbo.class, dwboVar);
    }

    private dwbo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dwbo();
            }
            if (i2 == 4) {
                return new dwbn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dwbo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwbo.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
