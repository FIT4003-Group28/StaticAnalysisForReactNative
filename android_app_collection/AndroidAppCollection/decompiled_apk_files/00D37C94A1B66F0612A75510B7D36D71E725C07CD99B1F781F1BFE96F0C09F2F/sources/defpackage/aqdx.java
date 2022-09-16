package defpackage;
/* compiled from: PG */
/* renamed from: aqdx  reason: default package */
/* loaded from: classes2.dex */
public final class aqdx extends aopi implements aoqv {
    public static final aqdx a;
    private static volatile aorb g;
    public int b;
    public apup c;
    public auem d;
    public auen e;
    public arhu f;
    private aukc h;
    private atjs i;
    private aqjt j;
    private awbe k;
    private byte l = 2;

    static {
        aqdx aqdxVar = new aqdx();
        a = aqdxVar;
        aopi.registerDefaultInstance(aqdx.class, aqdxVar);
    }

    private aqdx() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\uf7c4ᜤ\uf8fbⴙ\b\u0000\u0000\b\uf7c4ᜤᐉ\u0001\uf1d2ᜫᐉ\u0000\ue391⊉ᐉ\u0002\uea90⪄ᐉ\u0006鸞⬄ᐉ\u0003\uefeeⱹᐉ\u0004\uf08eⳕᐉ\u0005\uf8fbⴙᐉ\u0007", new Object[]{"b", "d", "c", "e", "k", "h", "i", "j", "f"});
            case 3:
                return new aqdx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqdx.class) {
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
