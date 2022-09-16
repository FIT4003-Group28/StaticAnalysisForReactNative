package defpackage;
/* compiled from: PG */
/* renamed from: avkk  reason: default package */
/* loaded from: classes2.dex */
public final class avkk extends aopi implements aoqv {
    public static final avkk a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public boolean d;

    static {
        avkk avkkVar = new avkk();
        a = avkkVar;
        aopi.registerDefaultInstance(avkk.class, avkkVar);
        b = aopi.newSingularGeneratedExtension(atrc.b, avkkVar, avkkVar, null, 330586086, aosj.MESSAGE, avkk.class);
    }

    private avkk() {
        aopi.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဇ\u0002", new Object[]{"c", "d"});
            case 3:
                return new avkk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avkk.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
