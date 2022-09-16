package defpackage;
/* compiled from: PG */
/* renamed from: avsk  reason: default package */
/* loaded from: classes2.dex */
public final class avsk extends aopi implements aoqv {
    public static final avsk a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private ates k;
    private apzg l;
    private apzg m;
    private aplw n;
    private aplw o;
    private aplw p;
    private aunb q;
    private aunb r;
    private aplw s;
    private aoux t;
    private arag u;
    private arag v;
    private arag w;
    private arag x;
    private byte y = 2;

    static {
        avsk avskVar = new avsk();
        a = avskVar;
        aopi.registerDefaultInstance(avsk.class, avskVar);
    }

    private avsk() {
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
                return Byte.valueOf(this.y);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.y = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u00039\u0015\u0000\u0000\u0015\u0003ᐉ\u0019\u000bᐉ\u000e\u001bᐉ\u0018\u001dᐉ\u001a\u001eᐉ\u001b\u001fᐉ\u001c\"ᐉ\n&ᐉ\u0011'ᐉ\u0001(ᐉ\u0002)ᐉ\u0003*ᐉ\u0004,ᐉ\u0005-ᐉ\u0006.ᐉ\u000f1ᐉ\r2ᐉ\u00145ᐉ\u00136ᐉ\u00128ᐉ\u00159ᐉ\u0016", new Object[]{"c", "u", "l", "t", "v", "w", "x", "j", "n", "d", "e", "f", "g", "h", "i", "m", "k", "q", "p", "o", "r", "s"});
            case 3:
                return new avsk();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avsk.class) {
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
