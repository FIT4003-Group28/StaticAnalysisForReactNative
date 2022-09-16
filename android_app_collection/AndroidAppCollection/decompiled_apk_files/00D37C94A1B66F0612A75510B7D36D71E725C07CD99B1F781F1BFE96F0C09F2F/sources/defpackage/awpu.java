package defpackage;
/* compiled from: PG */
/* renamed from: awpu  reason: default package */
/* loaded from: classes2.dex */
public final class awpu extends aopi implements aoqv {
    public static final awpu a;
    public static final aopg b;
    private static volatile aorb d;
    private int e;
    private byte f = 2;
    public String c = "";

    static {
        awpu awpuVar = new awpu();
        a = awpuVar;
        aopi.registerDefaultInstance(awpu.class, awpuVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, awpuVar, awpuVar, null, 361707526, aosj.MESSAGE, awpu.class);
    }

    private awpu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\tဈ\u0007", new Object[]{"e", "c"});
            case 3:
                return new awpu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (awpu.class) {
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
