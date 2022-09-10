package defpackage;
/* compiled from: PG */
/* renamed from: cpzy  reason: default package */
/* loaded from: classes5.dex */
public final class cpzy extends dsqw<cpzy, cpzj> implements dssk {
    public static final cpzy g;
    private static volatile dssr<cpzy> j;
    public int a;
    public cpzn b;
    public cpzx c;
    public cpzi e;
    private cpyc h;
    private byte i = 2;
    public dsrj<cpzb> d = dssu.b;
    public dsrf f = dsqz.b;

    static {
        cpzy cpzyVar = new cpzy();
        g = cpzyVar;
        dsqw.cc(cpzy.class, cpzyVar);
    }

    private cpzy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0002\u0001\u0001ဉ\u0001\u0002ဉ\u0002\u0005\u001b\u0006ᐉ\u0005\u0007\u001e\bဉ\u0006", new Object[]{"a", "b", "c", "d", cpzb.class, "e", "f", cpzl.c(), "h"});
            }
            if (i2 == 3) {
                return new cpzy();
            }
            if (i2 == 4) {
                return new cpzj();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<cpzy> dssrVar = j;
            if (dssrVar == null) {
                synchronized (cpzy.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
