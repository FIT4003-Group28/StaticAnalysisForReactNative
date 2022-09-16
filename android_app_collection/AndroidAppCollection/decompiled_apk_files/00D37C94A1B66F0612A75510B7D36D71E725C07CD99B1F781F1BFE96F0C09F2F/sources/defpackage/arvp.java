package defpackage;
/* compiled from: PG */
/* renamed from: arvp  reason: default package */
/* loaded from: classes2.dex */
public final class arvp extends aopi implements aoqv {
    public static final arvp a;
    private static volatile aorb d;
    public arpa b;
    private int e;
    private byte f = 2;
    public aopu c = emptyProtobufList();

    static {
        arvp arvpVar = new arvp();
        a = arvpVar;
        aopi.registerDefaultInstance(arvp.class, arvpVar);
    }

    private arvp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"e", "b", "c", apzg.class});
            case 3:
                return new arvp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arvp.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
