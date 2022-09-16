package defpackage;
/* compiled from: PG */
/* renamed from: atoz  reason: default package */
/* loaded from: classes2.dex */
public final class atoz extends aopi implements aoqv {
    public static final atoz a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public String d = "";
    public int e;

    static {
        atoz atozVar = new atoz();
        a = atozVar;
        aopi.registerDefaultInstance(atoz.class, atozVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, atozVar, atozVar, null, 142, aosj.MESSAGE, atoz.class);
    }

    private atoz() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"c", "d", "e", atpa.a()});
            case 3:
                return new atoz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (atoz.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
