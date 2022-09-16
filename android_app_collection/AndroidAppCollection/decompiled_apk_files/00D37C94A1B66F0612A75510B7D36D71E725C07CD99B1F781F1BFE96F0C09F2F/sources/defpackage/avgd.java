package defpackage;
/* compiled from: PG */
/* renamed from: avgd  reason: default package */
/* loaded from: classes2.dex */
public final class avgd extends aopi implements aoqv {
    public static final avgd a;
    public static final aopg b;
    private static volatile aorb g;
    public boolean c;
    public aopu d = aopi.emptyProtobufList();
    public aopu e = emptyProtobufList();
    public aopu f = aopi.emptyProtobufList();
    private int h;

    static {
        avgd avgdVar = new avgd();
        a = avgdVar;
        aopi.registerDefaultInstance(avgd.class, avgdVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, avgdVar, avgdVar, null, 368511790, aosj.MESSAGE, avgd.class);
    }

    private avgd() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0003\u0000\u0001ဇ\u0000\u0002\u001a\u0004\u001a\u0005\u001b", new Object[]{"h", "c", "d", "f", "e", aooo.class});
            case 3:
                return new avgd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (avgd.class) {
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
