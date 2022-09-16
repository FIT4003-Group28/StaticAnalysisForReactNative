package defpackage;
/* compiled from: PG */
/* renamed from: apae  reason: default package */
/* loaded from: classes.dex */
public final class apae extends aopi implements aoqv {
    public static final apae a;
    private static volatile aorb g;
    public int b;
    public int d;
    public boolean f;
    public String c = "";
    public aopu e = emptyProtobufList();

    static {
        apae apaeVar = new apae();
        a = apaeVar;
        aopi.registerDefaultInstance(apae.class, apaeVar);
    }

    private apae() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001b\u0004ဇ\u0002", new Object[]{"b", "c", "d", "e", aswf.class, "f"});
            case 3:
                return new apae();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apae.class) {
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
