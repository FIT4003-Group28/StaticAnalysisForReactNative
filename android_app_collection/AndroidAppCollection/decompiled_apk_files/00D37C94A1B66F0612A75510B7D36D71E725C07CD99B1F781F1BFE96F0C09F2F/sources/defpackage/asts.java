package defpackage;
/* compiled from: PG */
/* renamed from: asts  reason: default package */
/* loaded from: classes2.dex */
public final class asts extends aopi implements aoqv {
    public static final asts a;
    private static volatile aorb g;
    public int b;
    public String c = "";
    public long d;
    public float e;
    public float f;

    static {
        asts astsVar = new asts();
        a = astsVar;
        aopi.registerDefaultInstance(asts.class, astsVar);
    }

    private asts() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case 3:
                return new asts();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asts.class) {
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
