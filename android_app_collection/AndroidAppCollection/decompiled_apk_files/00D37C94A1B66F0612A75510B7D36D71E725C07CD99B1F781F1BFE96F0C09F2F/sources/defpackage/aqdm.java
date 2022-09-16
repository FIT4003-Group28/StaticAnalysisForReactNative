package defpackage;
/* compiled from: PG */
/* renamed from: aqdm  reason: default package */
/* loaded from: classes2.dex */
public final class aqdm extends aopi implements aoqv {
    public static final aqdm a;
    private static volatile aorb l;
    public int b;
    public avhn c;
    public arag d;
    public int e;
    public int f;
    public apzg g;
    public aunb j;
    public boolean k;
    private aoux m;
    private byte n = 2;
    public aoob h = aoob.b;
    public aopu i = emptyProtobufList();

    static {
        aqdm aqdmVar = new aqdm();
        a = aqdmVar;
        aopi.registerDefaultInstance(aqdm.class, aqdmVar);
    }

    private aqdm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ည\u0006\bЛ\tᐉ\u0007\nဇ\b", new Object[]{"b", "c", "d", "e", "f", "g", "m", "h", "i", apzg.class, "j", "k"});
            case 3:
                return new aqdm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (aqdm.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
