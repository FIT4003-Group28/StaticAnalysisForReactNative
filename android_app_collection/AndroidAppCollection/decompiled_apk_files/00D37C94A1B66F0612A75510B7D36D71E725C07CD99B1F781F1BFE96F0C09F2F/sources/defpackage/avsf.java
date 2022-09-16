package defpackage;
/* compiled from: PG */
/* renamed from: avsf  reason: default package */
/* loaded from: classes2.dex */
public final class avsf extends aopi implements aoqv {
    public static final avsf a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private apok h;
    private apok i;
    private apzg j;
    private aoux k;
    private byte l = 2;

    static {
        avsf avsfVar = new avsf();
        a = avsfVar;
        aopi.registerDefaultInstance(avsf.class, avsfVar);
    }

    private avsf() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000f\b\u0000\u0000\b\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\u0007\bᐉ\u000b\u000bᐉ\u0003\u000fᐉ\t", new Object[]{"c", "d", "f", "g", "h", "i", "k", "e", "j"});
            case 3:
                return new avsf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avsf.class) {
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
