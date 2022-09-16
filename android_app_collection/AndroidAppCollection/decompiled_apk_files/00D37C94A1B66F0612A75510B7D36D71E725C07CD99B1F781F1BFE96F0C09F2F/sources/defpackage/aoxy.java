package defpackage;
/* compiled from: PG */
/* renamed from: aoxy  reason: default package */
/* loaded from: classes.dex */
public final class aoxy extends aopi implements aoqv {
    public static final aoxy a;
    public static final aopg b;
    private static volatile aorb g;
    public awmt c;
    public awmt d;
    public apah e;
    private int h;
    private byte i = 2;
    public String f = "";

    static {
        aoxy aoxyVar = new aoxy();
        a = aoxyVar;
        aopi.registerDefaultInstance(aoxy.class, aoxyVar);
        b = aopi.newSingularGeneratedExtension(awow.a, aoxyVar, aoxyVar, null, 201264127, aosj.MESSAGE, aoxy.class);
    }

    private aoxy() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"h", "c", "d", "e", "f"});
            case 3:
                return new aoxy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aoxy.class) {
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
