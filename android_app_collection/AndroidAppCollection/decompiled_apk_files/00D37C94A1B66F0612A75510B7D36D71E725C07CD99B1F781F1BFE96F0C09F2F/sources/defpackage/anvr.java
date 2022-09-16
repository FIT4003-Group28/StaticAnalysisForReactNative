package defpackage;
/* compiled from: PG */
/* renamed from: anvr */
/* loaded from: classes.dex */
public final class anvr extends aopi implements aoqv {
    private static final anvr a;
    private static volatile aorb b;
    private int c;
    private int d;
    private int e;

    static {
        anvr anvrVar = new anvr();
        a = anvrVar;
        aopi.registerDefaultInstance(anvr.class, anvrVar);
    }

    private anvr() {
    }

    public static anvq a() {
        return (anvq) a.createBuilder();
    }

    public static /* synthetic */ anvr b() {
        return a;
    }

    public void e(int i) {
        this.c |= 1;
        this.d = i;
    }

    public void f(anvp anvpVar) {
        this.e = anvpVar.g;
        this.c |= 2;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဌ\u0001", new Object[]{"c", "d", "e", anvp.b()});
            case 3:
                return new anvr();
            case 4:
                return new anvq();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (anvr.class) {
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
