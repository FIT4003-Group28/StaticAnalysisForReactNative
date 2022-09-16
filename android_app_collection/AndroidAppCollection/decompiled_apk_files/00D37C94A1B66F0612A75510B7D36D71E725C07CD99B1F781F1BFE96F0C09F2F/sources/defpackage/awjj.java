package defpackage;
/* compiled from: PG */
/* renamed from: awjj  reason: default package */
/* loaded from: classes2.dex */
public final class awjj extends aopi implements aoqv {
    public static final awjj a;
    public static final aopg b;
    private static volatile aorb h;
    public int c;
    public String e;
    public String f;
    public avhn g;
    private byte i = 2;
    public String d = "";

    static {
        awjj awjjVar = new awjj();
        a = awjjVar;
        aopi.registerDefaultInstance(awjj.class, awjjVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, awjjVar, awjjVar, null, 152, aosj.MESSAGE, awjj.class);
    }

    private awjj() {
        aoob aoobVar = aoob.b;
        this.e = "";
        this.f = "";
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new awjj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (awjj.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
