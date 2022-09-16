package defpackage;
/* compiled from: PG */
/* renamed from: avqa  reason: default package */
/* loaded from: classes2.dex */
public final class avqa extends aopi implements aoqv {
    public static final avqa a;
    private static volatile aorb b;
    private int c;
    private int d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private arag k;
    private arag l;
    private arag m;
    private arag n;
    private arag o;
    private aplw p;
    private aplw q;
    private apzg r;
    private apzg s;
    private apzg t;
    private aunb u;
    private aplw v;
    private aunb w;
    private aplw x;
    private aoux y;
    private byte z = 2;

    static {
        avqa avqaVar = new avqa();
        a = avqaVar;
        aopi.registerDefaultInstance(avqa.class, avqaVar);
    }

    private avqa() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.z);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.z = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0002\u0003$\u0015\u0000\u0000\u0015\u0003ᐉ\n\u0004ᐉ\f\u0005ᐉ\r\u0006ᐉ\u000e\u0007ᐉ\u000f\bᐉ\u0016\tᐉ\u0012\u000bᐉ \u000eᐉ\u0014\u000fᐉ\u0006\u0010ᐉ\b\u0013ᐉ\u0017\u0014ᐉ\t\u0018ᐉ\u001a\u0019ᐉ\u000b\u001aᐉ\u001b\u001cᐉ\u001d\u001eᐉ\u001c\u001fᐉ\u0015\"ᐉ\u0007$ᐉ\u001e", new Object[]{"c", "d", "i", "k", "l", "m", "n", "r", "o", "y", "p", "e", "g", "s", "h", "t", "j", "u", "w", "v", "q", "f", "x"});
            case 3:
                return new avqa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avqa.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
