package defpackage;
/* compiled from: PG */
/* renamed from: arjl  reason: default package */
/* loaded from: classes2.dex */
public final class arjl extends aopi implements aoqv {
    public static final arjl a;
    private static volatile aorb b;
    private int c;
    private arag d;
    private arag e;
    private arag f;
    private arag g;
    private apzg h;
    private ates i;
    private arag j;
    private aoux k;
    private byte l = 2;

    static {
        arjl arjlVar = new arjl();
        a = arjlVar;
        aopi.registerDefaultInstance(arjl.class, arjlVar);
    }

    private arjl() {
        emptyProtobufList();
        aoob aoobVar = aoob.b;
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.l = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0000\b\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\fᐉ\u000e\u000fᐉ\u0004", new Object[]{"c", "d", "e", "f", "h", "i", "j", "k", "g"});
            case 3:
                return new arjl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = b;
                if (aorbVar == null) {
                    synchronized (arjl.class) {
                        aorbVar = b;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            b = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
