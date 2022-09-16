package defpackage;
/* compiled from: PG */
/* renamed from: aqxi  reason: default package */
/* loaded from: classes2.dex */
public final class aqxi extends aopi implements aoqv {
    public static final aqxi a;
    private static volatile aorb h;
    public int b;
    public aqfa c;
    public aqio d;
    public aqea e;
    public aqdi f;
    public aqei g;
    private aqep i;
    private awar j;
    private atio k;
    private apua l;
    private audn m;
    private auvo n;
    private arjw o;
    private byte p = 2;

    static {
        aqxi aqxiVar = new aqxi();
        a = aqxiVar;
        aopi.registerDefaultInstance(aqxi.class, aqxiVar);
    }

    private aqxi() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.p = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\ue1d6\u181eﶜ㌆\f\u0000\u0000\f\ue1d6\u181eᐉ\u0006\uf243\u181fᐉ\b\uf143ᠤᐉ\u0000ﳴᠰᐉ\t\ue567ᠲᐉ\u0004\uef41ᠸᐉ\u0003\ue9c4ᯣᐉ\u0007\uea1cᯣᐉ\u0002\uec81⟕ᐉ\u000b\uf5b1⼞ᐉ\u0001\uf76d㋴ᐉ\u0005ﶜ㌆ᐉ\n", new Object[]{"b", "j", "l", "c", "m", "g", "f", "k", "e", "o", "d", "i", "n"});
            case 3:
                return new aqxi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqxi.class) {
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
