package defpackage;
/* compiled from: PG */
/* renamed from: avxl  reason: default package */
/* loaded from: classes2.dex */
public final class avxl extends aopi implements aoqv {
    public static final avxl a;
    private static volatile aorb e;
    public int b;
    public aopu c = emptyProtobufList();
    public float d;

    static {
        avxl avxlVar = new avxl();
        a = avxlVar;
        aopi.registerDefaultInstance(avxl.class, avxlVar);
    }

    private avxl() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ခ\u0000", new Object[]{"b", "c", avxk.class, "d"});
            case 3:
                return new avxl();
            case 4:
                return new aopa((int[]) null, (boolean[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avxl.class) {
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
