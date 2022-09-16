package defpackage;
/* compiled from: PG */
/* renamed from: arvn  reason: default package */
/* loaded from: classes2.dex */
public final class arvn extends aopi implements aoqv {
    public static final arvn a;
    private static volatile aorb e;
    public arpa b;
    public apzg d;
    private int f;
    private byte g = 2;
    public aopu c = emptyProtobufList();

    static {
        arvn arvnVar = new arvn();
        a = arvnVar;
        aopi.registerDefaultInstance(arvn.class, arvnVar);
    }

    private arvn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0001", new Object[]{"f", "b", "c", apzg.class, "d"});
            case 3:
                return new arvn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arvn.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
