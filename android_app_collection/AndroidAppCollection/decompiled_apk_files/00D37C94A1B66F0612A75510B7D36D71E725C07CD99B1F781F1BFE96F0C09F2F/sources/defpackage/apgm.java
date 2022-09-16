package defpackage;
/* compiled from: PG */
/* renamed from: apgm  reason: default package */
/* loaded from: classes.dex */
public final class apgm extends aopi implements aoqv {
    public static final apgm a;
    private static volatile aorb u;
    public int b;
    public int e;
    public arag f;
    public arag g;
    public arag h;
    public arag i;
    public avhn j;
    public boolean l;
    public boolean m;
    public boolean p;
    public boolean q;
    public int s;
    public int t;
    private byte v = 2;
    public String c = "";
    public int d = 99;
    public String k = "";
    public boolean n = true;
    public boolean o = true;
    public String r = "";

    static {
        apgm apgmVar = new apgm();
        a = apgmVar;
        aopi.registerDefaultInstance(apgm.class, apgmVar);
    }

    private apgm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.v = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001\u001b\u0012\u0000\u0000\u0005\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\nဈ\b\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u000fဈ\u000f\u0017င\u0011\u0019ဇ\t\u001aဌ\u0010\u001bဇ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "r", "t", "l", "s", atdq.t, "q"});
            case 3:
                return new apgm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = u;
                if (aorbVar == null) {
                    synchronized (apgm.class) {
                        aorbVar = u;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            u = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
