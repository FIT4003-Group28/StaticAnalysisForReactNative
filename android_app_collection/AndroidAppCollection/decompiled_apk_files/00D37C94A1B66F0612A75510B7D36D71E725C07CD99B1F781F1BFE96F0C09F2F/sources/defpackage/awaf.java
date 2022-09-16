package defpackage;
/* compiled from: PG */
/* renamed from: awaf  reason: default package */
/* loaded from: classes2.dex */
public final class awaf extends aopi implements aoqv {
    public static final awaf a;
    private static volatile aorb b;
    private int c;
    private avwr d;
    private atep e;
    private byte f = 2;

    static {
        awaf awafVar = new awaf();
        a = awafVar;
        aopi.registerDefaultInstance(awaf.class, awafVar);
    }

    private awaf() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ueaaaᾮ\uf6ae\u2fd9\u0002\u0000\u0000\u0002\ueaaaᾮᐉ\u0001\uf6ae\u2fd9ᐉ\u0000", new Object[]{"c", "e", "d"});
            case 3:
                return new awaf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awaf.class) {
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
