package defpackage;
/* compiled from: PG */
/* renamed from: aqpz  reason: default package */
/* loaded from: classes2.dex */
public final class aqpz extends aopi implements aoqv {
    public static final aqpz a;
    public static final aopg b;
    private static volatile aorb h;
    public int c;
    private awpc i;
    private awpc j;
    private byte k = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        aqpz aqpzVar = new aqpz();
        a = aqpzVar;
        aopi.registerDefaultInstance(aqpz.class, aqpzVar);
        b = aopi.newSingularGeneratedExtension(awnc.a, aqpzVar, aqpzVar, null, 373468381, aosj.MESSAGE, aqpz.class);
    }

    private aqpz() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.k = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0003\b\u0006\u0000\u0000\u0002\u0003ဈ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ဈ\u0006\u0007ဈ\u0007\bဈ\b", new Object[]{"c", "d", "i", "j", "e", "f", "g"});
            case 3:
                return new aqpz();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (aqpz.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
