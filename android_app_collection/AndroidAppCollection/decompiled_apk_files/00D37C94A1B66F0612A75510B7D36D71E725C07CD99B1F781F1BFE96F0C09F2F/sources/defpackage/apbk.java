package defpackage;
/* compiled from: PG */
/* renamed from: apbk  reason: default package */
/* loaded from: classes.dex */
public final class apbk extends aopi implements aoqv {
    public static final apbk a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public String d = "";
    public String e = "";

    static {
        apbk apbkVar = new apbk();
        a = apbkVar;
        aopi.registerDefaultInstance(apbk.class, apbkVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, apbkVar, apbkVar, null, 370527389, aosj.MESSAGE, apbk.class);
    }

    private apbk() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new apbk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apbk.class) {
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
