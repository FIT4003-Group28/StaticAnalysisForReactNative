package defpackage;
/* compiled from: PG */
/* renamed from: aqfc  reason: default package */
/* loaded from: classes2.dex */
public final class aqfc extends aopi implements aoqv {
    public static final aqfc a;
    private static volatile aorb s;
    public int b;
    public arag c;
    public aunb d;
    public arag e;
    public aunb f;
    public avhn g;
    public aunb h;
    public apzg i;
    public ates j;
    public aqfb k;
    public aunb l;
    public apzg n;
    public aunb o;
    public aqgw p;
    public int q;
    private aoux t;
    private byte u = 2;
    public aopu m = emptyProtobufList();
    public aoob r = aoob.b;

    static {
        aqfc aqfcVar = new aqfc();
        a = aqfcVar;
        aopi.registerDefaultInstance(aqfc.class, aqfcVar);
    }

    private aqfc() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.u = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0002\u0015\u0011\u0000\u0001\u000e\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ᐉ\u0007\u0007ᐉ\t\bᐉ\u0012\tည\u0013\nᐉ\n\fЛ\rᐉ\u000e\u000fᐉ\u0002\u0010ᐉ\u0004\u0011ᐉ\u0006\u0012ဉ\u0010\u0013ဋ\u0011\u0014ᐉ\u000b\u0015ᐉ\r", new Object[]{"b", "c", "e", "g", "i", "j", "t", "r", "k", "m", apzg.class, "o", "d", "f", "h", "p", "q", "l", "n"});
            case 3:
                return new aqfc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = s;
                if (aorbVar == null) {
                    synchronized (aqfc.class) {
                        aorbVar = s;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            s = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
