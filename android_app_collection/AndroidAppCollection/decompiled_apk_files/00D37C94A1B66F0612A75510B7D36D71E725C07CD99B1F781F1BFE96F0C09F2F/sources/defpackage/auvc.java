package defpackage;
/* compiled from: PG */
/* renamed from: auvc  reason: default package */
/* loaded from: classes2.dex */
public final class auvc extends aopi implements aoqv {
    public static final auvc a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public awnn d;
    private byte f = 2;

    static {
        auvc auvcVar = new auvc();
        a = auvcVar;
        aopi.registerDefaultInstance(auvc.class, auvcVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, auvcVar, auvcVar, null, 234871417, aosj.MESSAGE, auvc.class);
    }

    private auvc() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new auvc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (auvc.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
