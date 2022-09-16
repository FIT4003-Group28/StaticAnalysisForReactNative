package defpackage;
/* compiled from: PG */
/* renamed from: asvp  reason: default package */
/* loaded from: classes2.dex */
public final class asvp extends aopi implements aoqv {
    public static final asvp a;
    public static final aopg b;
    private static volatile aorb d;
    public arrh c;
    private int e;
    private byte f = 2;

    static {
        asvp asvpVar = new asvp();
        a = asvpVar;
        aopi.registerDefaultInstance(asvp.class, asvpVar);
        b = aopi.newSingularGeneratedExtension(awnr.a, asvpVar, asvpVar, null, 356511053, aosj.MESSAGE, asvp.class);
    }

    private asvp() {
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
                return new asvp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (asvp.class) {
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
