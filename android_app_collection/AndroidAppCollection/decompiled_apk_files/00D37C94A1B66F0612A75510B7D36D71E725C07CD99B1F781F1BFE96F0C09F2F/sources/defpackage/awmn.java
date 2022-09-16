package defpackage;
/* compiled from: PG */
/* renamed from: awmn  reason: default package */
/* loaded from: classes2.dex */
public final class awmn extends aopi implements aoqv {
    public static final awmn a;
    public static final aopg b;
    private static volatile aorb j;
    public int c;
    public int d;
    public float e;
    public int g;
    public awml i;
    public boolean f = true;
    public String h = "";

    static {
        awmn awmnVar = new awmn();
        a = awmnVar;
        aopi.registerDefaultInstance(awmn.class, awmnVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, awmnVar, awmnVar, null, 281539545, aosj.MESSAGE, awmn.class);
    }

    private awmn() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"c", "d", "e", "f", "g", awkk.i, "h", "i"});
            case 3:
                return new awmn();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (awmn.class) {
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
