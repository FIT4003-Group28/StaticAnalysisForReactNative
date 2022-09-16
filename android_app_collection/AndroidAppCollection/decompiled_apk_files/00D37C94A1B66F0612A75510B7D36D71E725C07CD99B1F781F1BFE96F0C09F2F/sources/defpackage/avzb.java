package defpackage;
/* compiled from: PG */
/* renamed from: avzb  reason: default package */
/* loaded from: classes2.dex */
public final class avzb extends aopi implements aoqv {
    public static final avzb a;
    private static volatile aorb g;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    public aopu f = emptyProtobufList();

    static {
        avzb avzbVar = new avzb();
        a = avzbVar;
        aopi.registerDefaultInstance(avzb.class, avzbVar);
    }

    private avzb() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"d", "c", "b", "e", avxs.l, "f", avyy.class, avyx.class, avyz.class, avza.class});
            case 3:
                return new avzb();
            case 4:
                return new aopa((int[][]) null, (char[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avzb.class) {
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
