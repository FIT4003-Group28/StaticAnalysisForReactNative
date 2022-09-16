package defpackage;
/* compiled from: PG */
/* renamed from: apfh */
/* loaded from: classes.dex */
public final class apfh extends aopi implements aoqv {
    private static final apfh a;
    private static volatile aorb b;
    private int c;
    private int d;

    static {
        apfh apfhVar = new apfh();
        a = apfhVar;
        aopi.registerDefaultInstance(apfh.class, apfhVar);
    }

    private apfh() {
    }

    public static apfg a() {
        return (apfg) a.createBuilder();
    }

    public static /* synthetic */ apfh b() {
        return a;
    }

    public void d(apfi apfiVar) {
        this.d = apfiVar.c;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "d", apfi.a()});
            case 3:
                return new apfh();
            case 4:
                return new apfg();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apfh.class) {
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
