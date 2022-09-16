package defpackage;
/* compiled from: PG */
/* renamed from: aqln  reason: default package */
/* loaded from: classes2.dex */
public final class aqln extends aopi implements aoqv {
    public static final aqln a;
    public static final aopg b;
    private static volatile aorb e;
    private int f;
    private byte g = 2;
    public String c = "";
    public aopu d = emptyProtobufList();

    static {
        aqln aqlnVar = new aqln();
        a = aqlnVar;
        aopi.registerDefaultInstance(aqln.class, aqlnVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, aqlnVar, aqlnVar, null, 89668214, aosj.MESSAGE, aqln.class);
    }

    private aqln() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"f", "c", "d", apzg.class});
            case 3:
                return new aqln();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqln.class) {
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
