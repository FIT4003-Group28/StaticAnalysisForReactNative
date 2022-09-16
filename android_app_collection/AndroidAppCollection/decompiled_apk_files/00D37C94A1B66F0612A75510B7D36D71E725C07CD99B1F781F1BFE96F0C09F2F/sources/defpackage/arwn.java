package defpackage;
/* compiled from: PG */
/* renamed from: arwn  reason: default package */
/* loaded from: classes2.dex */
public final class arwn extends aopi implements aoqv {
    public static final arwn a;
    private static volatile aorb d;
    public arpa b;
    private int e;
    private byte f = 2;
    public aopu c = emptyProtobufList();

    static {
        arwn arwnVar = new arwn();
        a = arwnVar;
        aopi.registerDefaultInstance(arwn.class, arwnVar);
    }

    private arwn() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0003Л", new Object[]{"e", "b", "c", apzg.class});
            case 3:
                return new arwn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (arwn.class) {
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
