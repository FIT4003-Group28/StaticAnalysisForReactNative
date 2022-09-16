package defpackage;
/* compiled from: PG */
/* renamed from: awnv  reason: default package */
/* loaded from: classes2.dex */
public final class awnv extends aopi implements aoqv {
    public static final awnv a;
    private static volatile aorb c;
    public aopu b = emptyProtobufList();

    static {
        awnv awnvVar = new awnv();
        a = awnvVar;
        aopi.registerDefaultInstance(awnv.class, awnvVar);
    }

    private awnv() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", awnw.class});
            case 3:
                return new awnv();
            case 4:
                return new aopa((short[]) null, (short[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (awnv.class) {
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
