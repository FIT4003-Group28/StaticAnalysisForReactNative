package defpackage;
/* compiled from: PG */
/* renamed from: avrn  reason: default package */
/* loaded from: classes2.dex */
public final class avrn extends aopi implements aoqv {
    public static final avrn a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private aoux f;
    private byte g = 2;

    static {
        avrn avrnVar = new avrn();
        a = avrnVar;
        aopi.registerDefaultInstance(avrn.class, avrnVar);
    }

    private avrn() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001ᐉ\u0001\u0004ᐉ\u0003\u0006ᐉ\u0002", new Object[]{"c", "d", "f", "e"});
            case 3:
                return new avrn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avrn.class) {
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
