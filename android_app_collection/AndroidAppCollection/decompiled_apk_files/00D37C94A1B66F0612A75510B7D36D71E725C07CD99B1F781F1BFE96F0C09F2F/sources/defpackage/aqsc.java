package defpackage;
/* compiled from: PG */
/* renamed from: aqsc  reason: default package */
/* loaded from: classes2.dex */
public final class aqsc extends aopi implements aoqv {
    public static final aqsc a;
    private static volatile aorb h;
    public int b;
    public aqsd c;
    public aqse e;
    public aqrx g;
    public int d = 1;
    public aopu f = emptyProtobufList();

    static {
        aqsc aqscVar = new aqsc();
        a = aqscVar;
        aopi.registerDefaultInstance(aqsc.class, aqscVar);
    }

    private aqsc() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0004ဉ\u0003\u0005\u001b\u0006ဉ\u0004", new Object[]{"b", "c", "d", aqov.h, "e", "f", aqsb.class, "g"});
            case 3:
                return new aqsc();
            case 4:
                return new aopa((char[][]) null, (short[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqsc.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
