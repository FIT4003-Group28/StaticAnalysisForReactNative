package defpackage;
/* compiled from: PG */
/* renamed from: aqfj  reason: default package */
/* loaded from: classes2.dex */
public final class aqfj extends aopi implements aoqv {
    public static final aqfj a;
    public static final aopg b;
    private static volatile aorb h;
    public int c;
    public long d;
    public String e = "";
    public boolean f;
    public boolean g;

    static {
        aqfj aqfjVar = new aqfj();
        a = aqfjVar;
        aopi.registerDefaultInstance(aqfj.class, aqfjVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, aqfjVar, aqfjVar, null, 343298030, aosj.MESSAGE, aqfj.class);
    }

    private aqfj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new aqfj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqfj.class) {
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
