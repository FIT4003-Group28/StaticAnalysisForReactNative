package defpackage;
/* compiled from: PG */
/* renamed from: auyo  reason: default package */
/* loaded from: classes2.dex */
public final class auyo extends aopi implements aoqv {
    public static final auyo a;
    private static volatile aorb f;
    public int b;
    public aunb c;
    public aunb e;
    private aoux g;
    private aunb h;
    private byte i = 2;
    public aoob d = aoob.b;

    static {
        auyo auyoVar = new auyo();
        a = auyoVar;
        aopi.registerDefaultInstance(auyo.class, auyoVar);
    }

    private auyo() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "g", "d", "e", "h"});
            case 3:
                return new auyo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (auyo.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
