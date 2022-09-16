package defpackage;
/* compiled from: PG */
/* renamed from: arev  reason: default package */
/* loaded from: classes2.dex */
public final class arev extends aopi implements aoqv {
    public static final arev a;
    private static volatile aorb n;
    public int b;
    public avhn c;
    public arag d;
    public apzg e;
    public ates f;
    public arag g;
    public arag h;
    public arag i;
    public arag j;
    public asxo k;
    public aoob l;
    public aopu m;
    private apzg o;
    private apzg p;
    private aoux q;
    private arag r;
    private byte s = 2;

    static {
        arev arevVar = new arev();
        a = arevVar;
        aopi.registerDefaultInstance(arev.class, arevVar);
    }

    private arev() {
        emptyProtobufList();
        this.l = aoob.b;
        this.m = emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.s = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0014\u000f\u0000\u0001\r\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004\u0007ᐉ\t\bᐉ\u000f\tᐉ\u0006\nᐉ\u000b\u000bᐉ\f\fည\u0010\u000eᐉ\u0011\u000fᐉ\n\u0010ᐉ\u0007\u0012Л\u0013ဉ\u000e\u0014ᐉ\u0005", new Object[]{"b", "c", "d", "e", "g", "q", "p", "i", "j", "l", "r", "h", "f", "m", avhc.class, "k", "o"});
            case 3:
                return new arev();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (arev.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
