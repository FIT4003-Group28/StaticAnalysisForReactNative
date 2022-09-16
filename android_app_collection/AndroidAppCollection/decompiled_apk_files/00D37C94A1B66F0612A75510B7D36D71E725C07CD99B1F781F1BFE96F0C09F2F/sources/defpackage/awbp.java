package defpackage;
/* compiled from: PG */
/* renamed from: awbp  reason: default package */
/* loaded from: classes2.dex */
public final class awbp extends aopd implements aope {
    public static final awbp a;
    private static volatile aorb e;
    public int b;
    public int d;
    private byte f = 2;
    public String c = "";

    static {
        awbp awbpVar = new awbp();
        a = awbpVar;
        aopi.registerDefaultInstance(awbp.class, awbpVar);
    }

    private awbp() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new awbp();
            case 4:
                return new aopc(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awbp.class) {
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
