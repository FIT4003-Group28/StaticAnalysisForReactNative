package defpackage;
/* compiled from: PG */
/* renamed from: avqp  reason: default package */
/* loaded from: classes2.dex */
public final class avqp extends aopi implements aoqv {
    public static final avqp a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private avqq e;
    private avqo f;
    private apzg g;
    private aoux h;
    private byte i = 2;

    static {
        avqp avqpVar = new avqp();
        a = avqpVar;
        aopi.registerDefaultInstance(avqp.class, avqpVar);
    }

    private avqp() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\f\u0005\u0000\u0000\u0005\u0001ᐉ\u0001\u0005ᐉ\u0005\tᐉ\b\nᐉ\u0000\fᐉ\n", new Object[]{"c", "e", "f", "g", "d", "h"});
            case 3:
                return new avqp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avqp.class) {
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
