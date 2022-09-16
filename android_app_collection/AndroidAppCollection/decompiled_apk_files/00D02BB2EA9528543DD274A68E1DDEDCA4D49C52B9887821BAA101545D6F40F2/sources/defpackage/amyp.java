package defpackage;
/* compiled from: PG */
/* renamed from: amyp  reason: default package */
/* loaded from: classes2.dex */
public final class amyp extends dsqw<amyp, amyo> implements dssk {
    public static final amyp i;
    private static volatile dssr<amyp> j;
    public int a;
    public dsrj<amyr> b = dssu.b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public long h;

    static {
        amyp amypVar = new amyp();
        i = amypVar;
        dsqw.cc(amyp.class, amypVar);
    }

    private amyp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0004င\u0002\u0005င\u0003\bဂ\u0006\tဂ\u0007\nဂ\b", new Object[]{"a", "b", amyr.class, "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new amyp();
            }
            if (i3 == 4) {
                return new amyo();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<amyp> dssrVar = j;
            if (dssrVar == null) {
                synchronized (amyp.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
