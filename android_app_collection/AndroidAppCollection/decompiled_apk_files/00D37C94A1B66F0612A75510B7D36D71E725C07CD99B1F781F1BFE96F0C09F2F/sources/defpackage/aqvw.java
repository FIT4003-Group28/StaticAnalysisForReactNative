package defpackage;
/* compiled from: PG */
/* renamed from: aqvw  reason: default package */
/* loaded from: classes2.dex */
public final class aqvw extends aopi implements aoqv {
    public static final aqvw a;
    public static final aopg b;
    private static volatile aorb e;
    public aviu c;
    private int f;
    private byte g = 2;
    public aopu d = emptyProtobufList();

    static {
        aqvw aqvwVar = new aqvw();
        a = aqvwVar;
        aopi.registerDefaultInstance(aqvw.class, aqvwVar);
        b = aopi.newSingularGeneratedExtension(arbf.a, aqvwVar, aqvwVar, null, 1, aosj.MESSAGE, aqvw.class);
    }

    private aqvw() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.g = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"f", "d", aqwd.class, "c"});
            case 3:
                return new aqvw();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aqvw.class) {
                        aorbVar = e;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            e = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
