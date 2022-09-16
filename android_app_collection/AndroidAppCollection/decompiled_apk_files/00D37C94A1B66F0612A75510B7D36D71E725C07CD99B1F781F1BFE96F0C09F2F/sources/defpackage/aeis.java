package defpackage;
/* compiled from: PG */
/* renamed from: aeis  reason: default package */
/* loaded from: classes.dex */
public final class aeis extends aopi implements aoqv {
    public static final aeis a;
    private static volatile aorb f;
    public int b;
    public int c;
    public int d;
    public aopu e = emptyProtobufList();

    static {
        aeis aeisVar = new aeis();
        a = aeisVar;
        aopi.registerDefaultInstance(aeis.class, aeisVar);
    }

    private aeis() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဍ\u0000\u0002ဍ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", aein.class});
            case 3:
                return new aeis();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aeis.class) {
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
