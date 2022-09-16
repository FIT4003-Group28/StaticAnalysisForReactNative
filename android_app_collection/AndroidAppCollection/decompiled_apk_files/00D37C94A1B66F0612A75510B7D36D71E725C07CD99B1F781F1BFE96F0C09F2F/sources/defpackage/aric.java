package defpackage;
/* compiled from: PG */
/* renamed from: aric  reason: default package */
/* loaded from: classes2.dex */
public final class aric extends aopi implements aoqv {
    public static final aric a;
    private static volatile aorb b;
    private aoqp c = aoqp.a;
    private byte d = 2;

    static {
        aric aricVar = new aric();
        a = aricVar;
        aopi.registerDefaultInstance(aric.class, aricVar);
    }

    private aric() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.d = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0001\u0002в", new Object[]{"c", arib.a});
            case 3:
                return new aric();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aric.class) {
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
