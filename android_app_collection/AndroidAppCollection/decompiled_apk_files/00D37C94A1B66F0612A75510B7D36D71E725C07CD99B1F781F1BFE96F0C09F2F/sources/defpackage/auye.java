package defpackage;
/* compiled from: PG */
/* renamed from: auye  reason: default package */
/* loaded from: classes2.dex */
public final class auye extends aopi implements aoqv {
    public static final auye a;
    private static volatile aorb g;
    public aunb b;
    public aunb c;
    public aunb d;
    private int h;
    private apzg i;
    private aoux j;
    private byte k = 2;
    public aopu e = emptyProtobufList();
    public aoob f = aoob.b;

    static {
        auye auyeVar = new auye();
        a = auyeVar;
        aopi.registerDefaultInstance(auye.class, auyeVar);
    }

    private auye() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0004\u0006ည\u0005\u0007ᐉ\u0003", new Object[]{"h", "b", "c", "d", "e", aunb.class, "j", "f", "i"});
            case 3:
                return new auye();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (auye.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
