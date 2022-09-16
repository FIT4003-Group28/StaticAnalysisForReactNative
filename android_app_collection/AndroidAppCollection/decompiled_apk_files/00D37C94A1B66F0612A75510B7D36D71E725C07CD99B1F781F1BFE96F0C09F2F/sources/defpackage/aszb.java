package defpackage;
/* compiled from: PG */
/* renamed from: aszb  reason: default package */
/* loaded from: classes2.dex */
public final class aszb extends aopi implements aoqv {
    public static final aszb a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public String d = "";
    public String e;
    public long f;

    static {
        aszb aszbVar = new aszb();
        a = aszbVar;
        aopi.registerDefaultInstance(aszb.class, aszbVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, aszbVar, aszbVar, null, 262, aosj.MESSAGE, aszb.class);
    }

    private aszb() {
        aoob aoobVar = aoob.b;
        this.e = "";
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဃ\u0003", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new aszb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aszb.class) {
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
