package defpackage;
/* compiled from: PG */
/* renamed from: arit  reason: default package */
/* loaded from: classes2.dex */
public final class arit extends aopi implements aoqv {
    public static final arit a;
    private static volatile aorb l;
    public int b;
    public aopu d;
    public aopu e;
    public arag f;
    public aris g;
    public arir h;
    public arir i;
    public long j;
    public apzg k;
    private aoux m;
    private byte n = 2;
    public aopu c = emptyProtobufList();

    static {
        arit aritVar = new arit();
        a = aritVar;
        aopi.registerDefaultInstance(arit.class, aritVar);
    }

    private arit() {
        aoob aoobVar = aoob.b;
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0015\n\u0000\u0003\u0006\u0001Л\u0002ᐉ\u0000\t\u001b\u000b\u001b\rᐉ\u0002\u000eᐉ\u0004\u000fᐉ\u0005\u0012ဉ\u0003\u0013ဂ\u0007\u0015ᐉ\t", new Object[]{"b", "c", ariy.class, "m", "d", aswg.class, "e", aswg.class, "f", "h", "i", "g", "j", "k"});
            case 3:
                return new arit();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (arit.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
