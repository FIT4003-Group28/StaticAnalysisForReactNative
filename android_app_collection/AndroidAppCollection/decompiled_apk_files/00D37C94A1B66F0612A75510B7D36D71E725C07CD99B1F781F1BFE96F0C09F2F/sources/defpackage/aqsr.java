package defpackage;
/* compiled from: PG */
/* renamed from: aqsr */
/* loaded from: classes2.dex */
public final class aqsr extends aopi implements aoqv {
    private static final aqsr a;
    private static volatile aorb b;
    private aopu c = emptyProtobufList();

    static {
        aqsr aqsrVar = new aqsr();
        a = aqsrVar;
        aopi.registerDefaultInstance(aqsr.class, aqsrVar);
    }

    private aqsr() {
    }

    public static aqsj a() {
        return (aqsj) a.createBuilder();
    }

    public static /* synthetic */ aqsr b() {
        return a;
    }

    public void d(aqsq aqsqVar) {
        aqsqVar.getClass();
        e();
        this.c.add(aqsqVar);
    }

    private void e() {
        aopu aopuVar = this.c;
        if (!aopuVar.c()) {
            this.c = aopi.mutableCopy(aopuVar);
        }
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"c", aqsq.class});
            case 3:
                return new aqsr();
            case 4:
                return new aqsj();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqsr.class) {
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
