package defpackage;
/* compiled from: PG */
/* renamed from: dodr  reason: default package */
/* loaded from: classes6.dex */
public final class dodr extends dsqw<dodr, dodq> implements dssk {
    public static final dodr i;
    private static volatile dssr<dodr> j;
    public int a;
    public doud b;
    public dsrj<dodp> c;
    public dnoh d;
    public int e;
    public int f;
    public int g;
    public dspd h;

    static {
        dodr dodrVar = new dodr();
        i = dodrVar;
        dsqw.cc(dodr.class, dodrVar);
    }

    private dodr() {
        dssu<Object> dssuVar = dssu.b;
        this.c = dssu.b;
        this.h = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0003င\u0002\u0004င\u0004\u0005ည\u0005\u0006င\u0003\u0007ဉ\u0001\b\u001b", new Object[]{"a", "b", "e", "g", "h", "f", "d", "c", dodp.class});
            }
            if (i3 == 3) {
                return new dodr();
            }
            if (i3 == 4) {
                return new dodq();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dodr> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dodr.class) {
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

    public final void b() {
        dsrj<dodp> dsrjVar = this.c;
        if (!dsrjVar.a()) {
            this.c = dsqw.cl(dsrjVar);
        }
    }
}
