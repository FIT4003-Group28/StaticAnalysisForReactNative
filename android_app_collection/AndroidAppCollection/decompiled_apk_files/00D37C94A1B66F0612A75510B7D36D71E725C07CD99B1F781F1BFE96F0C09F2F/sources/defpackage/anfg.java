package defpackage;
/* compiled from: PG */
/* renamed from: anfg  reason: default package */
/* loaded from: classes.dex */
public final class anfg extends aopi implements aoqv {
    public static final anfg a;
    public static final aopg b;
    private static volatile aorb c;

    static {
        anfg anfgVar = new anfg();
        a = anfgVar;
        aopi.registerDefaultInstance(anfg.class, anfgVar);
        b = aopi.newSingularGeneratedExtension(anfi.a, anfgVar, anfgVar, null, 571, aosj.MESSAGE, anfg.class);
    }

    private anfg() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new anfg();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (anfg.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
