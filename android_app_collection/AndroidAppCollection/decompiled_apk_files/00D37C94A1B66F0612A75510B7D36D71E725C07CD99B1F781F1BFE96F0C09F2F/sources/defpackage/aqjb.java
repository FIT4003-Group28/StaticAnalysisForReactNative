package defpackage;
/* compiled from: PG */
/* renamed from: aqjb  reason: default package */
/* loaded from: classes2.dex */
public final class aqjb extends aopi implements aoqv {
    public static final aqjb a;
    public static final aopg b;
    private static volatile aorb d;
    public aunb c;
    private int e;
    private byte f = 2;

    static {
        aqjb aqjbVar = new aqjb();
        a = aqjbVar;
        aopi.registerDefaultInstance(aqjb.class, aqjbVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, aqjbVar, aqjbVar, null, 166773264, aosj.MESSAGE, aqjb.class);
    }

    private aqjb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"e", "c"});
            case 3:
                return new aqjb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (aqjb.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
