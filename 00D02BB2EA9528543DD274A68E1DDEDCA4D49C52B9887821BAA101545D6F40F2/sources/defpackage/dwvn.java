package defpackage;
/* compiled from: PG */
/* renamed from: dwvn  reason: default package */
/* loaded from: classes6.dex */
public final class dwvn extends dsqw<dwvn, dwvm> implements dssk {
    public static final dwvn f;
    private static volatile dssr<dwvn> i;
    public int a;
    public boolean b;
    public dorq c;
    public dnwb d;
    public boolean e;
    private dnqh g;
    private byte h = 2;

    static {
        dwvn dwvnVar = new dwvn();
        f = dwvnVar;
        dsqw.cc(dwvn.class, dwvnVar);
    }

    private dwvn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0004ဇ\u0003\u0005ဉ\u0002\u0006ᐉ\u0005", new Object[]{"a", "b", "c", "e", "d", "g"});
            }
            if (i3 == 3) {
                return new dwvn();
            }
            if (i3 == 4) {
                return new dwvm();
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dwvn> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dwvn.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
