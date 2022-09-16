package defpackage;
/* compiled from: PG */
/* renamed from: asqv  reason: default package */
/* loaded from: classes2.dex */
public final class asqv extends aopi implements aoqv {
    public static final asqv a;
    private static volatile aorb c;
    public aunb b;
    private int d;
    private apok e;
    private byte f = 2;

    static {
        asqv asqvVar = new asqv();
        a = asqvVar;
        aopi.registerDefaultInstance(asqv.class, asqvVar);
    }

    private asqv() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"d", "e", "b"});
            case 3:
                return new asqv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (asqv.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
