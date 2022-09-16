package defpackage;
/* compiled from: PG */
/* renamed from: apki  reason: default package */
/* loaded from: classes.dex */
public final class apki extends aopi implements aoqv {
    public static final apki a;
    private static volatile aorb c;
    public aoqp b = aoqp.a;
    private byte d = 2;

    static {
        apki apkiVar = new apki();
        a = apkiVar;
        aopi.registerDefaultInstance(apki.class, apkiVar);
    }

    private apki() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"b", apkh.a});
            case 3:
                return new apki();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (apki.class) {
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
