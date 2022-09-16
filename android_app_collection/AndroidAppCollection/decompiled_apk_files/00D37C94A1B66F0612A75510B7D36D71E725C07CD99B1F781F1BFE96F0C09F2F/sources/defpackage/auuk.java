package defpackage;
/* compiled from: PG */
/* renamed from: auuk  reason: default package */
/* loaded from: classes2.dex */
public final class auuk extends aopi implements aoqv {
    public static final auuk a;
    private static volatile aorb o;
    public int b;
    public arag c;
    public arag d;
    public ates e;
    public apzg h;
    public arag i;
    public apzg j;
    public boolean k;
    public apzg m;
    public aunb n;
    private aunb p;
    private aoux q;
    private byte r = 2;
    public aopu f = emptyProtobufList();
    public aoob g = aoob.b;
    public aopu l = emptyProtobufList();

    static {
        auuk auukVar = new auuk();
        a = auukVar;
        aopi.registerDefaultInstance(auuk.class, auukVar);
    }

    private auuk() {
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0016\u000e\u0000\u0002\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0002\u0007Л\tᐉ\u0004\nည\u0005\u000bᐉ\u0006\rᐉ\b\u000eᐉ\t\u0010ဇ\u000b\u0011Л\u0012ᐉ\r\u0015ᐉ\u0003\u0016ᐉ\f", new Object[]{"b", "c", "d", "e", "f", auul.class, "q", "g", "h", "i", "j", "k", "l", apzg.class, "n", "p", "m"});
            case 3:
                return new auuk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (auuk.class) {
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
