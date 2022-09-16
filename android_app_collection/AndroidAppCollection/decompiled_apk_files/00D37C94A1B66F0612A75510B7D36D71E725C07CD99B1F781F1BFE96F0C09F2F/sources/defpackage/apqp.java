package defpackage;
/* compiled from: PG */
/* renamed from: apqp  reason: default package */
/* loaded from: classes2.dex */
public final class apqp extends aopi implements aoqv {
    public static final apqp a;
    private static volatile aorb b;
    private arag A;
    private apqv B;
    private apzg C;
    private arag D;
    private byte E = 2;
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
    private apqw m;
    private arag n;
    private arag o;
    private arag p;
    private arag q;
    private arag r;
    private apqz s;
    private apqx t;
    private apqy u;
    private apqt v;
    private apzg w;
    private arag x;
    private apqq y;
    private arag z;

    static {
        apqp apqpVar = new apqp();
        a = apqpVar;
        aopi.registerDefaultInstance(apqp.class, apqpVar);
    }

    private apqp() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.E);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.E = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001a\u0000\u0002\u0001(\u001a\u0000\u0000\u001a\u0001ᐉ\u0004\u0004ᐉ\u000e\u0005ᐉ\u000f\u0006ᐉ\u0010\u0007ᐉ\u0011\bᐉ\u0012\tᐉ\u0013\nᐉ\u0014\fᐉ\u0015\u0012ᐉ\u001e\u0013ᐉ\u0000\u0015ᐉ\n\u0016ᐉ\u000b\u0018ᐉ\u001a\u0019ᐉ\u001b\u001aᐉ\u0003\u001bᐉ\u0017\u001cᐉ\f\u001dᐉ\r\u001eᐉ\t\u001fᐉ\u0006 ᐉ\u0005%ᐉ\u0007&ᐉ\u001c'ᐉ\u001f(ᐉ ", new Object[]{"c", "d", "g", "p", "q", "r", "s", "t", "u", "v", "w", "B", "e", "l", "m", "y", "z", "f", "x", "n", "o", "k", "i", "h", "j", "A", "C", "D"});
            case 3:
                return new apqp();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apqp.class) {
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
