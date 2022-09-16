package defpackage;
/* compiled from: PG */
/* renamed from: awot  reason: default package */
/* loaded from: classes2.dex */
public final class awot extends aopd implements aope {
    public static final awot a;
    public static final aopg b;
    private static volatile aorb e;
    public awou d;
    private int f;
    private byte g = 2;
    public String c = "";

    static {
        awot awotVar = new awot();
        a = awotVar;
        aopi.registerDefaultInstance(awot.class, awotVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awotVar, awotVar, null, 194114827, aosj.MESSAGE, awot.class);
    }

    private awot() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001", new Object[]{"f", "c", "d"});
            case 3:
                return new awot();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awot.class) {
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
