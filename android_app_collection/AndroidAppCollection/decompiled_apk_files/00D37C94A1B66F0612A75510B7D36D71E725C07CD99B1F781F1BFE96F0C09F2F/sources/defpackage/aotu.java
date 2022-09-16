package defpackage;
/* compiled from: PG */
/* renamed from: aotu  reason: default package */
/* loaded from: classes.dex */
public final class aotu extends aopi implements aoqv {
    public static final aotu a;
    private static volatile aorb g;
    public Object c;
    public aorw e;
    public int f;
    public int b = 0;
    public String d = "";

    static {
        aotu aotuVar = new aotu();
        a = aotuVar;
        aopi.registerDefaultInstance(aotu.class, aotuVar);
    }

    private aotu() {
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
                return newMessageInfo(a, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\f\u0004<\u0000", new Object[]{"c", "b", "d", "e", "f", aotw.class});
            case 3:
                return new aotu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aotu.class) {
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
