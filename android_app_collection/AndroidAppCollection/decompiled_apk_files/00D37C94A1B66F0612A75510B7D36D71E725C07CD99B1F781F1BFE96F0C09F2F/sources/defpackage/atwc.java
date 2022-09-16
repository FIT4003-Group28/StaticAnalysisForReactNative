package defpackage;
/* compiled from: PG */
/* renamed from: atwc  reason: default package */
/* loaded from: classes2.dex */
public final class atwc extends aopi implements aoqv {
    public static final atwc a;
    private static volatile aorb f;
    public int b;
    public Object d;
    public arag e;
    private arag g;
    private atwd h;
    private aunb i;
    public int c = 0;
    private byte j = 2;

    static {
        atwc atwcVar = new atwc();
        a = atwcVar;
        aopi.registerDefaultInstance(atwc.class, atwcVar);
    }

    private atwc() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐼ\u0000\u0004ᐉ\u0000\u0005ᐼ\u0000\u0006ᐉ\u0005", new Object[]{"d", "c", "b", "e", "h", apzg.class, "g", aunb.class, "i"});
            case 3:
                return new atwc();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = f;
                if (aorbVar == null) {
                    synchronized (atwc.class) {
                        aorbVar = f;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            f = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
