package defpackage;
/* compiled from: PG */
/* renamed from: avsj  reason: default package */
/* loaded from: classes2.dex */
public final class avsj extends aopi implements aoqv {
    public static final avsj a;
    private static volatile aorb b;
    private apzg A;
    private aunb B;
    private byte C = 2;
    private int c;
    private int d;
    private arag e;
    private apzg f;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private arag k;
    private arag l;
    private arag m;
    private arag n;
    private arag o;
    private arag p;
    private arag q;
    private arag r;
    private arag s;
    private apzg t;
    private avry u;
    private ates v;
    private aoux w;
    private aunb x;
    private aunb y;
    private aunb z;

    static {
        avsj avsjVar = new avsj();
        a = avsjVar;
        aopi.registerDefaultInstance(avsj.class, avsjVar);
    }

    private avsj() {
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
                return Byte.valueOf(this.C);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.C = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0018\u0000\u0002\u0002)\u0018\u0000\u0000\u0018\u0002ᐉ\u0004\u0003ᐉ\u0007\u0004ᐉ\b\u0005ᐉ\t\u0006ᐉ\n\u0007ᐉ\u000b\bᐉ\f\tᐉ\u000e\fᐉ\u001a\rᐉ\u001b\u000eᐉ\r\u0013ᐉ\u001e\u0014ᐉ\u0005\u0016ᐉ\u000f\u0017ᐉ\u0010\u0018ᐉ\u0011\u0019ᐉ\u0012\u001aᐉ\u0015\u001dᐉ\u0014#ᐉ $ᐉ!%ᐉ#&ᐉ\")ᐉ$", new Object[]{"c", "d", "e", "g", "h", "i", "j", "k", "l", "n", "u", "v", "m", "w", "f", "o", "p", "q", "r", "t", "s", "x", "y", "A", "z", "B"});
            case 3:
                return new avsj();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (avsj.class) {
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
