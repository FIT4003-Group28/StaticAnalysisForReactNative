package defpackage;
/* compiled from: PG */
/* renamed from: awoe  reason: default package */
/* loaded from: classes2.dex */
public final class awoe extends aopd implements aope {
    public static final awoe a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public awod e;
    private byte g = 2;
    public String d = "";

    static {
        awoe awoeVar = new awoe();
        a = awoeVar;
        aopi.registerDefaultInstance(awoe.class, awoeVar);
        b = aopi.newSingularGeneratedExtension(awok.a, awoeVar, awoeVar, null, 255496645, aosj.MESSAGE, awoe.class);
    }

    private awoe() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"c", "d", "e"});
            case 3:
                return new awoe();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (awoe.class) {
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
