package defpackage;
/* compiled from: PG */
/* renamed from: aprl  reason: default package */
/* loaded from: classes2.dex */
public final class aprl extends aopi implements aoqv {
    public static final aprl a;
    public static final aopg b;
    private static volatile aorb m;
    public int c;
    public boolean e;
    public int g;
    public boolean j;
    public boolean k;
    public boolean l;
    public String d = "";
    public String f = "";
    public String h = "";
    public String i = "";

    static {
        aprl aprlVar = new aprl();
        a = aprlVar;
        aopi.registerDefaultInstance(aprl.class, aprlVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, aprlVar, aprlVar, null, 218, aosj.MESSAGE, aprl.class);
    }

    private aprl() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b", new Object[]{"c", "d", "e", "f", "g", atxd.a(), "h", "i", "j", "k", "l"});
            case 3:
                return new aprl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (aprl.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
