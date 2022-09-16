package defpackage;
/* compiled from: PG */
/* renamed from: awnp  reason: default package */
/* loaded from: classes2.dex */
public final class awnp extends aopi implements aoqv {
    public static final awnp a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public int d;
    private int f;

    static {
        awnp awnpVar = new awnp();
        a = awnpVar;
        aopi.registerDefaultInstance(awnp.class, awnpVar);
        b = aopi.newSingularGeneratedExtension(awmy.a, awnpVar, awnpVar, null, 212323971, aosj.MESSAGE, awnp.class);
    }

    private awnp() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"f", "c", "d"});
            case 3:
                return new awnp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awnp.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
