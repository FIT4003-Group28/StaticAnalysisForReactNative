package defpackage;
/* compiled from: PG */
/* renamed from: atio  reason: default package */
/* loaded from: classes2.dex */
public final class atio extends aopi implements aoqv {
    public static final atio a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private apok g;
    private arag h;
    private arag i;
    private arag j;
    private arag k;
    private arag l;
    private arag m;
    private arag n;
    private apzg o;
    private apmg p;
    private apmg q;
    private apmg r;
    private apdy s;
    private aslz t;
    private ates u;
    private aoux v;
    private apok w;
    private byte x = 2;

    static {
        atio atioVar = new atio();
        a = atioVar;
        aopi.registerDefaultInstance(atio.class, atioVar);
    }

    private atio() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return Byte.valueOf(this.x);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.x = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0003$\u0014\u0000\u0000\u0014\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0006\u0007ᐉ\b\bᐉ\t\tᐉ\u000b\nᐉ\f\u000bᐉ\u000e\u000eᐉ\u0012\u0010ᐉ\u0016\u0012ᐉ\n\u0013ᐉ\u0013\u0015ᐉ\r\u0016ᐉ\u0014\u0018ᐉ\u000f\u0019ᐉ\u0010\u001aᐉ\u0011\u001cᐉ\u0003!ᐉ\u0005$ᐉ\u001a", new Object[]{"c", "d", "f", "h", "i", "j", "l", "m", "o", "s", "v", "k", "t", "n", "u", "p", "q", "r", "e", "g", "w"});
            case 3:
                return new atio();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (atio.class) {
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
