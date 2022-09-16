package defpackage;
/* compiled from: PG */
/* renamed from: auns  reason: default package */
/* loaded from: classes2.dex */
public final class auns extends aopi implements aoqv {
    public static final auns a;
    public static final aopg b;
    private static volatile aorb e;
    public aopu c = emptyProtobufList();
    public String d = "";
    private int f;

    static {
        auns aunsVar = new auns();
        a = aunsVar;
        aopi.registerDefaultInstance(auns.class, aunsVar);
        b = aopi.newSingularGeneratedExtension(aqtk.a, aunsVar, aunsVar, null, 328964737, aosj.MESSAGE, auns.class);
    }

    private auns() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"f", "c", aunr.class, "d"});
            case 3:
                return new auns();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auns.class) {
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
