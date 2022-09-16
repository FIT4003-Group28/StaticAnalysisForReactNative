package defpackage;
/* compiled from: PG */
/* renamed from: asju  reason: default package */
/* loaded from: classes2.dex */
public final class asju extends aopi implements aoqv {
    public static final asju a;
    private static volatile aorb i;
    public int b;
    public long c;
    public long d;
    public float e;
    public float f;
    public float g;
    public float h;

    static {
        asju asjuVar = new asju();
        a = asjuVar;
        aopi.registerDefaultInstance(asju.class, asjuVar);
    }

    private asju() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new asju();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (asju.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
