package defpackage;
/* compiled from: PG */
/* renamed from: atyf */
/* loaded from: classes2.dex */
public final class atyf extends aopi implements aoqv {
    private static final atyf a;
    private static volatile aorb b;
    private int c;
    private String d = "";
    private aoob e = aoob.b;

    static {
        atyf atyfVar = new atyf();
        a = atyfVar;
        aopi.registerDefaultInstance(atyf.class, atyfVar);
    }

    private atyf() {
    }

    public static atye a() {
        return (atye) a.createBuilder();
    }

    public static /* synthetic */ atyf b() {
        return a;
    }

    public void e(String str) {
        this.c |= 1;
        this.d = str;
    }

    public void f(aoob aoobVar) {
        aoobVar.getClass();
        this.c |= 2;
        this.e = aoobVar;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new atyf();
            case 4:
                return new atye();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atyf.class) {
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
