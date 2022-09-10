package defpackage;
/* compiled from: PG */
/* renamed from: dico  reason: default package */
/* loaded from: classes6.dex */
public final class dico extends dsqw<dico, dicn> implements dssk {
    public static final dico h;
    private static volatile dssr<dico> k;
    public int a;
    public Object c;
    public dwfv f;
    public dnwb g;
    private dnqh i;
    public int b = 0;
    private byte j = 2;
    public String d = "";
    public String e = "";

    static {
        dico dicoVar = new dico();
        h = dicoVar;
        dsqw.cc(dico.class, dicoVar);
    }

    private dico() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0007\u0001\u0001\u0001\f\u0007\u0000\u0000\u0001\u0001ဈ\u0000\u0002ွ\u0000\u0007ဉ\u0005\bဉ\u0004\tᐉ\u0006\u000bဈ\u0001\fျ\u0000", new Object[]{"c", "b", "a", "d", "g", "f", "i", "e"});
            }
            if (i2 == 3) {
                return new dico();
            }
            if (i2 == 4) {
                return new dicn();
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
            dssr<dico> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dico.class) {
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
