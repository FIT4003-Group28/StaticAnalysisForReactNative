package defpackage;
/* compiled from: PG */
/* renamed from: awjw  reason: default package */
/* loaded from: classes2.dex */
public final class awjw extends aopi implements aoqv {
    public static final awjw a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public String d = "";
    public String e;
    public String f;

    static {
        awjw awjwVar = new awjw();
        a = awjwVar;
        aopi.registerDefaultInstance(awjw.class, awjwVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, awjwVar, awjwVar, null, 158, aosj.MESSAGE, awjw.class);
    }

    private awjw() {
        aoob aoobVar = aoob.b;
        this.e = "";
        this.f = "";
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new awjw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (awjw.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
