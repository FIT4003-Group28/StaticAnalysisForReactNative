package defpackage;
/* compiled from: PG */
/* renamed from: atok */
/* loaded from: classes2.dex */
public final class atok extends aopi implements aoqv {
    private static final atok a;
    private static volatile aorb b;
    private int c;
    private aton d;
    private int e;

    static {
        atok atokVar = new atok();
        a = atokVar;
        aopi.registerDefaultInstance(atok.class, atokVar);
    }

    private atok() {
    }

    public static atoj a() {
        return (atoj) a.createBuilder();
    }

    public static /* synthetic */ atok b() {
        return a;
    }

    public void e(atom atomVar) {
        this.e = atomVar.r;
        this.c |= 4;
    }

    public void f(aton atonVar) {
        this.d = atonVar;
        this.c |= 1;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဌ\u0002", new Object[]{"c", "d", "e", atom.a()});
            case 3:
                return new atok();
            case 4:
                return new atoj();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atok.class) {
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
