package defpackage;
/* compiled from: PG */
/* renamed from: ddrk  reason: default package */
/* loaded from: classes6.dex */
public final class ddrk extends dsqw<ddrk, ddrj> implements dssk {
    public static final ddrk i;
    private static volatile dssr<ddrk> k;
    public int a;
    public int b;
    public float c;
    public int d;
    public int e;
    public dsre f = dsqk.b;
    public int g;
    public int h;
    private boolean j;

    static {
        ddrk ddrkVar = new ddrk();
        i = ddrkVar;
        dsqw.cc(ddrk.class, ddrkVar);
    }

    private ddrk() {
    }

    public static /* synthetic */ void b(ddrk ddrkVar) {
        ddrkVar.a |= 128;
        ddrkVar.j = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001ဏ\u0000\u0003ခ\u0002\u0004င\u0003\u0005င\u0004\u0006\u0013\u0007ဏ\u0005\bဏ\u0006\tဇ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "j"});
            }
            if (i3 == 3) {
                return new ddrk();
            }
            if (i3 == 4) {
                return new ddrj();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<ddrk> dssrVar = k;
            if (dssrVar == null) {
                synchronized (ddrk.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
