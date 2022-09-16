package defpackage;
/* compiled from: PG */
/* renamed from: aqmx  reason: default package */
/* loaded from: classes2.dex */
public final class aqmx extends aopi implements aoqv {
    public static final aqmx a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private aunb h;
    private aunb i;
    private aunb j;
    private aunb k;
    private aunb l;
    private apzg m;
    private aoux n;
    private aozy o;
    private arag p;
    private byte q = 2;

    static {
        aqmx aqmxVar = new aqmx();
        a = aqmxVar;
        aopi.registerDefaultInstance(aqmx.class, aqmxVar);
    }

    private aqmx() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.q = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0011\r\u0000\u0000\r\u0001ᐉ\f\u0004ᐉ\u0001\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0006\tᐉ\u0007\nᐉ\b\fᐉ\u000b\rᐉ\u000e\u000eᐉ\t\u000fᐉ\n\u0010ᐉ\u0005\u0011ᐉ\u000f", new Object[]{"c", "n", "d", "e", "f", "h", "i", "j", "m", "o", "k", "l", "g", "p"});
            case 3:
                return new aqmx();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (aqmx.class) {
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
