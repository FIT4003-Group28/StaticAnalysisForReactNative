package defpackage;
/* compiled from: PG */
/* renamed from: awne  reason: default package */
/* loaded from: classes2.dex */
public final class awne extends aopi implements aoqv {
    public static final awne a;
    public static final aopg b;
    private static volatile aorb d;
    public aoqp c = aoqp.a;

    static {
        awne awneVar = new awne();
        a = awneVar;
        aopi.registerDefaultInstance(awne.class, awneVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, awneVar, awneVar, null, 188495463, aosj.MESSAGE, awne.class);
    }

    private awne() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", awnd.a});
            case 3:
                return new awne();
            case 4:
                return new aopa((char[]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awne.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
