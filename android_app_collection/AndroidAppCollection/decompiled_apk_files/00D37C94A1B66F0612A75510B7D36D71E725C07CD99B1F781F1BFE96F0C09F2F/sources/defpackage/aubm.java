package defpackage;
/* compiled from: PG */
/* renamed from: aubm  reason: default package */
/* loaded from: classes2.dex */
public final class aubm extends aopi implements aoqv {
    public static final aubm a;
    private static volatile aorb f;
    public int b;
    public aquw c;
    public aquv d;
    public aqtb e;
    private aoyn g;
    private byte h = 2;

    static {
        aubm aubmVar = new aubm();
        a = aubmVar;
        aopi.registerDefaultInstance(aubm.class, aubmVar);
    }

    private aubm() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uf478ᬽ\ue2e3斄\u0004\u0000\u0000\u0004\uf478ᬽᐉ\u0001\uf5f9ᭀᐉ\u0000\uf492䤳ᐉ\u0003\ue2e3斄ᐉ\u0002", new Object[]{"b", "d", "c", "e", "g"});
            case 3:
                return new aubm();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (aubm.class) {
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
