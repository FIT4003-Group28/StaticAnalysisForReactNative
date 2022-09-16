package defpackage;
/* compiled from: PG */
/* renamed from: aqhx  reason: default package */
/* loaded from: classes2.dex */
public final class aqhx extends aopi implements aoqv {
    public static final aqhx a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private ates e;
    private aqhm f;
    private arag g;
    private aqhi h;
    private aqhl i;
    private aoux j;
    private apzg k;
    private apzg l;
    private arag m;
    private apzg n;
    private byte o = 2;

    static {
        aqhx aqhxVar = new aqhx();
        a = aqhxVar;
        aopi.registerDefaultInstance(aqhx.class, aqhxVar);
    }

    private aqhx() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.o = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0002\u0018\u000b\u0000\u0000\u000b\u0002ᐉ\u0004\u0004ᐉ\b\u0007ᐉ\u000b\tᐉ\u0006\u000bᐉ\r\fᐉ\u000e\rᐉ\u000f\u0012ᐉ\u0007\u0013ᐉ\n\u0016ᐉ\u0014\u0018ᐉ\u0015", new Object[]{"c", "d", "g", "i", "e", "j", "k", "l", "f", "h", "m", "n"});
            case 3:
                return new aqhx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqhx.class) {
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
