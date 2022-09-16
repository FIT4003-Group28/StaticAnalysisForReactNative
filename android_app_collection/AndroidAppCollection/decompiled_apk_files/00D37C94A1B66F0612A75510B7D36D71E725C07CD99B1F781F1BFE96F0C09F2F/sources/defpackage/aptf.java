package defpackage;
/* compiled from: PG */
/* renamed from: aptf  reason: default package */
/* loaded from: classes2.dex */
public final class aptf extends aopi implements aoqv {
    public static final aptf a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public aptg d;
    private byte f = 2;

    static {
        aptf aptfVar = new aptf();
        a = aptfVar;
        aopi.registerDefaultInstance(aptf.class, aptfVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, aptfVar, aptfVar, null, 378640040, aosj.MESSAGE, aptf.class);
    }

    private aptf() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.f = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"c", "d"});
            case 3:
                return new aptf();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aptf.class) {
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
