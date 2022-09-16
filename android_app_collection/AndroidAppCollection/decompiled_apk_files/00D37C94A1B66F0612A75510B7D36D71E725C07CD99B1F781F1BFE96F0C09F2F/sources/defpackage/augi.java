package defpackage;
/* compiled from: PG */
/* renamed from: augi  reason: default package */
/* loaded from: classes2.dex */
public final class augi extends aopi implements aoqv {
    public static final augi a;
    public static final aopg b;
    private static volatile aorb n;
    public int c;
    public int g;
    public atub i;
    public aweh j;
    public atzc k;
    public float l;
    public atyk m;
    public String d = "";
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        augi augiVar = new augi();
        a = augiVar;
        aopi.registerDefaultInstance(augi.class, augiVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, augiVar, augiVar, null, 387205844, aosj.MESSAGE, augi.class);
    }

    private augi() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tခ\b\nဉ\t", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new augi();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = n;
                if (aorbVar == null) {
                    synchronized (augi.class) {
                        aorbVar = n;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            n = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
