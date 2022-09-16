package defpackage;
/* compiled from: PG */
/* renamed from: aqmi  reason: default package */
/* loaded from: classes2.dex */
public final class aqmi extends aopi implements aoqv {
    public static final aqmi a;
    public static final aopg b;
    private static volatile aorb l;
    public int c;
    public awnn h;
    public awmt i;
    public awmt j;
    public aqsz k;
    private byte m = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        aqmi aqmiVar = new aqmi();
        a = aqmiVar;
        aopi.registerDefaultInstance(aqmi.class, aqmiVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, aqmiVar, aqmiVar, null, 183321338, aosj.MESSAGE, aqmi.class);
    }

    private aqmi() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.m = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0004\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0004\nᐉ\t", new Object[]{"c", "d", "e", "f", "g", "i", "j", "h", "k"});
            case 3:
                return new aqmi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = l;
                if (aorbVar == null) {
                    synchronized (aqmi.class) {
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
