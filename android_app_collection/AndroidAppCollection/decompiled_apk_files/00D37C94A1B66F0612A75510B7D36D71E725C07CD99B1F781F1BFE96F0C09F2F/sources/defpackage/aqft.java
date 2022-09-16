package defpackage;
/* compiled from: PG */
/* renamed from: aqft  reason: default package */
/* loaded from: classes2.dex */
public final class aqft extends aopi implements aoqv {
    public static final aqft a;
    private static volatile aorb v;
    public int b;
    public arag c;
    public avhn d;
    public arhs e;
    public apok h;
    public apok i;
    public aoux j;
    public arag m;
    public aoob n;
    public aopu o;
    public arag p;
    public arag q;
    public apzg r;
    public apzg s;
    public apzg t;
    public arag u;
    private arag w;
    private apzg x;
    private byte y = 2;
    public String f = "";
    public aopu g = emptyProtobufList();
    public aopu k = emptyProtobufList();
    public aopu l = emptyProtobufList();

    static {
        aqft aqftVar = new aqft();
        a = aqftVar;
        aopi.registerDefaultInstance(aqft.class, aqftVar);
    }

    private aqft() {
        emptyProtobufList();
        this.n = aoob.b;
        this.o = emptyProtobufList();
        emptyProtobufList();
    }

    public final void a() {
        aopu aopuVar = this.g;
        if (!aopuVar.c()) {
            this.g = aopi.mutableCopy(aopuVar);
        }
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.y);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.y = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001\u001f\u0015\u0000\u0004\u0013\u0001ᐉ\u0000\u0002ᐉ\u001a\u0003ᐉ\u0015\u0004ᐉ\u0016\u0005ᐉ\u0017\u0006ᐉ\n\u0007ည\u0012\bЛ\tᐉ\u0018\nᐉ\u0019\fᐉ\u0005\rᐉ\u0006\u000eᐉ\u0001\u0010ᐉ\u0003\u0012ဈ\u0004\u0017Л\u0018Л\u0019Л\u001cᐉ\r\u001eᐉ\u000e\u001fᐉ\u000f", new Object[]{"b", "c", "u", "p", "q", "r", "j", "n", "g", arag.class, "s", "t", "h", "i", "d", "e", "f", "o", apzg.class, "k", apzg.class, "l", apzg.class, "w", "x", "m"});
            case 3:
                return new aqft();
            case 4:
                return new aopa((float[]) null, (byte[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = v;
                if (aorbVar == null) {
                    synchronized (aqft.class) {
                        aorbVar = v;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            v = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
