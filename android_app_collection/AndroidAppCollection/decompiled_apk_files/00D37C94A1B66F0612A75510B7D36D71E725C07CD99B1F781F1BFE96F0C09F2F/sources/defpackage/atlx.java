package defpackage;
/* compiled from: PG */
/* renamed from: atlx  reason: default package */
/* loaded from: classes2.dex */
public final class atlx extends aopi implements aoqv {
    public static final atlx a;
    private static volatile aorb b;
    private int c;
    private aunb d;
    private aunb e;
    private aunb f;
    private aoux g;
    private byte h = 2;

    static {
        atlx atlxVar = new atlx();
        a = atlxVar;
        aopi.registerDefaultInstance(atlx.class, atlxVar);
    }

    private atlx() {
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
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u000b\u0004\u0000\u0000\u0004\u0002ᐉ\u0001\u0006ᐉ\u0006\bᐉ\u0004\u000bᐉ\u0002", new Object[]{"c", "d", "g", "f", "e"});
            case 3:
                return new atlx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atlx.class) {
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
