package defpackage;
/* compiled from: PG */
/* renamed from: asyx  reason: default package */
/* loaded from: classes2.dex */
public final class asyx extends aopi implements aoqv {
    public static final asyx a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public String d = "";
    public aopu e;
    public String f;

    static {
        asyx asyxVar = new asyx();
        a = asyxVar;
        aopi.registerDefaultInstance(asyx.class, asyxVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, asyxVar, asyxVar, null, 136, aosj.MESSAGE, asyx.class);
    }

    private asyx() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001b\u0004ဈ\u0002", new Object[]{"c", "d", "e", asyw.class, "f"});
            case 3:
                return new asyx();
            case 4:
                return new aopa((byte[][][]) null, (short[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asyx.class) {
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
