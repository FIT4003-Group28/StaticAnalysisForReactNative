package defpackage;
/* compiled from: PG */
/* renamed from: aunu */
/* loaded from: classes2.dex */
public final class aunu extends aopi implements aoqv {
    private static final aunu a;
    private static volatile aorb b;
    private int c;
    private long d;
    private String e = "";
    private boolean f;

    static {
        aunu aunuVar = new aunu();
        a = aunuVar;
        aopi.registerDefaultInstance(aunu.class, aunuVar);
    }

    private aunu() {
    }

    public static aunt a() {
        return (aunt) a.createBuilder();
    }

    public static /* synthetic */ aunu b() {
        return a;
    }

    public void f(boolean z) {
        this.c |= 4;
        this.f = z;
    }

    public void g(long j) {
        this.c |= 1;
        this.d = j;
    }

    public void h(String str) {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new aunu();
            case 4:
                return new aunt();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aunu.class) {
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
