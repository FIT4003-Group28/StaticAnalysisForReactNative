package defpackage;
/* compiled from: PG */
/* renamed from: aqcw  reason: default package */
/* loaded from: classes2.dex */
public final class aqcw extends aopi implements aoqv {
    public static final aqcw a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        aqcw aqcwVar = new aqcw();
        a = aqcwVar;
        aopi.registerDefaultInstance(aqcw.class, aqcwVar);
    }

    private aqcw() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", aqcv.class});
            case 3:
                return new aqcw();
            case 4:
                return new aopa((short[]) null, (float[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aqcw.class) {
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
