package defpackage;
/* compiled from: PG */
/* renamed from: dunw  reason: default package */
/* loaded from: classes6.dex */
public final class dunw extends dsqw<dunw, dunv> implements dssk {
    public static final dunw a;
    private static volatile dssr<dunw> e;
    private int b;
    private dvvi c;
    private byte d = 2;

    static {
        dunw dunwVar = new dunw();
        a = dunwVar;
        dsqw.cc(dunw.class, dunwVar);
    }

    private dunw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dunw();
            }
            if (i2 == 4) {
                return new dunv();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dunw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dunw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
