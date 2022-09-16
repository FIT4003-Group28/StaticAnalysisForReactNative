package defpackage;
/* compiled from: PG */
/* renamed from: asoa  reason: default package */
/* loaded from: classes2.dex */
public final class asoa extends aopi implements aoqv {
    public static final asoa a;
    public static final aopg b;
    private static volatile aorb g;
    public int c;
    public apzg e;
    public apzg f;
    private byte h = 2;
    public String d = "";

    static {
        asoa asoaVar = new asoa();
        a = asoaVar;
        aopi.registerDefaultInstance(asoa.class, asoaVar);
        b = aopi.newSingularGeneratedExtension(apzg.a, asoaVar, asoaVar, null, 350823535, aosj.MESSAGE, asoa.class);
    }

    private asoa() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.h = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e", "f"});
            case 3:
                return new asoa();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = g;
                if (aorbVar == null) {
                    synchronized (asoa.class) {
                        aorbVar = g;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            g = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
