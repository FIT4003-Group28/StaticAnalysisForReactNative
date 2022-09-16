package defpackage;
/* compiled from: PG */
/* renamed from: aoxp  reason: default package */
/* loaded from: classes.dex */
public final class aoxp extends aopi implements aoqv {
    public static final aoxp a;
    private static volatile aorb j;
    public int b;
    public aoxq c;
    public aoxr d;
    public aoxs e;
    public aoxt f;
    public aoxo g;
    public aoxu h;
    public aqkg i;
    private byte k = 2;

    static {
        aoxp aoxpVar = new aoxp();
        a = aoxpVar;
        aopi.registerDefaultInstance(aoxp.class, aoxpVar);
    }

    private aoxp() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\ueec5Ⓩ\ue7d0䥠\u0007\u0000\u0000\u0001\ueec5Ⓩဉ\u0002\uef11Ⓩဉ\u0003ﮎⓐဉ\u0000\uf120⤣ᐉ\u0007２䕛ဉ\n\ue3b9䜗ဉ\u0004\ue7d0䥠ဉ\u000b", new Object[]{"b", "d", "e", "c", "g", "h", "f", "i"});
            case 3:
                return new aoxp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aoxp.class) {
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
