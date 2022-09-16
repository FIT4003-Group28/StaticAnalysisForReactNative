package defpackage;
/* compiled from: PG */
/* renamed from: ariv  reason: default package */
/* loaded from: classes2.dex */
public final class ariv extends aopi implements aoqv {
    public static final ariv a;
    private static volatile aorb e;
    public long b;
    public long c;
    public long d;
    private int f;

    static {
        ariv arivVar = new ariv();
        a = arivVar;
        aopi.registerDefaultInstance(ariv.class, arivVar);
    }

    private ariv() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0003ဃ\u0002\u0004ဃ\u0003", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new ariv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (ariv.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
