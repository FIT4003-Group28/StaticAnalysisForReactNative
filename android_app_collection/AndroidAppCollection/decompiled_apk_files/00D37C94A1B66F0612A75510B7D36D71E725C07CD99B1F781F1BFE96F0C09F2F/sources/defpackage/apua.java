package defpackage;
/* compiled from: PG */
/* renamed from: apua  reason: default package */
/* loaded from: classes2.dex */
public final class apua extends aopi implements aoqv {
    public static final apua a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private apzg e;
    private apzg f;
    private arag g;
    private arag h;
    private arag i;
    private arag j;
    private arag k;
    private avaz l;
    private apmg m;
    private arag n;
    private apdy o;
    private arag p;
    private aunb q;
    private arag r;
    private aoux s;
    private arag t;
    private arag u;
    private byte v = 2;

    static {
        apua apuaVar = new apua();
        a = apuaVar;
        aopi.registerDefaultInstance(apua.class, apuaVar);
    }

    private apua() {
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
                return Byte.valueOf(this.v);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.v = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0002!\u0012\u0000\u0000\u0012\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\t\nᐉ\n\fᐉ\f\rᐉ\r\u000eᐉ\u000e\u0010ᐉ\u0016\u0013ᐉ\u0007\u0015ᐉ\u000b\u0019ᐉ\u0019\u001aᐉ\u001a\u001eᐉ\u0015 ᐉ\u0003!ᐉ\u0010", new Object[]{"c", "d", "e", "g", "h", "j", "k", "l", "n", "o", "p", "s", "i", "m", "t", "u", "r", "f", "q"});
            case 3:
                return new apua();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (apua.class) {
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
