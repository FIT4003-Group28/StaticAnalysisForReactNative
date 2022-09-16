package defpackage;
/* compiled from: PG */
/* renamed from: awpb  reason: default package */
/* loaded from: classes2.dex */
public final class awpb extends aopi implements aoqv {
    public static final awpb a;
    private static volatile aorb b;
    private int c;
    private awmt d;
    private awmt e;
    private byte f = 2;

    static {
        awpb awpbVar = new awpb();
        a = awpbVar;
        aopi.registerDefaultInstance(awpb.class, awpbVar);
    }

    private awpb() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0000\u0002\u0002ᐉ\u0001\u0005ᐉ\u0004", new Object[]{"c", "d", "e"});
            case 3:
                return new awpb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awpb.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
