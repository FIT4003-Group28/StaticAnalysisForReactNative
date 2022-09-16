package defpackage;
/* compiled from: PG */
/* renamed from: dkem  reason: default package */
/* loaded from: classes6.dex */
public final class dkem extends dsqw<dkem, dkej> implements dssk {
    public static final dkem i;
    private static volatile dssr<dkem> l;
    public int a;
    public dkel b;
    public dwfv c;
    public int d;
    public dqlu e;
    public int f;
    public dqme h;
    private dnqh j;
    private byte k = 2;
    public dsrj<dqmc> g = dssu.b;

    static {
        dkem dkemVar = new dkem();
        i = dkemVar;
        dsqw.cc(dkem.class, dkemVar);
    }

    private dkem() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဌ\u0003\u0006ဉ\u0002\u0007ဌ\u0006\t\u001b\nဉ\u0005\u000bဉ\u0007", new Object[]{"a", "j", "b", "d", dqlx.a, "c", "f", dqmi.c(), "g", dqmc.class, "e", "h"});
            }
            if (i3 == 3) {
                return new dkem();
            }
            if (i3 == 4) {
                return new dkej();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<dkem> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dkem.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }
}
