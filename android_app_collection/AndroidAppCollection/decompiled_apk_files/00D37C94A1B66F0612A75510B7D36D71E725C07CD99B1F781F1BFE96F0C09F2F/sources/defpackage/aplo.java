package defpackage;
/* compiled from: PG */
/* renamed from: aplo  reason: default package */
/* loaded from: classes.dex */
public final class aplo extends aopi implements aoqv {
    public static final aplo a;
    private static volatile aorb f;
    public arag b;
    public arag c;
    public avhn d;
    public aunb e;
    private int g;
    private byte h = 2;

    static {
        aplo aploVar = new aplo();
        a = aploVar;
        aopi.registerDefaultInstance(aplo.class, aploVar);
    }

    private aplo() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004", new Object[]{"g", "b", "c", "d", "e"});
            case 3:
                return new aplo();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aplo.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
