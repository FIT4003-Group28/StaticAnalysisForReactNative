package defpackage;
/* compiled from: PG */
/* renamed from: aoul  reason: default package */
/* loaded from: classes.dex */
public final class aoul extends aopi implements aoqv {
    private static final aoul a;
    private static volatile aorb b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private String h = "";

    static {
        aoul aoulVar = new aoul();
        a = aoulVar;
        aopi.registerDefaultInstance(aoul.class, aoulVar);
    }

    private aoul() {
    }

    public static aouk a() {
        return (aouk) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(aouo aouoVar) {
        this.e = aouoVar.u;
        this.c |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(aoun aounVar) {
        this.g = aounVar.n;
        this.c |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(aoup aoupVar) {
        this.f = aoupVar.e;
        this.c |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(aouq aouqVar) {
        this.d = aouqVar.ae;
        this.c |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str) {
        str.getClass();
        this.c |= 64;
        this.h = str;
    }

    public aoun c() {
        aoun b2 = aoun.b(this.g);
        return b2 == null ? aoun.UNKNOWN_COMPONENT_APPEARANCE : b2;
    }

    public aouo d() {
        aouo b2 = aouo.b(this.e);
        return b2 == null ? aouo.UNKNOWN_COMPONENT : b2;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0004ဌ\u0003\u0006ဌ\u0005\u0007ဈ\u0006", new Object[]{"c", "d", aouq.a(), "e", aouo.a(), "f", aoup.a(), "g", aoun.a(), "h"});
            case 3:
                return new aoul();
            case 4:
                return new aouk();
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aoul.class) {
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

    public aouq e() {
        aouq b2 = aouq.b(this.d);
        return b2 == null ? aouq.UNKNOWN_EVENT : b2;
    }
}
