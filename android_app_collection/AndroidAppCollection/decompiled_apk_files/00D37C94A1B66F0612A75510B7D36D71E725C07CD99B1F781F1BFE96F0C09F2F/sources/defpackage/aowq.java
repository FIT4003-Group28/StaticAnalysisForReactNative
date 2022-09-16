package defpackage;
/* compiled from: PG */
/* renamed from: aowq */
/* loaded from: classes.dex */
public final class aowq extends aopi implements aoqv {
    private static final aowq a;
    private static volatile aorb b;
    private int c;
    private int d;
    private int e;
    private int f;

    static {
        aowq aowqVar = new aowq();
        a = aowqVar;
        aopi.registerDefaultInstance(aowq.class, aowqVar);
    }

    private aowq() {
    }

    public static aowp a() {
        return (aowp) a.createBuilder();
    }

    public static /* synthetic */ aowq b() {
        return a;
    }

    public void f(aowm aowmVar) {
        this.e = aowmVar.d;
        this.c |= 2;
    }

    public void g(aown aownVar) {
        this.f = aownVar.d;
        this.c |= 4;
    }

    public void h(aowo aowoVar) {
        this.d = aowoVar.c;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"c", "d", aowo.a(), "e", aowm.a(), "f", aown.a()});
            case 3:
                return new aowq();
            case 4:
                return new aowp();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aowq.class) {
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
