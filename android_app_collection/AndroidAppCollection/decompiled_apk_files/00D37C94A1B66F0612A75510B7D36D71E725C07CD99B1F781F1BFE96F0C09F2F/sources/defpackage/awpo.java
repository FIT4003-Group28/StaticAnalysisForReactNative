package defpackage;
/* compiled from: PG */
/* renamed from: awpo  reason: default package */
/* loaded from: classes2.dex */
public final class awpo extends aopi implements aoqv {
    public static final awpo a;
    private static volatile aorb b;
    private int c;
    private awpb d;
    private awpa e;
    private awpw f;
    private awmt g;
    private byte h = 2;

    static {
        awpo awpoVar = new awpo();
        a = awpoVar;
        aopi.registerDefaultInstance(awpo.class, awpoVar);
    }

    private awpo() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0011\u0019\u0004\u0000\u0000\u0004\u0011ᐉ\u0010\u0015ᐉ\u0014\u0016ᐉ\u0015\u0019ᐉ\u0016", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new awpo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awpo.class) {
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
