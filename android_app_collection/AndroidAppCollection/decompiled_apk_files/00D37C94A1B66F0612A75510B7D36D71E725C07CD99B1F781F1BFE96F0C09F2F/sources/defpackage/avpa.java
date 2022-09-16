package defpackage;
/* compiled from: PG */
/* renamed from: avpa  reason: default package */
/* loaded from: classes2.dex */
public final class avpa extends aopi implements aoqv {
    public static final avpa a;
    private static volatile aorb b;
    private arag A;
    private arag B;
    private byte C = 2;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private apzg k;
    private ates l;
    private aunb m;
    private arag n;
    private aplw o;
    private aplw p;
    private aunb q;
    private aunb r;
    private aunb s;
    private aplw t;
    private aunb u;
    private aoux v;
    private arag w;
    private arag x;
    private arag y;
    private arag z;

    static {
        avpa avpaVar = new avpa();
        a = avpaVar;
        aopi.registerDefaultInstance(avpa.class, avpaVar);
    }

    private avpa() {
        emptyProtobufList();
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.C);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.C = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0019\u0000\u0001\u0002!\u0019\u0000\u0000\u0019\u0002ᐉ\u001a\u0003ᐉ\u001b\u0004ᐉ\u001c\u0005ᐉ\u001d\u0006ᐉ\u001f\u0007ᐉ\t\bᐉ\u000e\nᐉ\u0019\fᐉ\u0002\u000fᐉ\u001e\u0010ᐉ\u0003\u0011ᐉ\u0004\u0012ᐉ\u0005\u0013ᐉ\u000f\u0015ᐉ\b\u0016ᐉ\n\u0017ᐉ\u0006\u0019ᐉ\u0013\u001aᐉ\u000b\u001bᐉ\u0010\u001dᐉ\u0015\u001eᐉ\u0011\u001fᐉ\u0007 ᐉ\u0016!ᐉ\u0017", new Object[]{"c", "w", "x", "y", "z", "B", "k", "n", "v", "d", "A", "e", "f", "g", "o", "j", "l", "h", "r", "m", "p", "s", "q", "i", "t", "u"});
            case 3:
                return new avpa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avpa.class) {
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
