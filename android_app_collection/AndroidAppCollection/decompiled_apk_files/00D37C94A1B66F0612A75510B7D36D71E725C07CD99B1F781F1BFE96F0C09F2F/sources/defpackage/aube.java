package defpackage;
/* compiled from: PG */
/* renamed from: aube  reason: default package */
/* loaded from: classes2.dex */
public final class aube extends aopi implements aoqv {
    public static final aube a;
    private static volatile aorb t;
    private aunb A;
    private apzg B;
    private apzg C;
    private apzg D;
    private apzg E;
    private apzg F;
    private arag G;
    private auaq H;
    public int b;
    public aubd d;
    public aubf e;
    public auav f;
    public aubb g;
    public auba h;
    public aubj i;
    public aunb j;
    public aunb k;
    public aunb l;
    public arag m;
    public aunb n;
    public apok o;
    public aunb p;
    public aunb q;
    public aunb r;
    public aunb s;
    private int u;
    private apzg v;
    private aubg w;
    private aunb x;
    private aunb y;
    private aunb z;
    private byte I = 2;
    public aopu c = emptyProtobufList();

    static {
        aube aubeVar = new aube();
        a = aubeVar;
        aopi.registerDefaultInstance(aube.class, aubeVar);
    }

    private aube() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.I);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.I = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001e\u0000\u0002\u0001&\u001e\u0000\u0001\u001e\u0001Л\u0002ᐉ\u0000\u0003ᐉ\t\u0004ᐉ\n\u0005ᐉ\u0001\u0006ᐉ\u0004\u0007ᐉ\b\bᐉ\f\rᐉ\r\u000eᐉ\u000e\u000fᐉ\u0010\u0010ᐉ\u0012\u0011ᐉ\u0007\u0012ᐉ\u0013\u0013ᐉ\u000b\u0014ᐉ\u000f\u0015ᐉ\u0014\u0016ᐉ\u0015\u0017ᐉ\u0018\u0019ᐉ\u001c\u001aᐉ\u001d\u001bᐉ\u001e\u001cᐉ\u001f\u001dᐉ \u001eᐉ\u0019\u001fᐉ! ᐉ\u001a$ᐉ\"%ᐉ\u0011&ᐉ\u001b", new Object[]{"b", "u", "c", auau.class, "d", "g", "h", "e", "f", "w", "i", "y", "z", "k", "m", "v", "n", "x", "j", "o", "p", "q", "B", "C", "D", "E", "F", "r", "G", "s", "H", "l", "A"});
            case 3:
                return new aube();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = t;
                if (aorbVar == null) {
                    synchronized (aube.class) {
                        aorbVar = t;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            t = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
