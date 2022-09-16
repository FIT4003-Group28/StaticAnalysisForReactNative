package defpackage;
/* compiled from: PG */
/* renamed from: avpc  reason: default package */
/* loaded from: classes2.dex */
public final class avpc extends aopi implements aoqv {
    public static final avpc a;
    private static volatile aorb b;
    private arag A;
    private arag B;
    private arag C;
    private byte D = 2;
    private int c;
    private int d;
    private arag e;
    private aunb f;
    private arag g;
    private apzg h;
    private avry i;
    private apok j;
    private apok k;
    private avpd l;
    private arag m;
    private arag n;
    private arag o;
    private aplw p;
    private arag q;
    private aoux r;
    private arag s;
    private apzg t;
    private arag u;
    private arag v;
    private arag w;
    private arag x;
    private arag y;
    private arag z;

    static {
        avpc avpcVar = new avpc();
        a = avpcVar;
        aopi.registerDefaultInstance(avpc.class, avpcVar);
    }

    private avpc() {
        aoob aoobVar = aoob.b;
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.D);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.D = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0019\u0000\u0002\u0002#\u0019\u0000\u0000\u0019\u0002ᐉ\u0014\u0003ᐉ\u0000\u0004ᐉ\u0015\u0007ᐉ \bᐉ!\nᐉ\u0006\u000bᐉ\u001c\fᐉ\u001d\rᐉ\u0016\u000fᐉ\u0018\u0010ᐉ\u001e\u0011ᐉ\u001a\u0012ᐉ\u001b\u0013ᐉ\u0019\u0015ᐉ\n\u0016ᐉ\u0003\u0018ᐉ\u0005\u0019ᐉ\u000b\u001aᐉ\f\u001cᐉ\r\u001dᐉ\u000e\u001eᐉ\u000f\u001fᐉ\b\"ᐉ\t#ᐉ\u0001", new Object[]{"c", "d", "r", "e", "s", "B", "C", "i", "y", "z", "t", "u", "A", "w", "x", "v", "l", "g", "h", "m", "n", "o", "p", "q", "j", "k", "f"});
            case 3:
                return new avpc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avpc.class) {
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
