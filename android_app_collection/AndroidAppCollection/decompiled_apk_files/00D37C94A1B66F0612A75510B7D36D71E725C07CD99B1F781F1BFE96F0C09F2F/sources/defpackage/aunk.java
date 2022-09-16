package defpackage;
/* compiled from: PG */
/* renamed from: aunk  reason: default package */
/* loaded from: classes2.dex */
public final class aunk extends aopi implements aoqv {
    public static final aunk a;
    private static volatile aorb j;
    public int b;
    public atpl c;
    public atou d;
    public ater e;
    public ateo f;
    public apsm g;
    public arkf h;
    public aukz i;
    private atfa k;
    private argv l;
    private arro m;
    private byte n = 2;

    static {
        aunk aunkVar = new aunk();
        a = aunkVar;
        aopi.registerDefaultInstance(aunk.class, aunkVar);
    }

    private aunk() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.n = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\ue46d\u1738\uf367꽾\n\u0000\u0000\n\ue46d\u1738ᐉ\u0004\ue592᯦ᐉ\u0006\uef94ᾮᐉ\u0003\uefc3ᾮᐉ\u0002\ufe1a⌶ᐉ\u0000\uf74f⩫ᐉ\u0007\ued00㋚ᐉ\b\uec26㩻ᐉ\u0001\uf3df㮧ᐉ\u0005\uf367꽾ᐉ\t", new Object[]{"b", "g", "k", "f", "e", "c", "l", "m", "d", "h", "i"});
            case 3:
                return new aunk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aunk.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
