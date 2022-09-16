package defpackage;
/* compiled from: PG */
/* renamed from: aqqy  reason: default package */
/* loaded from: classes2.dex */
public final class aqqy extends aopi implements aoqv {
    public static final aqqy a;
    public static final aopg b;
    private static volatile aorb j;
    public int c;
    public long f;
    public long g;
    public aqqx i;
    public String d = "";
    public aopu e = emptyProtobufList();
    public String h = "";

    static {
        aqqy aqqyVar = new aqqy();
        a = aqqyVar;
        aopi.registerDefaultInstance(aqqy.class, aqqyVar);
        b = aopi.newSingularGeneratedExtension(aqwe.a, aqqyVar, aqqyVar, null, 146, aosj.MESSAGE, aqqy.class);
    }

    private aqqy() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဉ\u0004", new Object[]{"c", "d", "e", aqqz.class, "f", "g", "h", "i"});
            case 3:
                return new aqqy();
            case 4:
                return new aopa((char[][][]) null, (float[]) null);
            case 5:
                return a;
            case 6:
                aorb aorbVar = j;
                if (aorbVar == null) {
                    synchronized (aqqy.class) {
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
