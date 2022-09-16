package defpackage;
/* compiled from: PG */
/* renamed from: aqev  reason: default package */
/* loaded from: classes2.dex */
public final class aqev extends aopi implements aoqv {
    public static final aqev a;
    private static volatile aorb k;
    public int b;
    public arag c;
    public arag d;
    public avhn e;
    public arag f;
    public aunb g;
    public apzg h;
    public apzg i;
    private aoux l;
    private byte m = 2;
    public aoob j = aoob.b;

    static {
        aqev aqevVar = new aqev();
        a = aqevVar;
        aopi.registerDefaultInstance(aqev.class, aqevVar);
    }

    private aqev() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tည\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "l", "j"});
            case 3:
                return new aqev();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (aqev.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
