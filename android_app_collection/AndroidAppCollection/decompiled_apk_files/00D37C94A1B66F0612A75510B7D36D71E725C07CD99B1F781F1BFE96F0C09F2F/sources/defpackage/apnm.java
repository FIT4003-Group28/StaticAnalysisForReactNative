package defpackage;
/* compiled from: PG */
/* renamed from: apnm  reason: default package */
/* loaded from: classes.dex */
public final class apnm extends aopi implements aoqv {
    public static final apnm a;
    private static volatile aorb d;
    public int b;
    public apnn c;
    private apnl e;
    private byte f = 2;

    static {
        apnm apnmVar = new apnm();
        a = apnmVar;
        aopi.registerDefaultInstance(apnm.class, apnmVar);
    }

    private apnm() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uf2a1♋\uf6f4⾞\u0002\u0000\u0000\u0002\uf2a1♋ᐉ\u0000\uf6f4⾞ᐉ\u0001", new Object[]{"b", "e", "c"});
            case 3:
                return new apnm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (apnm.class) {
                        aorbVar = d;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            d = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
