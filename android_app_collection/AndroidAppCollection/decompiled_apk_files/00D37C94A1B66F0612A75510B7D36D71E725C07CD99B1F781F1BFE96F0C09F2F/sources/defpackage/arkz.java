package defpackage;
/* compiled from: PG */
/* renamed from: arkz  reason: default package */
/* loaded from: classes2.dex */
public final class arkz extends aopi implements aoqv {
    public static final arkz a;
    private static volatile aorb g;
    public int b;
    public apzg d;
    public arkw e;
    public aopu f;
    private arpa h;
    private aoux i;
    private asbz j;
    private arlt k;
    private asgt l;
    private byte m = 2;
    public aoob c = aoob.b;

    static {
        arkz arkzVar = new arkz();
        a = arkzVar;
        aopi.registerDefaultInstance(arkz.class, arkzVar);
    }

    private arkz() {
        emptyProtobufList();
        emptyProtobufList();
        this.f = aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u0014\t\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ည\u0002\rᐉ\n\u000eᐉ\u000b\u000fᐉ\f\u0010ᐉ\u0007\u0012ᐉ\u000f\u0014\u001a", new Object[]{"b", "h", "i", "c", "j", "k", "l", "d", "e", "f"});
            case 3:
                return new arkz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arkz.class) {
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
