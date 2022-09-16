package defpackage;
/* compiled from: PG */
/* renamed from: aqmf  reason: default package */
/* loaded from: classes2.dex */
public final class aqmf extends aopi implements aoqv {
    private static final aqmf a;
    private static volatile aorb b;
    private int c;
    private aqme d;
    private aqma e;
    private aqlz f;
    private aqmc g;
    private aqmb h;
    private aqmd i;

    static {
        aqmf aqmfVar = new aqmf();
        a = aqmfVar;
        aopi.registerDefaultInstance(aqmf.class, aqmfVar);
    }

    private aqmf() {
    }

    public static aqly a() {
        return (aqly) a.createBuilder();
    }

    public static aqmf f(aoob aoobVar, aoos aoosVar) {
        return (aqmf) aopi.parseFrom(a, aoobVar, aoosVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(aqma aqmaVar) {
        aqmaVar.getClass();
        this.e = aqmaVar;
        this.c |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(aqlz aqlzVar) {
        aqlzVar.getClass();
        this.f = aqlzVar;
        this.c |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(aqmb aqmbVar) {
        aqmbVar.getClass();
        this.h = aqmbVar;
        this.c |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(aqmc aqmcVar) {
        aqmcVar.getClass();
        this.g = aqmcVar;
        this.c |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(aqmd aqmdVar) {
        aqmdVar.getClass();
        this.i = aqmdVar;
        this.c |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(aqme aqmeVar) {
        aqmeVar.getClass();
        this.d = aqmeVar;
        this.c |= 1;
    }

    public aqlz b() {
        aqlz aqlzVar = this.f;
        return aqlzVar == null ? aqlz.a : aqlzVar;
    }

    public aqma c() {
        aqma aqmaVar = this.e;
        return aqmaVar == null ? aqma.a : aqmaVar;
    }

    public aqme d() {
        aqme aqmeVar = this.d;
        return aqmeVar == null ? aqme.a : aqmeVar;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aqmf();
            case 4:
                return new aqly();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqmf.class) {
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
