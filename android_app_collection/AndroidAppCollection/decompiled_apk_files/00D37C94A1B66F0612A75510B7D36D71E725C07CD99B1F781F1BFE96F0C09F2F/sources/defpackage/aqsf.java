package defpackage;
/* compiled from: PG */
/* renamed from: aqsf  reason: default package */
/* loaded from: classes2.dex */
public final class aqsf extends aopi implements aoqv {
    public static final aqsf a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        aqsf aqsfVar = new aqsf();
        a = aqsfVar;
        aopi.registerDefaultInstance(aqsf.class, aqsfVar);
    }

    private aqsf() {
    }

    public final void a() {
        aopu aopuVar = this.b;
        if (!aopuVar.c()) {
            this.b = aopi.mutableCopy(aopuVar);
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", aqsc.class});
            case 3:
                return new aqsf();
            case 4:
                return new aopa((char[][][]) null, (char[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (aqsf.class) {
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
