package defpackage;
/* compiled from: PG */
/* renamed from: asly  reason: default package */
/* loaded from: classes2.dex */
public final class asly extends aopi implements aoqv {
    public static final asly a;
    public static final aopg b;
    private static volatile aorb f;
    public aopu c = emptyProtobufList();
    public aoob d = aoob.b;
    public String e = "";
    private int g;

    static {
        asly aslyVar = new asly();
        a = aslyVar;
        aopi.registerDefaultInstance(asly.class, aslyVar);
        b = aopi.newSingularGeneratedExtension(aqtk.a, aslyVar, aslyVar, null, 273577170, aosj.MESSAGE, asly.class);
    }

    private asly() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ည\u0000\u0003ဈ\u0001", new Object[]{"g", "c", aslx.class, "d", "e"});
            case 3:
                return new asly();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (asly.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
