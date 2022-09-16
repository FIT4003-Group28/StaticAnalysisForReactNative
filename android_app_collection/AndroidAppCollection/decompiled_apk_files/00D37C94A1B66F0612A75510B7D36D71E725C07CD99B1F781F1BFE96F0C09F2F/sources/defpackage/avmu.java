package defpackage;
/* compiled from: PG */
/* renamed from: avmu  reason: default package */
/* loaded from: classes2.dex */
public final class avmu extends aopi implements aoqv {
    public static final avmu a;
    private static volatile aorb b;
    private int c;
    private apok d;
    private arag e;
    private arag f;
    private aoux g;
    private avmv h;
    private byte i = 2;

    static {
        avmu avmuVar = new avmu();
        a = avmuVar;
        aopi.registerDefaultInstance(avmu.class, avmuVar);
    }

    private avmu() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\u000e\u0005\u0000\u0000\u0005\u0003ᐉ\u0006\u0005ᐉ\u0002\tᐉ\u0004\nᐉ\u0005\u000eᐉ\n", new Object[]{"c", "g", "d", "e", "f", "h"});
            case 3:
                return new avmu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avmu.class) {
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
