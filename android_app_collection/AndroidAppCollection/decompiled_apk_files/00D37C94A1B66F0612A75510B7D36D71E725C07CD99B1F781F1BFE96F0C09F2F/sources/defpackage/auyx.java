package defpackage;
/* compiled from: PG */
/* renamed from: auyx  reason: default package */
/* loaded from: classes2.dex */
public final class auyx extends aopi implements aoqv {
    public static final auyx a;
    private static volatile aorb i;
    public int b;
    public avhn c;
    public apzg d;
    public auyy e;
    public arag f;
    private aoux j;
    private byte k = 2;
    public aopu g = emptyProtobufList();
    public aoob h = aoob.b;

    static {
        auyx auyxVar = new auyx();
        a = auyxVar;
        aopi.registerDefaultInstance(auyx.class, auyxVar);
    }

    private auyx() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ည\u0005\u0007Л", new Object[]{"b", "c", "d", "e", "f", "j", "h", "g", avhc.class});
            case 3:
                return new auyx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (auyx.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
