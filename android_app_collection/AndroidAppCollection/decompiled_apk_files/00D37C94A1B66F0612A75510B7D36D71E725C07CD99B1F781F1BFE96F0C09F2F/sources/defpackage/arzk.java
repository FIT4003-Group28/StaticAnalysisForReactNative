package defpackage;
/* compiled from: PG */
/* renamed from: arzk  reason: default package */
/* loaded from: classes2.dex */
public final class arzk extends aopi implements aoqv {
    public static final arzk a;
    private static volatile aorb g;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public int f;

    static {
        arzk arzkVar = new arzk();
        a = arzkVar;
        aopi.registerDefaultInstance(arzk.class, arzkVar);
    }

    private arzk() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဋ\u0003\u0004ဋ\u0002", new Object[]{"b", "c", arpt.k, "d", "f", "e"});
            case 3:
                return new arzk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (arzk.class) {
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
