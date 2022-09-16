package defpackage;
/* compiled from: PG */
/* renamed from: atfv  reason: default package */
/* loaded from: classes2.dex */
public final class atfv extends aopi implements aoqv {
    public static final atfv a;
    public static final aopg b;
    private static volatile aorb e;
    public Object d;
    public int c = 0;
    private byte f = 2;

    static {
        atfv atfvVar = new atfv();
        a = atfvVar;
        aopi.registerDefaultInstance(atfv.class, atfvVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, atfvVar, atfvVar, null, 247401431, aosj.MESSAGE, atfv.class);
    }

    private atfv() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐼ\u0000", new Object[]{"d", "c", arxl.class});
            case 3:
                return new atfv();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (atfv.class) {
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
