package defpackage;
/* compiled from: PG */
/* renamed from: awnm  reason: default package */
/* loaded from: classes2.dex */
public final class awnm extends aopi implements aoqv {
    public static final awnm a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public aoob d = aoob.b;

    static {
        awnm awnmVar = new awnm();
        a = awnmVar;
        aopi.registerDefaultInstance(awnm.class, awnmVar);
        b = aopi.newSingularGeneratedExtension(awos.a, awnmVar, awnmVar, null, 169768054, aosj.MESSAGE, awnm.class);
    }

    private awnm() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0000", new Object[]{"c", "d"});
            case 3:
                return new awnm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awnm.class) {
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
