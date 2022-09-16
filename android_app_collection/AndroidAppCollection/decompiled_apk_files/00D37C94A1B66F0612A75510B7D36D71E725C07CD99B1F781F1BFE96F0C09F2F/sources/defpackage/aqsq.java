package defpackage;
/* compiled from: PG */
/* renamed from: aqsq */
/* loaded from: classes2.dex */
public final class aqsq extends aopi implements aoqv {
    private static final aqsq a;
    private static volatile aorb b;
    private int c;
    private aqsp d;
    private aqsm e;
    private int f;
    private aopu g = emptyProtobufList();

    static {
        aqsq aqsqVar = new aqsq();
        a = aqsqVar;
        aopi.registerDefaultInstance(aqsq.class, aqsqVar);
    }

    private aqsq() {
    }

    public static aqsl a() {
        return (aqsl) a.createBuilder();
    }

    public static /* synthetic */ aqsq b() {
        return a;
    }

    public void g(aqsk aqskVar) {
        aqskVar.getClass();
        h();
        this.g.add(aqskVar);
    }

    private void h() {
        aopu aopuVar = this.g;
        if (!aopuVar.c()) {
            this.g = aopi.mutableCopy(aopuVar);
        }
    }

    public void i(aqsm aqsmVar) {
        aqsmVar.getClass();
        this.e = aqsmVar;
        this.c |= 2;
    }

    public void j(aqsp aqspVar) {
        aqspVar.getClass();
        this.d = aqspVar;
        this.c |= 1;
    }

    public void k(int i) {
        this.c |= 4;
        this.f = i;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004\u001b", new Object[]{"c", "d", "e", "f", "g", aqsk.class});
            case 3:
                return new aqsq();
            case 4:
                return new aqsl();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqsq.class) {
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
