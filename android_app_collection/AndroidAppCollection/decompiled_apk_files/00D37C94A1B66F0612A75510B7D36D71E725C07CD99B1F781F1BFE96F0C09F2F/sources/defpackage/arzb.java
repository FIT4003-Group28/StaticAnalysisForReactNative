package defpackage;
/* compiled from: PG */
/* renamed from: arzb  reason: default package */
/* loaded from: classes2.dex */
public final class arzb extends aopi implements aoqv {
    public static final arzb a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public aopu d = emptyProtobufList();
    public aoob e = aoob.b;
    public boolean f;

    static {
        arzb arzbVar = new arzb();
        a = arzbVar;
        aopi.registerDefaultInstance(arzb.class, arzbVar);
    }

    private arzb() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ည\u0001\u0004ဇ\u0002", new Object[]{"b", "c", "d", arza.class, "e", "f"});
            case 3:
                return new arzb();
            case 4:
                return new aopa((boolean[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arzb.class) {
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
