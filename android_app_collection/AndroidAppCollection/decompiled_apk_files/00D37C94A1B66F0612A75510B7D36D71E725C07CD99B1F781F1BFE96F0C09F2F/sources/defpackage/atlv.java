package defpackage;
/* compiled from: PG */
/* renamed from: atlv  reason: default package */
/* loaded from: classes2.dex */
public final class atlv extends aopi implements aoqv {
    public static final atlv a;
    private static volatile aorb b;
    private int c;
    private aoux d;
    private byte e = 2;

    static {
        atlv atlvVar = new atlv();
        a = atlvVar;
        aopi.registerDefaultInstance(atlv.class, atlvVar);
    }

    private atlv() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"c", "d"});
            case 3:
                return new atlv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atlv.class) {
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
