package defpackage;
/* compiled from: PG */
/* renamed from: dtj  reason: default package */
/* loaded from: classes6.dex */
public final class dtj extends dsqw<dtj, dti> implements dssk {
    public static final dtj i;
    private static volatile dssr<dtj> k;
    public int a;
    public duhe b;
    public String c = "";
    public float d;
    public float e;
    public int f;
    public duhe g;
    public float h;
    private boolean j;

    static {
        dtj dtjVar = new dtj();
        i = dtjVar;
        dsqw.cc(dtj.class, dtjVar);
    }

    private dtj() {
    }

    public static /* synthetic */ void b(dtj dtjVar) {
        dtjVar.a |= 128;
        dtjVar.j = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဌ\u0004\u0006ဉ\u0005\u0007ခ\u0006\bဇ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", dgau.c(), "g", "h", "j"});
            }
            if (i3 == 3) {
                return new dtj();
            }
            if (i3 == 4) {
                return new dti();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dtj> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dtj.class) {
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
