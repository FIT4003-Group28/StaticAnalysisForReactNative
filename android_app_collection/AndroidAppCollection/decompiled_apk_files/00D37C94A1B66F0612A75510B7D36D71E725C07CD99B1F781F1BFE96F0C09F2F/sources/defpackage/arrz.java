package defpackage;
/* compiled from: PG */
/* renamed from: arrz  reason: default package */
/* loaded from: classes2.dex */
public final class arrz extends aopi implements aoqv {
    public static final arrz a;
    private static volatile aorb h;
    public int b;
    public arpa c;
    public arag d;
    public arrx e;
    public arsc f;
    private byte i = 2;
    public aopu g = emptyProtobufList();

    static {
        arrz arrzVar = new arrz();
        a = arrzVar;
        aopi.registerDefaultInstance(arrz.class, arrzVar);
    }

    private arrz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0005\u0001ᐉ\u0000\u0003ᐉ\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007Л", new Object[]{"b", "c", "d", "e", "f", "g", apzg.class});
            case 3:
                return new arrz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (arrz.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
