package defpackage;
/* compiled from: PG */
/* renamed from: apez  reason: default package */
/* loaded from: classes.dex */
public final class apez extends aopi implements aoqv {
    public static final apez a;
    private static volatile aorb g;
    public int b;
    public int c;
    public boolean d;
    public aopu e = emptyProtobufList();
    public boolean f;
    private int h;

    static {
        apez apezVar = new apez();
        a = apezVar;
        aopi.registerDefaultInstance(apez.class, apezVar);
    }

    private apez() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004\u001b\u0005ဇ\u0003", new Object[]{"h", "b", "c", apfa.a, "d", "e", atvp.class, "f"});
            case 3:
                return new apez();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (apez.class) {
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
