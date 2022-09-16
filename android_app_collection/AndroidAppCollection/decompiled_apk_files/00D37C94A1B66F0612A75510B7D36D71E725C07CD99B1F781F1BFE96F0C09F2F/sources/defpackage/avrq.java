package defpackage;
/* compiled from: PG */
/* renamed from: avrq  reason: default package */
/* loaded from: classes2.dex */
public final class avrq extends aopi implements aoqv {
    public static final avrq a;
    private static volatile aorb b;
    private int c;
    private avru d;
    private atnl e;
    private avru f;
    private atnl g;
    private atnl h;
    private atnl i;
    private aoux j;
    private byte k = 2;

    static {
        avrq avrqVar = new avrq();
        a = avrqVar;
        aopi.registerDefaultInstance(avrq.class, avrqVar);
    }

    private avrq() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0002\n\u0007\u0000\u0000\u0007\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\tᐉ\b\nᐉ\u0005", new Object[]{"c", "d", "e", "f", "g", "i", "j", "h"});
            case 3:
                return new avrq();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avrq.class) {
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
