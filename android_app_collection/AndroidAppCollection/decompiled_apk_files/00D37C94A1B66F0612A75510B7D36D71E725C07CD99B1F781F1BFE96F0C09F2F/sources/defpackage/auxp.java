package defpackage;
/* compiled from: PG */
/* renamed from: auxp  reason: default package */
/* loaded from: classes2.dex */
public final class auxp extends aopi implements aoqv {
    public static final auxp a;
    private static volatile aorb f;
    public int b;
    public arag c;
    public aunb d;
    private arag g;
    private aoux h;
    private apzg i;
    private aunb j;
    private byte k = 2;
    public aoob e = aoob.b;

    static {
        auxp auxpVar = new auxp();
        a = auxpVar;
        aopi.registerDefaultInstance(auxp.class, auxpVar);
    }

    private auxp() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "g", "d", "h", "e", "i", "j"});
            case 3:
                return new auxp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (auxp.class) {
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
