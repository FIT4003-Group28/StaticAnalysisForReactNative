package defpackage;
/* compiled from: PG */
/* renamed from: atef  reason: default package */
/* loaded from: classes2.dex */
public final class atef extends aopi implements aoqv {
    public static final atef a;
    private static volatile aorb d;
    public int b;
    private arag e;
    private apzg f;
    private aoux g;
    private byte h = 2;
    public aoob c = aoob.b;

    static {
        atef atefVar = new atef();
        a = atefVar;
        aopi.registerDefaultInstance(atef.class, atefVar);
    }

    private atef() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0003\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003\u0005ᐉ\u0004", new Object[]{"b", "e", "f", "c", "g"});
            case 3:
                return new atef();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (atef.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
