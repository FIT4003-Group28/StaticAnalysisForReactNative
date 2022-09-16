package defpackage;
/* compiled from: PG */
/* renamed from: atju  reason: default package */
/* loaded from: classes2.dex */
public final class atju extends aopi implements aoqv {
    public static final atju a;
    private static volatile aorb b;
    private int c;
    private aoux d;
    private aunb e;
    private arag f;
    private arag g;
    private aunb h;
    private apzg i;
    private aunb j;
    private byte k = 2;

    static {
        atju atjuVar = new atju();
        a = atjuVar;
        aopi.registerDefaultInstance(atju.class, atjuVar);
    }

    private atju() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0006\u0012\u0007\u0000\u0000\u0007\u0006ᐉ\u0001\u000bᐉ\u0002\fᐉ\u0003\rᐉ\u0004\u0010ᐉ\u0005\u0011ᐉ\u0006\u0012ᐉ\u0007", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new atju();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atju.class) {
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
