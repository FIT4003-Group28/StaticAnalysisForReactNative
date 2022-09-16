package defpackage;
/* compiled from: PG */
/* renamed from: aqyb  reason: default package */
/* loaded from: classes2.dex */
public final class aqyb extends aopi implements aoqv {
    public static final aqyb a;
    private static volatile aorb g;
    public int b;
    public audn c;
    public auvo d;
    public awar e;
    public arjw f;
    private apua h;
    private atio i;
    private atin j;
    private aukb k;
    private awbh l;
    private aqdi m;
    private aqea n;
    private aqei o;
    private aqep p;
    private aqeo q;
    private aqfa r;
    private aqio s;
    private apjm t;
    private aqtb u;
    private byte v = 2;

    static {
        aqyb aqybVar = new aqyb();
        a = aqybVar;
        aopi.registerDefaultInstance(aqyb.class, aqybVar);
    }

    private aqyb() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.v = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\ue1d6\u181e\uf492䤳\u0012\u0000\u0000\u0012\ue1d6\u181eᐉ\u0006\uf243\u181fᐉ\u0000\uf143ᠤᐉ\rﳴᠰᐉ\u0003\ue567ᠲᐉ\n\uef41ᠸᐉ\b\uf2b9ᥚᐉ\f\ue9c4ᯣᐉ\u0001\uea1cᯣᐉ\t\uef20Ḅᐉ\u0005\uee1dἍᐉ\u000f\uf55dΆᐉ\u0002\uec81⟕ᐉ\u0010\uf127⩲ᐉ\u0007\uf5b1⼞ᐉ\u000e\uf76d㋴ᐉ\u000bﶜ㌆ᐉ\u0004\uf492䤳ᐉ\u0011", new Object[]{"b", "e", "h", "r", "c", "o", "m", "q", "i", "n", "k", "t", "j", "f", "l", "s", "p", "d", "u"});
            case 3:
                return new aqyb();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (aqyb.class) {
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
