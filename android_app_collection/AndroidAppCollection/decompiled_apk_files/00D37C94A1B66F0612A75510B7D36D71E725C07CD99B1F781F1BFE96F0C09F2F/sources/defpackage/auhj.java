package defpackage;
/* compiled from: PG */
/* renamed from: auhj  reason: default package */
/* loaded from: classes2.dex */
public final class auhj extends aopi implements aoqv {
    public static final auhj a;
    private static volatile aorb b;
    private int c;
    private aplw d;
    private arag e;
    private auhf f;
    private byte g = 2;

    static {
        auhj auhjVar = new auhj();
        a = auhjVar;
        aopi.registerDefaultInstance(auhj.class, auhjVar);
    }

    private auhj() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new auhj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (auhj.class) {
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
