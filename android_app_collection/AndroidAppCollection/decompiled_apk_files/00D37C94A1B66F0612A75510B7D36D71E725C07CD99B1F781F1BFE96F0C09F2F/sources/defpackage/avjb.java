package defpackage;
/* compiled from: PG */
/* renamed from: avjb  reason: default package */
/* loaded from: classes2.dex */
public final class avjb extends aopi implements aoqv {
    public static final avjb a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public argj d;
    private byte f = 2;

    static {
        avjb avjbVar = new avjb();
        a = avjbVar;
        aopi.registerDefaultInstance(avjb.class, avjbVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, avjbVar, avjbVar, null, 249145766, aosj.MESSAGE, avjb.class);
    }

    private avjb() {
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
                return new avjb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (avjb.class) {
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
