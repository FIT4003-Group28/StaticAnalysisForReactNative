package defpackage;
/* compiled from: PG */
/* renamed from: avqc  reason: default package */
/* loaded from: classes2.dex */
public final class avqc extends aopi implements aoqv {
    public static final avqc a;
    private static volatile aorb b;
    private apzg A;
    private byte B = 2;
    private int c;
    private int d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private ates i;
    private apzg j;
    private avqb k;
    private aplw l;
    private aoux m;
    private aplw n;
    private avry o;
    private arag p;
    private arag q;
    private arag r;
    private arag s;
    private arag t;
    private arag u;
    private arag v;
    private arag w;
    private arag x;
    private arag y;
    private arag z;

    static {
        avqc avqcVar = new avqc();
        a = avqcVar;
        aopi.registerDefaultInstance(avqc.class, avqcVar);
    }

    private avqc() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.B);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.B = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0017\u0000\u0002\u0003(\u0017\u0000\u0000\u0017\u0003ᐉ\u0012\u0004ᐉ\u0005\u0007ᐉ\u0016\bᐉ\u0017\tᐉ\u0018\nᐉ\u0019\u000bᐉ\u001a\fᐉ\u001d\rᐉ\u001e\u000eᐉ\u001f\u000fᐉ \u0010ᐉ\u0011\u0013ᐉ\u001b\u0014ᐉ\u001c\u0016ᐉ\u000e\u001bᐉ\u0007\u001dᐉ\u0015\u001fᐉ\u0001 ᐉ\u0003!ᐉ\u0004\"ᐉ\u000b'ᐉ\f(ᐉ\u0002", new Object[]{"c", "d", "o", "i", "q", "r", "s", "t", "u", "x", "y", "z", "A", "n", "v", "w", "m", "j", "p", "e", "g", "h", "k", "l", "f"});
            case 3:
                return new avqc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avqc.class) {
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
