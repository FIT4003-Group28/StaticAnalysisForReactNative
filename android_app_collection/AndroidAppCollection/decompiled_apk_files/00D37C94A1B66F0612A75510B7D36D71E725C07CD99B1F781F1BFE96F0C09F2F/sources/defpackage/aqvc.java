package defpackage;
/* compiled from: PG */
/* renamed from: aqvc  reason: default package */
/* loaded from: classes2.dex */
public final class aqvc extends aopi implements aoqv {
    public static final aqvc a;
    private static volatile aorb z;
    private arag A;
    private apzg B;
    private aoux C;
    public int b;
    public int c;
    public avhn d;
    public avhn e;
    public arag f;
    public arag g;
    public float h;
    public float i;
    public float j;
    public float k;
    public long l;
    public long m;
    public arag n;
    public arag o;
    public arag p;
    public arag q;
    public arag r;
    public arag s;
    public apzg t;
    public aqva u;
    private byte D = 2;
    public aopu v = emptyProtobufList();
    public aopu w = emptyProtobufList();
    public aopu x = emptyProtobufList();
    public aoob y = aoob.b;

    static {
        aqvc aqvcVar = new aqvc();
        a = aqvcVar;
        aopi.registerDefaultInstance(aqvc.class, aqvcVar);
    }

    private aqvc() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.D);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.D = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u001a\u0000\u0001\u0001\u001e\u001a\u0000\u0003\u000f\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ခ\u0006\u0007ခ\u0007\bခ\b\tခ\t\nဂ\n\u000bဂ\u000b\fᐉ\f\rᐉ\r\u000eᐉ\u0011\u000fᐉ\u0012\u0010ᐉ\u0013\u0011\u001b\u0012\u001b\u0013\u001b\u0014ᐉ\u0014\u0016ᐉ\u0010\u0017ᐉ\u0019\u0018ည\u001a\u001bᐉ\u0017\u001dᐉ\u000e\u001eᐉ\u000f", new Object[]{"b", "c", aqov.o, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "r", "s", "t", "v", aswg.class, "w", aswg.class, "x", aswg.class, "u", "A", "C", "y", "B", "p", "q"});
            case 3:
                return new aqvc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = z;
                if (aorbVar == null) {
                    synchronized (aqvc.class) {
                        aorbVar = z;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            z = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
