package defpackage;
/* compiled from: PG */
/* renamed from: awsn  reason: default package */
/* loaded from: classes2.dex */
public final class awsn extends aopi implements aoqv {
    public static final awsn a;
    public static final aopg b;
    private static volatile aorb c;
    private byte d = 2;

    static {
        awsn awsnVar = new awsn();
        a = awsnVar;
        aopi.registerDefaultInstance(awsn.class, awsnVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awsnVar, awsnVar, null, 334455667, aosj.MESSAGE, awsn.class);
    }

    private awsn() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new awsn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = c;
                if (aorbVar == null) {
                    synchronized (awsn.class) {
                        aorbVar = c;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            c = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
