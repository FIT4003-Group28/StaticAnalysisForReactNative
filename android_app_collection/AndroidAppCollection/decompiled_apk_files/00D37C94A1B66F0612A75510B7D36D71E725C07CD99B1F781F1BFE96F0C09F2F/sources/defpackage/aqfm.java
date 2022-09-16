package defpackage;
/* compiled from: PG */
/* renamed from: aqfm  reason: default package */
/* loaded from: classes2.dex */
public final class aqfm extends aopi implements aoqv {
    public static final aqfm a;
    public static final aopg b;
    private static volatile aorb h;
    public int c;
    public String d = "";
    public String e = "";
    public int f;
    public boolean g;

    static {
        aqfm aqfmVar = new aqfm();
        a = aqfmVar;
        aopi.registerDefaultInstance(aqfm.class, aqfmVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, aqfmVar, aqfmVar, null, 279698363, aosj.MESSAGE, aqfm.class);
    }

    private aqfm() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new aqfm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqfm.class) {
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
