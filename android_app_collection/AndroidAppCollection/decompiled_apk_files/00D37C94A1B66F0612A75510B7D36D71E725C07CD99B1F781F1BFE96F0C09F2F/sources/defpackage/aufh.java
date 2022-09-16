package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: aufh  reason: default package */
/* loaded from: classes2.dex */
public final class aufh extends aopi implements aoqv {
    public static final aufh a;
    public static final aopg b;
    private static volatile aorb e;
    public int c;
    public awnn d;
    private byte f = 2;

    static {
        aufh aufhVar = new aufh();
        a = aufhVar;
        aopi.registerDefaultInstance(aufh.class, aufhVar);
        b = aopi.newSingularGeneratedExtension(awmt.a, aufhVar, aufhVar, null, 202698262, aosj.MESSAGE, aufh.class);
    }

    private aufh() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case 3:
                return new aufh();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = e;
                if (aorbVar == null) {
                    synchronized (aufh.class) {
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
