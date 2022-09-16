package defpackage;
/* compiled from: PG */
/* renamed from: asyr  reason: default package */
/* loaded from: classes2.dex */
public final class asyr extends aopi implements aoqv {
    public static final asyr a;
    public static final aopg b;
    private static volatile aorb j;
    public int c;
    public String d = "";
    public String e;
    public aopu f;
    public String g;
    public awku h;
    public aoob i;

    static {
        asyr asyrVar = new asyr();
        a = asyrVar;
        aopi.registerDefaultInstance(asyr.class, asyrVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, asyrVar, asyrVar, null, 137, aosj.MESSAGE, asyr.class);
    }

    private asyr() {
        aoob aoobVar = aoob.b;
        this.e = "";
        this.f = emptyProtobufList();
        this.g = "";
        this.i = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004\u001b\u0005ဈ\u0003\u0006ဉ\u0004\u0007ည\u0005", new Object[]{"c", "d", "e", "f", aqnl.class, "g", "h", "i"});
            case 3:
                return new asyr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (asyr.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
