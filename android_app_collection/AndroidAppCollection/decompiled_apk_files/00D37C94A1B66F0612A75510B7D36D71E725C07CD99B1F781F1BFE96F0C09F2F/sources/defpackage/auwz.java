package defpackage;
/* compiled from: PG */
/* renamed from: auwz  reason: default package */
/* loaded from: classes2.dex */
public final class auwz extends aopi implements aoqv {
    public static final auwz a;
    private static volatile aorb d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        auwz auwzVar = new auwz();
        a = auwzVar;
        aopi.registerDefaultInstance(auwz.class, auwzVar);
    }

    private auwz() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000︑㭪ﾟ繰\u0005\u0000\u0000\u0005︑㭪ᐼ\u0000\ufe2d㭪ᐼ\u0000\uf492䤳ᐼ\u0000\uf5c0夃ᐼ\u0000ﾟ繰ᐼ\u0000", new Object[]{"c", "b", auwy.class, auxb.class, aqtb.class, auwx.class, aowb.class});
            case 3:
                return new auwz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = d;
                if (aorbVar == null) {
                    synchronized (auwz.class) {
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
