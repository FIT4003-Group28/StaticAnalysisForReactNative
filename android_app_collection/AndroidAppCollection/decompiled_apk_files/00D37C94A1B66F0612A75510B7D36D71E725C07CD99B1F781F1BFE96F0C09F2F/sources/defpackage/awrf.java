package defpackage;
/* compiled from: PG */
/* renamed from: awrf */
/* loaded from: classes2.dex */
public final class awrf extends aopi implements aoqv {
    private static final awrf a;
    private static volatile aorb b;
    private int c;
    private awrg d;
    private String e = "";

    static {
        awrf awrfVar = new awrf();
        a = awrfVar;
        aopi.registerDefaultInstance(awrf.class, awrfVar);
    }

    private awrf() {
    }

    public static awre a() {
        return (awre) a.createBuilder();
    }

    public static /* synthetic */ awrf b() {
        return a;
    }

    public void e(awrg awrgVar) {
        awrgVar.getClass();
        this.d = awrgVar;
        this.c |= 1;
    }

    public void f(String str) {
        str.getClass();
        this.c |= 2;
        this.e = str;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new awrf();
            case 4:
                return new awre();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (awrf.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
