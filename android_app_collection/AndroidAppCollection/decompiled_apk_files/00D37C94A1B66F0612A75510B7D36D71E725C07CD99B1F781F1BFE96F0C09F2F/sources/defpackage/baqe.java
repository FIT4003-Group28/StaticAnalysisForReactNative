package defpackage;
/* compiled from: PG */
/* renamed from: baqe  reason: default package */
/* loaded from: classes2.dex */
public final class baqe extends aopi implements aoqv {
    public static final baqe a;
    private static volatile aorb g;
    public aoqp b = aoqp.a;
    public aoqp c = aoqp.a;
    public aopu d = emptyProtobufList();
    public aopq e = emptyIntList();
    public aopu f = emptyProtobufList();

    static {
        baqe baqeVar = new baqe();
        a = baqeVar;
        aopi.registerDefaultInstance(baqe.class, baqeVar);
    }

    private baqe() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0000\u0001\u0005\u0005\u0002\u0003\u0000\u00012\u00022\u0003\u001b\u0004'\u0005\u001b", new Object[]{"b", baqc.a, "c", baqd.a, "d", baqb.class, "e", "f", bapy.class});
            case 3:
                return new baqe();
            case 4:
                return new aopa((boolean[][]) null, (char[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (baqe.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
