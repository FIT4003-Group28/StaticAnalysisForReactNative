package defpackage;
/* compiled from: PG */
/* renamed from: diai  reason: default package */
/* loaded from: classes6.dex */
public final class diai extends dsqs<diai, diah> implements dsqt {
    public static final diai h;
    private static volatile dssr<diai> k;
    public int a;
    public dnwb c;
    public dqao d;
    public dhta e;
    public dhte f;
    public boolean g;
    private dnqh i;
    private byte j = 2;
    public String b = "";

    static {
        diai diaiVar = new diai();
        h = diaiVar;
        dsqw.cc(diai.class, diaiVar);
    }

    private diai() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0006ဉ\u0003\bᐉ\b\tဉ\u0005\nဇ\u0006\u000bဉ\u0004", new Object[]{"a", "b", "c", "d", "i", "f", "g", "e"});
            }
            if (i2 == 3) {
                return new diai();
            }
            if (i2 == 4) {
                return new diah();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<diai> dssrVar = k;
            if (dssrVar == null) {
                synchronized (diai.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
