package defpackage;
/* compiled from: PG */
/* renamed from: awaw  reason: default package */
/* loaded from: classes2.dex */
public final class awaw extends aopi implements aoqv {
    public static final awaw a;
    private static volatile aorb b;
    private int c;
    private avzw d;
    private byte e = 2;

    static {
        awaw awawVar = new awaw();
        a = awawVar;
        aopi.registerDefaultInstance(awaw.class, awawVar);
    }

    private awaw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\uf87cᢰ\uf87cᢰ\u0001\u0000\u0000\u0001\uf87cᢰᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new awaw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awaw.class) {
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
