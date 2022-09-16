package defpackage;
/* compiled from: PG */
/* renamed from: aune  reason: default package */
/* loaded from: classes2.dex */
public final class aune extends aopi implements aoqv {
    public static final aune a;
    private static volatile aorb i;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public long f;
    public boolean g;
    public long h;

    static {
        aune auneVar = new aune();
        a = auneVar;
        aopi.registerDefaultInstance(aune.class, auneVar);
    }

    private aune() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0003ဇ\u0002\u0004င\u0003\u0006ဂ\u0005\u0007ဇ\u0006\bဂ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aune();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aune.class) {
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
