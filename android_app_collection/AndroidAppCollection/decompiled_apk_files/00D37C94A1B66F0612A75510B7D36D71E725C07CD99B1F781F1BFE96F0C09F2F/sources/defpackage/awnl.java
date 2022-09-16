package defpackage;
/* compiled from: PG */
/* renamed from: awnl  reason: default package */
/* loaded from: classes2.dex */
public final class awnl extends aopi implements aoqv {
    public static final awnl a;
    public static final aopg b;
    private static volatile aorb h;
    public int c;
    public awma d;
    public int e;
    public boolean f;
    public int g;
    private byte i = 2;

    static {
        awnl awnlVar = new awnl();
        a = awnlVar;
        aopi.registerDefaultInstance(awnl.class, awnlVar);
        b = aopi.newSingularGeneratedExtension(awon.a, awnlVar, awnlVar, null, 194116769, aosj.MESSAGE, awnl.class);
    }

    private awnl() {
    }

    @Override // defpackage.aopi
    protected final Object dynamicMethod(aoph aophVar, Object obj, Object obj2) {
        aoph aophVar2 = aoph.GET_MEMOIZED_IS_INITIALIZED;
        byte b2 = 1;
        switch (aophVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b2 = 0;
                }
                this.i = b2;
                return null;
            case 2:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0004ဇ\u0003\u0005င\u0004", new Object[]{"c", "d", "e", "f", "g"});
            case 3:
                return new awnl();
            case 4:
                return new aopa(a);
            case 5:
                return a;
            case 6:
                aorb aorbVar = h;
                if (aorbVar == null) {
                    synchronized (awnl.class) {
                        aorbVar = h;
                        if (aorbVar == null) {
                            aorbVar = new aopb(a);
                            h = aorbVar;
                        }
                    }
                }
                return aorbVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
