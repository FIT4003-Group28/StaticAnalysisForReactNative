package defpackage;
/* compiled from: PG */
/* renamed from: auke  reason: default package */
/* loaded from: classes2.dex */
public final class auke extends aopi implements aoqv {
    private static final auke a;
    private static volatile aorb b;
    private int c;
    private int d;
    private int e;
    private int f;

    static {
        auke aukeVar = new auke();
        a = aukeVar;
        aopi.registerDefaultInstance(auke.class, aukeVar);
    }

    private auke() {
    }

    public static aukd a() {
        return (aukd) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(aukf aukfVar) {
        this.d = aukfVar.e;
        this.c |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(aqlv aqlvVar) {
        this.e = aqlvVar.B;
        this.c |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(aukg aukgVar) {
        this.f = aukgVar.f;
        this.c |= 8;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0004ဌ\u0003", new Object[]{"c", "d", aukf.a(), "e", aqlv.a(), "f", aukg.a()});
            case 3:
                return new auke();
            case 4:
                return new aukd();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (auke.class) {
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
