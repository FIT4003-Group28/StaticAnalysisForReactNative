package defpackage;
/* compiled from: PG */
/* renamed from: apcl */
/* loaded from: classes.dex */
public final class apcl extends aopi implements aoqv {
    private static final apcl a;
    private static volatile aorb b;
    private int c;
    private int d;
    private apcg e;
    private int g;
    private aoob f = aoob.b;
    private aoob h = aoob.b;

    static {
        apcl apclVar = new apcl();
        a = apclVar;
        aopi.registerDefaultInstance(apcl.class, apclVar);
    }

    private apcl() {
    }

    public static apck a() {
        return (apck) a.createBuilder();
    }

    public static /* synthetic */ apcl b() {
        return a;
    }

    public void g(apcg apcgVar) {
        apcgVar.getClass();
        this.e = apcgVar;
        this.c |= 2;
    }

    public void h(int i) {
        this.c |= 8;
        this.g = i;
    }

    public void i(apbz apbzVar) {
        this.d = apbzVar.Q;
        this.c |= 1;
    }

    public void j(aoob aoobVar) {
        aoobVar.getClass();
        this.c |= 4;
        this.f = aoobVar;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"c", "d", apbz.a(), "e", "f", "g"});
            case 3:
                return new apcl();
            case 4:
                return new apck();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apcl.class) {
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
