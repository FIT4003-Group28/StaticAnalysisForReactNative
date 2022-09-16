package defpackage;
/* compiled from: PG */
/* renamed from: avny  reason: default package */
/* loaded from: classes2.dex */
public final class avny extends aopi implements aoqv {
    public static final avny a;
    private static volatile aorb k;
    public int b;
    public Object d;
    public arag e;
    public apok g;
    public apok h;
    public int i;
    private aoux l;
    public int c = 0;
    private byte m = 2;
    public aopu f = emptyProtobufList();
    public aoob j = aoob.b;

    static {
        avny avnyVar = new avny();
        a = avnyVar;
        aopi.registerDefaultInstance(avny.class, avnyVar);
    }

    private avny() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0001\u0005\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ျ\u0000\u0006ᐉ\u0006\u0007ည\u0007\bဿ\u0000\tဌ\u0005", new Object[]{"d", "c", "b", "e", "f", arag.class, "g", "h", "l", "j", avgg.a(), "i", avgg.a()});
            case 3:
                return new avny();
            case 4:
                return new aopa((short[][][]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (avny.class) {
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
