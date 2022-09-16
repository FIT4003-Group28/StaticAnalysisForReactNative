package defpackage;
/* compiled from: PG */
/* renamed from: arec  reason: default package */
/* loaded from: classes2.dex */
public final class arec extends aopi implements aoqv {
    public static final arec a;
    private static volatile aorb e;
    public float b;
    public float c;
    public float d;
    private int f;

    static {
        arec arecVar = new arec();
        a = arecVar;
        aopi.registerDefaultInstance(arec.class, arecVar);
    }

    private arec() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"f", "b", "c", "d"});
            case 3:
                return new arec();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (arec.class) {
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
