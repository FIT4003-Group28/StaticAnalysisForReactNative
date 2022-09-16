package defpackage;
/* compiled from: PG */
/* renamed from: auup  reason: default package */
/* loaded from: classes2.dex */
public final class auup extends aopi implements aoqv {
    public static final auup a;
    private static volatile aorb e;
    public int b;
    public auuo c;
    public aopu d = emptyProtobufList();

    static {
        auup auupVar = new auup();
        a = auupVar;
        aopi.registerDefaultInstance(auup.class, auupVar);
    }

    private auup() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", auuo.class});
            case 3:
                return new auup();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auup.class) {
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
