package defpackage;
/* compiled from: PG */
/* renamed from: afks  reason: default package */
/* loaded from: classes.dex */
public final class afks extends aopi implements aoqv {
    public static final afks a;
    private static volatile aorb h;
    public long f;
    public aopp b = emptyFloatList();
    public aopp c = emptyFloatList();
    public aopp d = emptyFloatList();
    public aopp e = emptyFloatList();
    public String g = "";

    static {
        afks afksVar = new afks();
        a = afksVar;
        aopi.registerDefaultInstance(afks.class, afksVar);
    }

    private afks() {
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
                return newMessageInfo(a, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0004\u0000\u0001$\u0002$\u0003$\u0004Ȉ\u0005$\u0006\u0002", new Object[]{"b", "c", "d", "g", "e", "f"});
            case 3:
                return new afks();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (afks.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
