package defpackage;
/* compiled from: PG */
/* renamed from: ckzy  reason: default package */
/* loaded from: classes5.dex */
public final class ckzy extends dsqw<ckzy, ckzx> implements dssk {
    public static final ckzy c;
    private static volatile dssr<ckzy> e;
    public Object b;
    public int a = 0;
    private byte d = 2;

    static {
        ckzy ckzyVar = new ckzy();
        c = ckzyVar;
        dsqw.cc(ckzy.class, ckzyVar);
    }

    private ckzy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဵ\u0000\u0002ᐼ\u0000", new Object[]{"b", "a", clah.class});
            }
            if (i2 == 3) {
                return new ckzy();
            }
            if (i2 == 4) {
                return new ckzx();
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
            dssr<ckzy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ckzy.class) {
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
