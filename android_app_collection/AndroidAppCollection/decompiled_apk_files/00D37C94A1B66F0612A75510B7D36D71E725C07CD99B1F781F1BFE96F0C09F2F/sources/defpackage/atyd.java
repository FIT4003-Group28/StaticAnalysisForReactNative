package defpackage;
/* compiled from: PG */
/* renamed from: atyd  reason: default package */
/* loaded from: classes2.dex */
public final class atyd extends aopi implements aoqv {
    public static final atyd a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public awmt d;
    public awmt e;
    private awmt g;
    private byte h = 2;

    static {
        atyd atydVar = new atyd();
        a = atydVar;
        aopi.registerDefaultInstance(atyd.class, atydVar);
        b = aopi.newSingularGeneratedExtension(awow.a, atydVar, atydVar, null, 347675936, aosj.MESSAGE, atyd.class);
    }

    private atyd() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0000\u0003\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"c", "d", "e", "g"});
            case 3:
                return new atyd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (atyd.class) {
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
