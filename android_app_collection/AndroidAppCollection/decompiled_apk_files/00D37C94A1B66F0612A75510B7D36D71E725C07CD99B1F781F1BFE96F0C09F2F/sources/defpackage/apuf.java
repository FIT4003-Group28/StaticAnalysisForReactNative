package defpackage;
/* compiled from: PG */
/* renamed from: apuf  reason: default package */
/* loaded from: classes2.dex */
public final class apuf extends aopi implements aoqv {
    public static final apuf a;
    private static volatile aorb b;
    private int c;
    private apuw d;
    private byte e = 2;

    static {
        apuf apufVar = new apuf();
        a = apufVar;
        aopi.registerDefaultInstance(apuf.class, apufVar);
    }

    private apuf() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ufff2⏝\ufff2⏝\u0001\u0000\u0000\u0001\ufff2⏝ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new apuf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apuf.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
