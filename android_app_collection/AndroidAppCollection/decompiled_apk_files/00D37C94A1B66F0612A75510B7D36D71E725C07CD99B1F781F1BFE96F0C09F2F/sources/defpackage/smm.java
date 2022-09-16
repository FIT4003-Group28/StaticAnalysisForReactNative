package defpackage;
/* compiled from: PG */
/* renamed from: smm  reason: default package */
/* loaded from: classes4.dex */
public final class smm extends aopi implements aoqv {
    public static final smm a;
    private static volatile aorb h;
    public int b;
    public String c = "";
    public long d;
    public int e;
    public boolean f;
    public boolean g;

    static {
        smm smmVar = new smm();
        a = smmVar;
        aopi.registerDefaultInstance(smm.class, smmVar);
    }

    private smm() {
        aoob aoobVar = aoob.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဌ\u0003\u0006ဇ\u0005\bဇ\u0007", new Object[]{"b", "c", "d", "e", sml.a, "f", "g"});
            case 3:
                return new smm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (smm.class) {
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
