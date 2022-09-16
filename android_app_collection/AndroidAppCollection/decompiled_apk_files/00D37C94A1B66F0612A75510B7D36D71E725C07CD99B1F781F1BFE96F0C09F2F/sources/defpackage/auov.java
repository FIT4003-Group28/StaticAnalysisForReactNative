package defpackage;
/* compiled from: PG */
/* renamed from: auov  reason: default package */
/* loaded from: classes2.dex */
public final class auov extends aopi implements aoqv {
    public static final auov a;
    private static volatile aorb h;
    public int b;
    public auow c;
    public auou d;
    public arag e;
    public arag f;
    private apzg i;
    private aoux j;
    private byte k = 2;
    public aoob g = aoob.b;

    static {
        auov auovVar = new auov();
        a = auovVar;
        aopi.registerDefaultInstance(auov.class, auovVar);
    }

    private auov() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006\bည\u0007", new Object[]{"b", "i", "c", "d", "e", "f", "j", "g"});
            case 3:
                return new auov();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (auov.class) {
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
