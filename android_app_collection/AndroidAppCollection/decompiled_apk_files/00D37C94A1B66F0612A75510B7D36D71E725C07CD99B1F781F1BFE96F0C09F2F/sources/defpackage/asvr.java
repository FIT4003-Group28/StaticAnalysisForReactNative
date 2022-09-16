package defpackage;
/* compiled from: PG */
/* renamed from: asvr  reason: default package */
/* loaded from: classes2.dex */
public final class asvr extends aopi implements aoqv {
    public static final asvr a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public int d;
    private aoux g;
    private byte h = 2;
    public aoob e = aoob.b;

    static {
        asvr asvrVar = new asvr();
        a = asvrVar;
        aopi.registerDefaultInstance(asvr.class, asvrVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, asvrVar, asvrVar, null, 241780379, aosj.MESSAGE, asvr.class);
    }

    private asvr() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ည\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", aqov.j, "e", "g"});
            case 3:
                return new asvr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (asvr.class) {
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
