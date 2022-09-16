package defpackage;
/* compiled from: PG */
/* renamed from: avqb  reason: default package */
/* loaded from: classes2.dex */
public final class avqb extends aopi implements aoqv {
    public static final avqb a;
    private static volatile aorb b;
    private int c;
    private aplw d;
    private aplw e;
    private aplw f;
    private aplw g;
    private aplw h;
    private byte i = 2;

    static {
        avqb avqbVar = new avqb();
        a = avqbVar;
        aopi.registerDefaultInstance(avqb.class, avqbVar);
    }

    private avqb() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0016\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0016ᐉ\u0005", new Object[]{"c", "d", "e", "f", "g", "h"});
            case 3:
                return new avqb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avqb.class) {
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
