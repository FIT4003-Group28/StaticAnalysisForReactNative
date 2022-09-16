package defpackage;
/* compiled from: PG */
/* renamed from: aqgl  reason: default package */
/* loaded from: classes2.dex */
public final class aqgl extends aopi implements aoqv {
    public static final aqgl a;
    public static final aopg b;
    private static volatile aorb l;
    public ateg c;
    public ateg d;
    public ateg e;
    public ateg f;
    public ateg g;
    public ateg h;
    public ateg i;
    public ateg j;
    public ateg k;
    private int m;
    private byte n = 2;

    static {
        aqgl aqglVar = new aqgl();
        a = aqglVar;
        aopi.registerDefaultInstance(aqgl.class, aqglVar);
        b = aopi.newSingularGeneratedExtension(aqkj.a, aqglVar, aqglVar, null, 146552955, aosj.MESSAGE, aqgl.class);
    }

    private aqgl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.n = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\u0005\tᐉ\b", new Object[]{"m", "c", "d", "e", "f", "g", "i", "j", "h", "k"});
            case 3:
                return new aqgl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (aqgl.class) {
                        aorbVar = l;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            l = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
