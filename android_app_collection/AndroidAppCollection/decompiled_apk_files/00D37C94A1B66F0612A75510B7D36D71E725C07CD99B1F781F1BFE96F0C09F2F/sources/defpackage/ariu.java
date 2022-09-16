package defpackage;
/* compiled from: PG */
/* renamed from: ariu  reason: default package */
/* loaded from: classes2.dex */
public final class ariu extends aopi implements aoqv {
    public static final ariu a;
    private static volatile aorb h;
    public int b;
    public arjh c;
    public arjj d;
    public arjd e;
    public arip f;
    public arjf g;
    private arjb i;
    private ariq j;
    private aufe k;
    private byte l = 2;

    static {
        ariu ariuVar = new ariu();
        a = ariuVar;
        aopi.registerDefaultInstance(ariu.class, ariuVar);
    }

    private ariu() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001אַᶖ\ue9cd㉵\b\u0000\u0000\bאַᶖᐉ\u0000\uf743↸ᐉ\u0004\ue4d2⇋ᐉ\u0002\ue5e4⇹ᐉ\u0001\ueda2⧮ᐉ\u0003\ue6f1⽊ᐉ\u0005\uf696⽤ᐉ\u0006\ue9cd㉵ᐉ\u0007", new Object[]{"b", "c", "i", "e", "d", "f", "j", "k", "g"});
            case 3:
                return new ariu();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (ariu.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
