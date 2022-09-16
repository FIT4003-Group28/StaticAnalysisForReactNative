package defpackage;
/* compiled from: PG */
/* renamed from: awsq  reason: default package */
/* loaded from: classes2.dex */
public final class awsq extends aopi implements aoqv {
    public static final awsq a;
    public static final aopg b;
    private static volatile aorb j;
    public int c;
    public awnn d;
    public awnn e;
    public awmt h;
    public boolean i;
    private byte k = 2;
    public aopu f = emptyProtobufList();
    public String g = "";

    static {
        awsq awsqVar = new awsq();
        a = awsqVar;
        aopi.registerDefaultInstance(awsq.class, awsqVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awsqVar, awsqVar, null, 278463287, aosj.MESSAGE, awsq.class);
    }

    private awsq() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဈ\u0002\u0005ᐉ\u0003\u0007ဇ\u0005", new Object[]{"c", "d", "e", "f", awnn.class, "g", "h", "i"});
            case 3:
                return new awsq();
            case 4:
                return new aopa((boolean[]) null, (byte[][]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (awsq.class) {
                        aorbVar = j;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            j = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
