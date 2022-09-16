package defpackage;
/* compiled from: PG */
/* renamed from: atno  reason: default package */
/* loaded from: classes2.dex */
public final class atno extends aopi implements aoqv {
    public static final atno a;
    public static final aopg b;
    private static volatile aorb c;

    static {
        atno atnoVar = new atno();
        a = atnoVar;
        aopi.registerDefaultInstance(atno.class, atnoVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, atnp.a, atnp.a, null, 94476261, aosj.MESSAGE, atnp.class);
    }

    private atno() {
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
                return new atno();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (atno.class) {
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
