package defpackage;
/* compiled from: PG */
/* renamed from: auap  reason: default package */
/* loaded from: classes2.dex */
public final class auap extends aopi implements aoqv {
    public static final auap a;
    private static volatile aorb e;
    public apzg b;
    public int c;
    private int f;
    private aoux g;
    private byte h = 2;
    public aoob d = aoob.b;

    static {
        auap auapVar = new auap();
        a = auapVar;
        aopi.registerDefaultInstance(auap.class, auapVar);
    }

    private auap() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002င\u0001\u0003ည\u0002\u0004ᐉ\u0003", new Object[]{"f", "b", "c", "d", "g"});
            case 3:
                return new auap();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auap.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
