package defpackage;
/* compiled from: PG */
/* renamed from: asew  reason: default package */
/* loaded from: classes2.dex */
public final class asew extends aopi implements aoqv {
    public static final asew a;
    private static volatile aorb j;
    public int b;
    public aroy c;
    public avuy d;
    public apxd g;
    public asfa h;
    public awbb i;
    private byte k = 2;
    public String e = "";
    public int f = 1;

    static {
        asew asewVar = new asew();
        a = asewVar;
        aopi.registerDefaultInstance(asew.class, asewVar);
    }

    private asew() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဉ\u0004\bဉ\u0007\u000bဉ\t", new Object[]{"b", "c", "d", "e", "f", asev.a, "g", "h", "i"});
            case 3:
                return new asew();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (asew.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
