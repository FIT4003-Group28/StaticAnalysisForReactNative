package defpackage;
/* compiled from: PG */
/* renamed from: aoxh  reason: default package */
/* loaded from: classes.dex */
public final class aoxh extends aopi implements aoqv {
    public static final aoxh a;
    private static volatile aorb o;
    public int b;
    public arag c;
    public arag d;
    public avhn e;
    public arag f;
    public aunb g;
    public apzg h;
    public aunb j;
    public aunb k;
    public aunb l;
    public aunb m;
    private apzg p;
    private apzg q;
    private apzg r;
    private aoxg s;
    private aoux t;
    private byte u = 2;
    public aopu i = emptyProtobufList();
    public aoob n = aoob.b;

    static {
        aoxh aoxhVar = new aoxh();
        a = aoxhVar;
        aopi.registerDefaultInstance(aoxh.class, aoxhVar);
    }

    private aoxh() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.u = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0001\u0010\u0001ᐉ\u0000\u0002ᐉ\u0002\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ᐉ\n\u0007Л\bᐉ\b\tᐉ\u0001\nᐉ\t\u000bᐉ\u0004\rᐉ\u000b\u000eᐉ\f\u000fᐉ\u000e\u0010ᐉ\u000f\u0011ည\u0010\u0012ᐉ\u0005\u0013ᐉ\r", new Object[]{"b", "c", "e", "p", "q", "s", "i", arag.class, "h", "d", "r", "f", "j", "k", "m", "t", "n", "g", "l"});
            case 3:
                return new aoxh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (aoxh.class) {
                        aorbVar = o;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            o = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
