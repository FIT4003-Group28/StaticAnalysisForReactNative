package defpackage;
/* compiled from: PG */
/* renamed from: avvc  reason: default package */
/* loaded from: classes2.dex */
public final class avvc extends aopi implements aoqv {
    public static final avvc a;
    public static final aopg b;
    private static volatile aorb j;
    public int c;
    public String d = "";
    public float e;
    public int f;
    public int g;
    public int h;
    public long i;

    static {
        avvc avvcVar = new avvc();
        a = avvcVar;
        aopi.registerDefaultInstance(avvc.class, avvcVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, avvcVar, avvcVar, null, 201, aosj.MESSAGE, avvc.class);
    }

    private avvc() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0003ခ\u0001\u0004င\u0002\u0005င\u0003\u0006ဂ\u0005\u0007င\u0004", new Object[]{"c", "d", "e", "f", "g", "i", "h"});
            case 3:
                return new avvc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (avvc.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
