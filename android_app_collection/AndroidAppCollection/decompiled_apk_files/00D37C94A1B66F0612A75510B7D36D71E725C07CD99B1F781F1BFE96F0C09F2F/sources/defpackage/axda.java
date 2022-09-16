package defpackage;
/* compiled from: PG */
/* renamed from: axda  reason: default package */
/* loaded from: classes2.dex */
public final class axda extends aopi implements aoqv {
    public static final axda a;
    private static volatile aorb i;
    public int b;
    public Object d;
    public axcz f;
    public aqsv g;
    public int c = 0;
    public String e = "";
    public String h = "";

    static {
        axda axdaVar = new axda();
        a = axdaVar;
        aopi.registerDefaultInstance(axda.class, axdaVar);
    }

    private axda() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ြ\u0000\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"d", "c", "b", "e", "f", avxf.class, "g", "h"});
            case 3:
                return new axda();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (axda.class) {
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
