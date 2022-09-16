package defpackage;
/* compiled from: PG */
/* renamed from: aqqn  reason: default package */
/* loaded from: classes2.dex */
public final class aqqn extends aopi implements aoqv {
    public static final aqqn a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public aqpe e;
    private byte g = 2;
    public String d = "";

    static {
        aqqn aqqnVar = new aqqn();
        a = aqqnVar;
        aopi.registerDefaultInstance(aqqn.class, aqqnVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, aqqnVar, aqqnVar, null, 264, aosj.MESSAGE, aqqn.class);
    }

    private aqqn() {
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0002", new Object[]{"c", "d", "e"});
            case 3:
                return new aqqn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aqqn.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
