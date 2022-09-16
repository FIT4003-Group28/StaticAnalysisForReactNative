package defpackage;
/* compiled from: PG */
/* renamed from: awqr  reason: default package */
/* loaded from: classes2.dex */
public final class awqr extends aopi implements aoqv {
    public static final awqr a;
    private static volatile aorb e;
    public int b;
    public awql d;
    private byte f = 2;
    public aopu c = emptyProtobufList();

    static {
        awqr awqrVar = new awqr();
        a = awqrVar;
        aopi.registerDefaultInstance(awqr.class, awqrVar);
    }

    private awqr() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"b", "c", awqq.class, "d"});
            case 3:
                return new awqr();
            case 4:
                return new aopa((char[][][]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (awqr.class) {
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
