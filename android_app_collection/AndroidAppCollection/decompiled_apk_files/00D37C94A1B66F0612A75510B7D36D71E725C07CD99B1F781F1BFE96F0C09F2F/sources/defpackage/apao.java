package defpackage;
/* compiled from: PG */
/* renamed from: apao  reason: default package */
/* loaded from: classes.dex */
public final class apao extends aopi implements aoqv {
    public static final apao a;
    public static final aopg b;
    private static volatile aorb f;
    public int c;
    public String d = "";
    public boolean e;

    static {
        apao apaoVar = new apao();
        a = apaoVar;
        aopi.registerDefaultInstance(apao.class, apaoVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, apaoVar, apaoVar, null, 167, aosj.MESSAGE, apao.class);
    }

    private apao() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"c", "d", "e"});
            case 3:
                return new apao();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (apao.class) {
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
