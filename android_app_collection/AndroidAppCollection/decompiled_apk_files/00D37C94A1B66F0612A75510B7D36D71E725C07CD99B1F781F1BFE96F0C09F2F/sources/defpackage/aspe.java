package defpackage;
/* compiled from: PG */
/* renamed from: aspe  reason: default package */
/* loaded from: classes2.dex */
public final class aspe extends aopi implements aoqv {
    public static final aspe a;
    private static volatile aorb h;
    public int b;
    public arag c;
    public apzg d;
    public arag e;
    public apzg f;
    private aoux i;
    private byte j = 2;
    public aoob g = aoob.b;

    static {
        aspe aspeVar = new aspe();
        a = aspeVar;
        aopi.registerDefaultInstance(aspe.class, aspeVar);
    }

    private aspe() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ည\u0005\u0007ᐉ\u0001", new Object[]{"b", "c", "e", "f", "i", "g", "d"});
            case 3:
                return new aspe();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aspe.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
