package defpackage;
/* compiled from: PG */
/* renamed from: auxy  reason: default package */
/* loaded from: classes2.dex */
public final class auxy extends aopi implements aoqv {
    public static final auxy a;
    private static volatile aorb j;
    public int b;
    public aunb c;
    public arag d;
    public arag e;
    public apok f;
    private aunb k;
    private aoux l;
    private byte m = 2;
    public aopu g = emptyProtobufList();
    public aopu h = emptyProtobufList();
    public aoob i = aoob.b;

    static {
        auxy auxyVar = new auxy();
        a = auxyVar;
        aopi.registerDefaultInstance(auxy.class, auxyVar);
    }

    private auxy() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ည\u0006\u0007ᐉ\u0003\bЛ\tЛ", new Object[]{"b", "c", "d", "e", "f", "l", "i", "k", "g", apzg.class, "h", apzg.class});
            case 3:
                return new auxy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (auxy.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
