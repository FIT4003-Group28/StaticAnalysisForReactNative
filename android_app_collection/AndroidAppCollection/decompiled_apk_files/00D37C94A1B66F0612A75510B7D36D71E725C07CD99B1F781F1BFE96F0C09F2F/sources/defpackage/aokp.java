package defpackage;
/* compiled from: PG */
/* renamed from: aokp  reason: default package */
/* loaded from: classes.dex */
public final class aokp extends aopi implements aoqv {
    public static final aokp a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public aopu d = aopi.emptyProtobufList();
    public aopu e;
    public aomk f;

    static {
        aokp aokpVar = new aokp();
        a = aokpVar;
        aopi.registerDefaultInstance(aokp.class, aokpVar);
    }

    private aokp() {
        emptyProtobufList();
        this.e = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0004\u001b\u0005ဉ\u0001", new Object[]{"b", "c", "d", "e", aokf.class, "f"});
            case 3:
                return new aokp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aokp.class) {
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
