package defpackage;
/* compiled from: PG */
/* renamed from: aqoz  reason: default package */
/* loaded from: classes2.dex */
public final class aqoz extends aopi implements aoqv {
    public static final aqoz a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public int e;
    private byte g = 2;
    public String d = "";

    static {
        aqoz aqozVar = new aqoz();
        a = aqozVar;
        aopi.registerDefaultInstance(aqoz.class, aqozVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, aqozVar, aqozVar, null, 384293593, aosj.MESSAGE, aqoz.class);
    }

    private aqoz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"c", "d", "e", aqov.c});
            case 3:
                return new aqoz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqoz.class) {
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
