package defpackage;
/* compiled from: PG */
/* renamed from: avxf  reason: default package */
/* loaded from: classes2.dex */
public final class avxf extends aopi implements aoqv {
    public static final avxf a;
    private static volatile aorb f;
    public int b;
    public avxi c;
    public avxg d;
    public boolean e;

    static {
        avxf avxfVar = new avxf();
        a = avxfVar;
        aopi.registerDefaultInstance(avxf.class, avxfVar);
    }

    private avxf() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
            case 3:
                return new avxf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (avxf.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
