package defpackage;
/* compiled from: PG */
/* renamed from: apds  reason: default package */
/* loaded from: classes.dex */
public final class apds extends aopi implements aoqv {
    public static final apds a;
    private static volatile aorb i;
    public int b;
    public boolean e;
    public apzg f;
    public boolean g;
    private aoux j;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public aoob h = aoob.b;

    static {
        apds apdsVar = new apds();
        a = apdsVar;
        aopi.registerDefaultInstance(apds.class, apdsVar);
    }

    private apds() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ဈ\u0001\u0002ᐉ\u0005\u0003ည\u0006\u0004ဈ\u0000\u0005ᐉ\u0003\u0006ဇ\u0004\u0007ဇ\u0002", new Object[]{"b", "d", "j", "h", "c", "f", "g", "e"});
            case 3:
                return new apds();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (apds.class) {
                        aorbVar = i;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            i = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
