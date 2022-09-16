package defpackage;
/* compiled from: PG */
/* renamed from: apou  reason: default package */
/* loaded from: classes2.dex */
public final class apou extends aopi implements aoqv {
    public static final apou a;
    private static volatile aorb c;
    public apoj b;
    private int d;
    private byte e = 2;

    static {
        apou apouVar = new apou();
        a = apouVar;
        aopi.registerDefaultInstance(apou.class, apouVar);
    }

    private apou() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ueb11ἑ\ueb11ἑ\u0001\u0000\u0000\u0001\ueb11ἑᐉ\u0000", new Object[]{"d", "b"});
            case 3:
                return new apou();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (apou.class) {
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
