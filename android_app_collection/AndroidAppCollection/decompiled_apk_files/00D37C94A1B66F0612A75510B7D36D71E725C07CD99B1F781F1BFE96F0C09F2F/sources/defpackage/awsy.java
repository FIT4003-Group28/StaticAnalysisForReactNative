package defpackage;
/* compiled from: PG */
/* renamed from: awsy  reason: default package */
/* loaded from: classes2.dex */
public final class awsy extends aopi implements aoqv {
    public static final awsy a;
    public static final aopg b;
    private static volatile aorb h;
    public int c;
    public awnn d;
    public awnn e;
    private byte i = 2;
    public aopu f = emptyProtobufList();
    public String g = "";

    static {
        awsy awsyVar = new awsy();
        a = awsyVar;
        aopi.registerDefaultInstance(awsy.class, awsyVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awsyVar, awsyVar, null, 352829283, aosj.MESSAGE, awsy.class);
    }

    private awsy() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဈ\u0002", new Object[]{"c", "d", "e", "f", awnn.class, "g"});
            case 3:
                return new awsy();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (awsy.class) {
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
