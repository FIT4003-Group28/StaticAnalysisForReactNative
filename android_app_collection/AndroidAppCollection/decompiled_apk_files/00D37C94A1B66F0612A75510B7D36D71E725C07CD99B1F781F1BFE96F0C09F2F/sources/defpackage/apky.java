package defpackage;
/* compiled from: PG */
/* renamed from: apky  reason: default package */
/* loaded from: classes.dex */
public final class apky extends aopi implements aoqv {
    public static final apky a;
    private static volatile aorb i;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public int h;

    static {
        apky apkyVar = new apky();
        a = apkyVar;
        aopi.registerDefaultInstance(apky.class, apkyVar);
    }

    private apky() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0002\u0003င\u0003\u0004င\u0004\u0005ဌ\u0001\u0006င\u0005", new Object[]{"b", "c", apiv.i, "e", "f", "g", "d", apiv.j, "h"});
            case 3:
                return new apky();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (apky.class) {
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
