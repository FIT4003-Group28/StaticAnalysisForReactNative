package defpackage;
/* compiled from: PG */
/* renamed from: awkr  reason: default package */
/* loaded from: classes2.dex */
public final class awkr extends aopi implements aoqv {
    public static final awkr a;
    public static final aopg b;
    private static volatile aorb i;
    public int c;
    public int e;
    public awky f;
    public awjj g;
    private byte j = 2;
    public aoob d = aoob.b;
    public String h = "";

    static {
        awkr awkrVar = new awkr();
        a = awkrVar;
        aopi.registerDefaultInstance(awkr.class, awkrVar);
        b = aopi.newSingularGeneratedExtension(atrc.b, awkrVar, awkrVar, null, 301414196, aosj.MESSAGE, awkr.class);
    }

    private awkr() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.j = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ည\u0000\u0002ဌ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဈ\u0004", new Object[]{"c", "d", "e", attl.a(), "f", "g", "h"});
            case 3:
                return new awkr();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = i;
                if (aorbVar == null) {
                    synchronized (awkr.class) {
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
