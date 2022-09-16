package defpackage;
/* compiled from: PG */
/* renamed from: dubq  reason: default package */
/* loaded from: classes.dex */
public final class dubq extends dsqw<dubq, dubo> implements dssk {
    public static final dubq i;
    private static volatile dssr<dubq> j;
    public Object b;
    public int c;
    public int g;
    public boolean h;
    public int a = 0;
    public String d = "";
    public String e = "";
    public dsrj<duco> f = dssu.b;

    static {
        dubq dubqVar = new dubq();
        i = dubqVar;
        dsqw.cc(dubq.class, dubqVar);
    }

    private dubq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0001\u0000\u0001\u000b\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\n\u001b", new Object[]{"b", "a", "c", "d", "g", duck.class, dubb.class, dubt.class, dubd.class, "h", "e", "f", duco.class});
            }
            if (i3 == 3) {
                return new dubq();
            }
            if (i3 == 4) {
                return new dubo();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dubq> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dubq.class) {
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
