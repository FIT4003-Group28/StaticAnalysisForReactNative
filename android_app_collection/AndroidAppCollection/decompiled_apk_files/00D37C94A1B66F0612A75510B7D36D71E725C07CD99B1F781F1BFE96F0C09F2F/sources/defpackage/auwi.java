package defpackage;
/* compiled from: PG */
/* renamed from: auwi  reason: default package */
/* loaded from: classes2.dex */
public final class auwi extends aopi implements aoqv {
    public static final auwi a;
    private static volatile aorb e;
    public int d;
    private int f;
    private aoux g;
    private byte h = 2;
    public aopu b = emptyProtobufList();
    public aoob c = aoob.b;

    static {
        auwi auwiVar = new auwi();
        a = auwiVar;
        aopi.registerDefaultInstance(auwi.class, auwiVar);
    }

    private auwi() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ည\u0001\u0004ဌ\u0002", new Object[]{"f", "b", arag.class, "g", "c", "d", auwh.a});
            case 3:
                return new auwi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auwi.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
