package defpackage;
/* compiled from: PG */
/* renamed from: dowh  reason: default package */
/* loaded from: classes6.dex */
public final class dowh extends dsqw<dowh, dowg> implements dssk {
    public static final dowh i;
    private static volatile dssr<dowh> k;
    public int a;
    public dquj b;
    public dott c;
    public dpan f;
    public boolean g;
    private byte j = 2;
    public dsrj<dott> d = dssu.b;
    public String e = "";
    public String h = "";

    static {
        dowh dowhVar = new dowh();
        i = dowhVar;
        dsqw.cc(dowh.class, dowhVar);
    }

    private dowh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0003\u0001ဉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဈ\u0002\u0005ᐉ\u0003\u0006ဇ\u0004\u0007ဈ\u0005", new Object[]{"a", "b", "c", "d", dott.class, "e", "f", "g", "h"});
            }
            if (i3 == 3) {
                return new dowh();
            }
            if (i3 == 4) {
                return new dowg();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<dowh> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dowh.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
