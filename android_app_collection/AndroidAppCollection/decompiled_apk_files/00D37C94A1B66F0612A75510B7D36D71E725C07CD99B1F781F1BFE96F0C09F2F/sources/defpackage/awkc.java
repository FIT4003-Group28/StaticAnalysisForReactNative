package defpackage;
/* compiled from: PG */
/* renamed from: awkc  reason: default package */
/* loaded from: classes2.dex */
public final class awkc extends aopi implements aoqv {
    public static final awkc a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public String d = "";
    public aopu e;
    public String f;

    static {
        awkc awkcVar = new awkc();
        a = awkcVar;
        aopi.registerDefaultInstance(awkc.class, awkcVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, awkcVar, awkcVar, null, 164, aosj.MESSAGE, awkc.class);
    }

    private awkc() {
        aoob aoobVar = aoob.b;
        this.e = emptyProtobufList();
        this.f = "";
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001b\u0004ဈ\u0002", new Object[]{"c", "d", "e", awkb.class, "f"});
            case 3:
                return new awkc();
            case 4:
                return new aopa((int[][][]) null, (boolean[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (awkc.class) {
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
