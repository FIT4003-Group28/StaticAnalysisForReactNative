package defpackage;
/* compiled from: PG */
/* renamed from: autz  reason: default package */
/* loaded from: classes2.dex */
public final class autz extends aopi implements aoqv {
    public static final autz a;
    private static volatile aorb b;
    private int c;
    private auui d;
    private auty e;
    private auty f;
    private apzg g;
    private apzg h;
    private byte i = 2;

    static {
        autz autzVar = new autz();
        a = autzVar;
        aopi.registerDefaultInstance(autz.class, autzVar);
    }

    private autz() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new autz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (autz.class) {
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
