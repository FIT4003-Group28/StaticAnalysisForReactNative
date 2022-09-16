package defpackage;
/* compiled from: PG */
/* renamed from: aqlk  reason: default package */
/* loaded from: classes2.dex */
public final class aqlk extends aopi implements aoqv {
    public static final aqlk a;
    private static volatile aorb i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        aqlk aqlkVar = new aqlk();
        a = aqlkVar;
        aopi.registerDefaultInstance(aqlk.class, aqlkVar);
    }

    private aqlk() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0006င\u0005\u0007င\u0006", new Object[]{"b", "c", aqfh.k, "d", "e", "f", "g", "h"});
            case 3:
                return new aqlk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (aqlk.class) {
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
