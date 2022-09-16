package defpackage;
/* compiled from: PG */
/* renamed from: avga  reason: default package */
/* loaded from: classes2.dex */
public final class avga extends aopi implements aoqv {
    public static final avga a;
    public static final aopg b;
    private static volatile aorb i;
    public int c;
    public Object e;
    public long g;
    public int d = 0;
    public String f = "";
    public aopu h = aopi.emptyProtobufList();

    static {
        avga avgaVar = new avga();
        a = avgaVar;
        aopi.registerDefaultInstance(avga.class, avgaVar);
        b = aopi.newSingularGeneratedExtension(aqtk.a, avgaVar, avgaVar, null, 196886555, aosj.MESSAGE, avga.class);
    }

    private avga() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ွ\u0000\u0003်\u0000\u0004ဂ\u0003\u0005\u001a", new Object[]{"e", "d", "c", "f", "g", "h"});
            case 3:
                return new avga();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (avga.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
