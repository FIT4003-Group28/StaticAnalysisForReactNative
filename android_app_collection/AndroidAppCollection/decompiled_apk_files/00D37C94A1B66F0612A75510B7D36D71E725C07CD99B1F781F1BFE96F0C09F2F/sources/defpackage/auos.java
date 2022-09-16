package defpackage;
/* compiled from: PG */
/* renamed from: auos */
/* loaded from: classes2.dex */
public final class auos extends aopi implements aoqv {
    private static final auos a;
    private static volatile aorb b;
    private int c;
    private boolean d;
    private boolean e;
    private String f = "";

    static {
        auos auosVar = new auos();
        a = auosVar;
        aopi.registerDefaultInstance(auos.class, auosVar);
    }

    private auos() {
    }

    public static auor a() {
        return (auor) a.createBuilder();
    }

    public static /* synthetic */ auos b() {
        return a;
    }

    public void f(String str) {
        this.c |= 4;
        this.f = str;
    }

    public void g(boolean z) {
        this.c |= 1;
        this.d = true;
    }

    public void h(boolean z) {
        this.c |= 2;
        this.e = z;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new auos();
            case 4:
                return new auor();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (auos.class) {
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
