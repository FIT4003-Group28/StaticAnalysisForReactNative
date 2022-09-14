package defpackage;
/* compiled from: PG */
/* renamed from: btyq */
/* loaded from: classes.dex */
public final class btyq extends dsqw<btyq, btyp> implements dssk {
    public static final btyq h;
    private static volatile dssr<btyq> i;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g = true;

    static {
        btyq btyqVar = new btyq();
        h = btyqVar;
        dsqw.cc(btyq.class, btyqVar);
    }

    private btyq() {
    }

    public static /* synthetic */ void b(btyq btyqVar) {
        btyqVar.a |= 16;
        btyqVar.f = false;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဇ\u0005\u0005ဇ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"a", "b", "c", "g", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new btyq();
            }
            if (i3 == 4) {
                return new btyp();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<btyq> dssrVar = i;
            if (dssrVar == null) {
                synchronized (btyq.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
