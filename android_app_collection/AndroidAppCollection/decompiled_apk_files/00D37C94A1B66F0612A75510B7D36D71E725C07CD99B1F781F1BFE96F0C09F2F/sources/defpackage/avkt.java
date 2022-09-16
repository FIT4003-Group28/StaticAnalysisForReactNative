package defpackage;
/* compiled from: PG */
/* renamed from: avkt  reason: default package */
/* loaded from: classes2.dex */
public final class avkt extends aopi implements aoqv {
    public static final avkt a;
    private static volatile aorb i;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    private int j;

    static {
        avkt avktVar = new avkt();
        a = avktVar;
        aopi.registerDefaultInstance(avkt.class, avktVar);
    }

    private avkt() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ဇ\u0006", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new avkt();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (avkt.class) {
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
