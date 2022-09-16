package defpackage;
/* compiled from: PG */
/* renamed from: aues  reason: default package */
/* loaded from: classes2.dex */
public final class aues extends aopi implements aoqv {
    public static final aues a;
    private static volatile aorb k;
    public int b;
    public auex c;
    public awar d;
    public apjm e;
    public aqio f;
    public aukm g;
    public aqgy h;
    public atfa i;
    public avhz j;
    private byte l = 2;

    static {
        aues auesVar = new aues();
        a = auesVar;
        aopi.registerDefaultInstance(aues.class, auesVar);
    }

    private aues() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\ue1d6\u181e\uf6ce淸\b\u0000\u0000\b\ue1d6\u181eᐉ\u0001\ue108\u196eᐉ\u0000\ue592᯦ᐉ\u0006\uee1dἍᐉ\u0002\uf5b1⼞ᐉ\u0003\uecec䦨ᐉ\u0004\uf72c䰍ᐉ\u0005\uf6ce淸ᐉ\u0007", new Object[]{"b", "d", "c", "i", "e", "f", "g", "h", "j"});
            case 3:
                return new aues();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = k;
                if (aorbVar == null) {
                    synchronized (aues.class) {
                        aorbVar = k;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            k = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
