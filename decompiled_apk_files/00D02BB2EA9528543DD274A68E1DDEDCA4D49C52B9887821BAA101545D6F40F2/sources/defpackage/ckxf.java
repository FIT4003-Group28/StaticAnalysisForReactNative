package defpackage;
/* compiled from: PG */
/* renamed from: ckxf  reason: default package */
/* loaded from: classes5.dex */
public final class ckxf extends dsqw<ckxf, ckxe> implements dssk {
    public static final ckxf i;
    private static volatile dssr<ckxf> j;
    public int a;
    public ckvz b;
    public double c;
    public long d;
    public float e;
    public float f;
    public float g;
    public int h;

    static {
        ckxf ckxfVar = new ckxf();
        i = ckxfVar;
        dsqw.cc(ckxf.class, ckxfVar);
    }

    private ckxf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002က\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new ckxf();
            }
            if (i3 == 4) {
                return new ckxe();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<ckxf> dssrVar = j;
            if (dssrVar == null) {
                synchronized (ckxf.class) {
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
