package defpackage;
/* compiled from: PG */
/* renamed from: avzc  reason: default package */
/* loaded from: classes2.dex */
public final class avzc extends aopi implements aoqv {
    public static final avzc a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        avzc avzcVar = new avzc();
        a = avzcVar;
        aopi.registerDefaultInstance(avzc.class, avzcVar);
    }

    private avzc() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", avzb.class});
            case 3:
                return new avzc();
            case 4:
                return new aopa((int[][][]) null, (boolean[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (avzc.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
