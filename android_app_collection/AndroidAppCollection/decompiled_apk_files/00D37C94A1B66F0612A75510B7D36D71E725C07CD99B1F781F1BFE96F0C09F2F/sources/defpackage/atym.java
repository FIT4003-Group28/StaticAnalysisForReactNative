package defpackage;
/* compiled from: PG */
/* renamed from: atym  reason: default package */
/* loaded from: classes2.dex */
public final class atym extends aopi implements aoqv {
    public static final atym a;
    public static final aopg b;
    private static volatile aorb j;
    public int c;
    public int e;
    public boolean g;
    public int i;
    public aoob d = aoob.b;
    public String f = "";
    public String h = "";

    static {
        atym atymVar = new atym();
        a = atymVar;
        aopi.registerDefaultInstance(atym.class, atymVar);
        b = aopi.newSingularGeneratedExtension(atrc.b, atymVar, atymVar, null, 230806702, aosj.MESSAGE, atym.class);
    }

    private atym() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007င\u0006", new Object[]{"c", "d", "e", attl.a(), "f", "g", "h", "i"});
            case 3:
                return new atym();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (atym.class) {
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
