package defpackage;
/* compiled from: PG */
/* renamed from: arer  reason: default package */
/* loaded from: classes2.dex */
public final class arer extends aopi implements aoqv {
    public static final arer a;
    private static volatile aorb o;
    public int b;
    public aueo c;
    public avhn d;
    public arag e;
    public arag f;
    public arag g;
    public arag h;
    public apzg i;
    public aopu j;
    public ates k;
    public asxo l;
    public aoob m;
    public aopu n;
    private arag p;
    private arag q;
    private apzg r;
    private arag s;
    private aoux t;
    private arag u;
    private areq v;
    private asow w;
    private arcq x;
    private byte y = 2;

    static {
        arer arerVar = new arer();
        a = arerVar;
        aopi.registerDefaultInstance(arer.class, arerVar);
    }

    private arer() {
        emptyProtobufList();
        emptyProtobufList();
        this.j = emptyProtobufList();
        emptyProtobufList();
        this.m = aoob.b;
        this.n = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0002\u001a\u0015\u0000\u0002\u0013\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ᐉ\u0007\u0006ᐉ\t\bᐉ\u000b\tᐉ\b\nᐉ\u000f\u000bည\u0010\u000eᐉ\u0011\u0010ᐉ\u0001\u0011ᐉ\u0006\u0012ᐉ\f\u0013ᐉ\u0012\u0014ᐉ\u0013\u0015Л\u0016ᐉ\u0014\u0017Л\u0018ဉ\r\u0019ᐉ\n\u001aᐉ\u0004", new Object[]{"b", "d", "e", "f", "g", "i", "s", "h", "t", "m", "u", "c", "q", "k", "v", "w", "j", aplw.class, "x", "n", avhc.class, "l", "r", "p"});
            case 3:
                return new arer();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = o;
                if (aorbVar == null) {
                    synchronized (arer.class) {
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
