package defpackage;
/* compiled from: PG */
/* renamed from: aqfd  reason: default package */
/* loaded from: classes2.dex */
public final class aqfd extends aopi implements aoqv {
    public static final aqfd a;
    private static volatile aorb m;
    public int b;
    public aqfc c;
    public apho d;
    public auuk e;
    public aqdl f;
    public atir g;
    public aqtb h;
    public atjm i;
    public avcm j;
    public aoza k;
    public apng l;
    private byte n = 2;

    static {
        aqfd aqfdVar = new aqfd();
        a = aqfdVar;
        aopi.registerDefaultInstance(aqfd.class, aqfdVar);
    }

    private aqfd() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\uf549᩸\ue79e걫\n\u0000\u0000\t\uf549᩸ᐉ\u0000ﰛỾᐉ\u0001ﲁ㚒ᐉ\u0002\ue6b3䤦ᐉ\u0003\uf492䤳ᐉ\u0005\uf7ce䩰ᐉ\u0004\uf8ac佗ᐉ\u0006\uf48b咡ᐉ\u0007殺绛ဉ\b\ue79e걫ᐉ\t", new Object[]{"b", "c", "d", "e", "f", "h", "g", "i", "j", "k", "l"});
            case 3:
                return new aqfd();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = m;
                if (aorbVar == null) {
                    synchronized (aqfd.class) {
                        aorbVar = m;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            m = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
