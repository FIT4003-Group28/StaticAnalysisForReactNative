package defpackage;
/* compiled from: PG */
/* renamed from: aszi  reason: default package */
/* loaded from: classes2.dex */
public final class aszi extends aopi implements aoqv {
    public static final aszi a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private apok f;
    private apok g;
    private aunb h;
    private aunb i;
    private arag j;
    private aoux k;
    private byte l = 2;

    static {
        aszi asziVar = new aszi();
        a = asziVar;
        aopi.registerDefaultInstance(aszi.class, asziVar);
    }

    private aszi() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0000\b\u0001ᐉ\u0000\u0006ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\nᐉ\u000b\rᐉ\b\u000eᐉ\t\u000fᐉ\n", new Object[]{"c", "d", "e", "f", "g", "k", "h", "i", "j"});
            case 3:
                return new aszi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aszi.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
