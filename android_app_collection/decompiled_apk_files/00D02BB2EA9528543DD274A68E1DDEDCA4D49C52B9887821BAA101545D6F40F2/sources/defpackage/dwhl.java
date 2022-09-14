package defpackage;
/* compiled from: PG */
/* renamed from: dwhl  reason: default package */
/* loaded from: classes6.dex */
public final class dwhl extends dsqw<dwhl, dwhk> implements dssk {
    public static final dwhl c;
    private static volatile dssr<dwhl> e;
    public int a;
    public djuv b;
    private byte d = 2;

    static {
        dwhl dwhlVar = new dwhl();
        c = dwhlVar;
        dsqw.cc(dwhl.class, dwhlVar);
    }

    private dwhl() {
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
                return new dwhl();
            }
            if (i2 == 4) {
                return new dwhk();
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
            dssr<dwhl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwhl.class) {
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
