package defpackage;
/* compiled from: PG */
/* renamed from: aurd  reason: default package */
/* loaded from: classes2.dex */
public final class aurd extends aopi implements aoqv {
    public static final aurd a;
    private static volatile aorb f;
    public int b;
    public arag c;
    private aoux g;
    private byte h = 2;
    public aopu d = emptyProtobufList();
    public aoob e = aoob.b;

    static {
        aurd aurdVar = new aurd();
        a = aurdVar;
        aopi.registerDefaultInstance(aurd.class, aurdVar);
    }

    private aurd() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0003\u0001ᐉ\u0000\u0002Л\u0005ᐉ\u0002\u0006ည\u0003", new Object[]{"b", "c", "d", auri.class, "g", "e"});
            case 3:
                return new aurd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aurd.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
