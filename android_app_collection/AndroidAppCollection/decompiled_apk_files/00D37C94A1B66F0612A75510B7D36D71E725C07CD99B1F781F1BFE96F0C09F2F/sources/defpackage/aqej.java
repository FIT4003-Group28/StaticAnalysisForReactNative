package defpackage;
/* compiled from: PG */
/* renamed from: aqej  reason: default package */
/* loaded from: classes2.dex */
public final class aqej extends aopi implements aoqv {
    public static final aqej a;
    private static volatile aorb p;
    public int b;
    public avhn c;
    public arag e;
    public arag f;
    public arag h;
    public aopu i;
    public arag j;
    public aopu k;
    public aopu l;
    public apzg m;
    public ates n;
    public aoob o;
    private aoux q;
    private byte r = 2;
    public aopu d = emptyProtobufList();
    public aopu g = emptyProtobufList();

    static {
        aqej aqejVar = new aqej();
        a = aqejVar;
        aopi.registerDefaultInstance(aqej.class, aqejVar);
    }

    private aqej() {
        emptyProtobufList();
        this.i = emptyProtobufList();
        this.k = emptyProtobufList();
        this.l = emptyProtobufList();
        this.o = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.r = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0005\r\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0003\u0006Л\u0007ᐉ\u0004\bЛ\tЛ\nᐉ\u0005\u000bᐉ\u0006\rည\b\u000eᐉ\t\u000fᐉ\u0001", new Object[]{"b", "c", "d", avhc.class, "f", "g", apmg.class, "h", "i", arag.class, "j", "k", arag.class, "l", apmg.class, "m", "n", "o", "q", "e"});
            case 3:
                return new aqej();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = p;
                if (aorbVar == null) {
                    synchronized (aqej.class) {
                        aorbVar = p;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            p = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
