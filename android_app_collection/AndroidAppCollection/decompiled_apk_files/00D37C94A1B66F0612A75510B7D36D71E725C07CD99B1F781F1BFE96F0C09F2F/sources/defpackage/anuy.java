package defpackage;
/* compiled from: PG */
/* renamed from: anuy  reason: default package */
/* loaded from: classes.dex */
public final class anuy extends aopi implements aoqv {
    public static final anuy a;
    private static volatile aorb b;
    private byte c = 2;

    static {
        anuy anuyVar = new anuy();
        a = anuyVar;
        aopi.registerDefaultInstance(anuy.class, anuyVar);
    }

    private anuy() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aopi.emptyProtobufList();
        aopi.emptyProtobufList();
        aopi.emptyProtobufList();
        aopi.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0000\u0000", null);
            case 3:
                return new anuy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (anuy.class) {
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
