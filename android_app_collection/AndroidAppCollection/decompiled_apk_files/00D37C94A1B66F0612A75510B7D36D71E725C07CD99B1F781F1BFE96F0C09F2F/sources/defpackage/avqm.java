package defpackage;
/* compiled from: PG */
/* renamed from: avqm  reason: default package */
/* loaded from: classes2.dex */
public final class avqm extends aopi implements aoqv {
    public static final avqm a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apok f;
    private apok g;
    private arag h;
    private arag i;
    private arag j;
    private arag k;
    private apok l;
    private apok m;
    private apok n;
    private arag o;
    private arag p;
    private apok q;
    private aoux r;
    private byte s = 2;

    static {
        avqm avqmVar = new avqm();
        a = avqmVar;
        aopi.registerDefaultInstance(avqm.class, avqmVar);
    }

    private avqm() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.s = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0012\u000f\u0000\u0000\u000f\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0010\tᐉ\u0005\nᐉ\u0006\u000bᐉ\u0007\fᐉ\b\rᐉ\t\u000eᐉ\n\u000fᐉ\u000b\u0010ᐉ\f\u0011ᐉ\r\u0012ᐉ\u000e", new Object[]{"c", "d", "e", "f", "g", "r", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
            case 3:
                return new avqm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avqm.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
