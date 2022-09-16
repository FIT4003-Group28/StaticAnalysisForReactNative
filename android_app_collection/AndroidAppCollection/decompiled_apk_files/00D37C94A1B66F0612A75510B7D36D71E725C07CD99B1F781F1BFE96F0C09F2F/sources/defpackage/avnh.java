package defpackage;
/* compiled from: PG */
/* renamed from: avnh  reason: default package */
/* loaded from: classes2.dex */
public final class avnh extends aopi implements aoqv {
    public static final avnh a;
    private static volatile aorb h;
    public int b;
    public avmu c;
    public avmz d;
    public avnn e;
    public avnm f;
    public avmq g;
    private avmw i;
    private avms j;
    private byte k = 2;

    static {
        avnh avnhVar = new avnh();
        a = avnhVar;
        aopi.registerDefaultInstance(avnh.class, avnhVar);
    }

    private avnh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\ue084⦔\uf5e5族\u0007\u0000\u0000\u0007\ue084⦔ᐉ\u0003\uee27⦜ᐉ\u0001\uee6f⦽ᐉ\u0000\uee75㿤ᐉ\u0002זּ䘞ᐉ\u0005\uf281冯ᐉ\u0006\uf5e5族ᐉ\u0004", new Object[]{"b", "e", "c", "i", "d", "j", "g", "f"});
            case 3:
                return new avnh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (avnh.class) {
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
