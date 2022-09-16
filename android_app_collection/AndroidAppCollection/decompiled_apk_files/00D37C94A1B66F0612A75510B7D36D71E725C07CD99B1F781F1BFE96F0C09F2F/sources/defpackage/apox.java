package defpackage;
/* compiled from: PG */
/* renamed from: apox  reason: default package */
/* loaded from: classes2.dex */
public final class apox extends aopi implements aoqv {
    public static final apox a;
    private static volatile aorb g;
    public int b;
    public Object d;
    public long f;
    public int c = 0;
    public aoob e = aoob.b;

    static {
        apox apoxVar = new apox();
        a = apoxVar;
        aopi.registerDefaultInstance(apox.class, apoxVar);
    }

    private apox() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဃ\u0001\u0003ျ\u0000\u0004ြ\u0000\u0005ျ\u0000", new Object[]{"d", "c", "b", "e", "f", assu.class});
            case 3:
                return new apox();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apox.class) {
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
