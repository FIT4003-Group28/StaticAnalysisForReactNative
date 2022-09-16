package defpackage;
/* compiled from: PG */
/* renamed from: asoj  reason: default package */
/* loaded from: classes2.dex */
public final class asoj extends aopi implements aoqv {
    public static final asoj a;
    public static final aopg b;
    private static volatile aorb h;
    public int c;
    public aqvm d;
    public apzg e;
    public apzg g;
    private byte i = 2;
    public String f = "";

    static {
        asoj asojVar = new asoj();
        a = asojVar;
        aopi.registerDefaultInstance(asoj.class, asojVar);
        b = aopi.newSingularGeneratedExtension(auna.a, asojVar, asojVar, null, 267256503, aosj.MESSAGE, asoj.class);
    }

    private asoj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new asoj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (asoj.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
