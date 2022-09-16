package defpackage;
/* compiled from: PG */
/* renamed from: apht  reason: default package */
/* loaded from: classes.dex */
public final class apht extends aopi implements aoqv {
    public static final apht a;
    private static volatile aorb i;
    public boolean f;
    private int j;
    private byte k = 2;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public aopu g = emptyProtobufList();
    public aopu h = emptyProtobufList();

    static {
        apht aphtVar = new apht();
        a = aphtVar;
        aopi.registerDefaultInstance(apht.class, aphtVar);
    }

    private apht() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0002\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဇ\u0006\u0006Л\bЛ", new Object[]{"j", "b", "c", "d", "e", "f", "g", apzg.class, "h", apzg.class});
            case 3:
                return new apht();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (apht.class) {
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
