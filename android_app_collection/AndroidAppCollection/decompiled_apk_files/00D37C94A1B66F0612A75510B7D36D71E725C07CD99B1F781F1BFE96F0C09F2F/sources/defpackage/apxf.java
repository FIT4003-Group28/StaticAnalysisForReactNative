package defpackage;
/* compiled from: PG */
/* renamed from: apxf  reason: default package */
/* loaded from: classes2.dex */
public final class apxf extends aopi implements aoqv {
    public static final apxf a;
    private static volatile aorb g;
    public int b;
    public int c;
    public int d;
    public int e = -1;
    public apxg f;

    static {
        apxf apxfVar = new apxf();
        a = apxfVar;
        aopi.registerDefaultInstance(apxf.class, apxfVar);
    }

    private apxf() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new apxf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apxf.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
