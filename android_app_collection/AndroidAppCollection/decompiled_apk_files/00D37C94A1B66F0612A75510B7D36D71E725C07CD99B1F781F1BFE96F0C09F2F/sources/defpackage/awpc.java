package defpackage;
/* compiled from: PG */
/* renamed from: awpc  reason: default package */
/* loaded from: classes2.dex */
public final class awpc extends aopi implements aoqv {
    public static final awpc a;
    private static volatile aorb b;
    private int c;
    private awmt d;
    private awmt e;
    private awmt f;
    private aoux g;
    private byte h = 2;

    static {
        awpc awpcVar = new awpc();
        a = awpcVar;
        aopi.registerDefaultInstance(awpc.class, awpcVar);
    }

    private awpc() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0004\u001a\u0004\u0000\u0000\u0004\u0004ᐉ\u0002\u0006ᐉ\u0014\fᐉ\u0003\u001aᐉ\u0004", new Object[]{"c", "d", "g", "e", "f"});
            case 3:
                return new awpc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awpc.class) {
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
