package defpackage;
/* compiled from: PG */
/* renamed from: aqrw  reason: default package */
/* loaded from: classes2.dex */
public final class aqrw extends aopi implements aoqv {
    public static final aqrw a;
    private static volatile aorb i;
    public int b;
    public int c;
    public int d;
    public float e;
    public int f;
    public int g;
    public boolean h;
    private int j;

    static {
        aqrw aqrwVar = new aqrw();
        a = aqrwVar;
        aopi.registerDefaultInstance(aqrw.class, aqrwVar);
    }

    private aqrw() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aqrw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqrw.class) {
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
